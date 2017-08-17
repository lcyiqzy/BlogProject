package blogProject.restapi.service.impl;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import blogProject.commons.utils.MD5Util;
import blogProject.manager.bean.TUser;
import blogProject.manager.dao.TUserMapper;
import blogProject.manager.example.TUserExample;
import blogProject.manager.example.TUserExample.Criteria;
import blogProject.restapi.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	TUserMapper userMapper;

	public TUser login(TUser user) {
		System.out.println("接到的user:" + user);
		String pwdStr = MD5Util.digest(user.getUserPassword());
		System.out.println("pwdStr:" + pwdStr);

		TUserExample example = new TUserExample();

		Criteria criteria = example.createCriteria();
		criteria.andUserEmailEqualTo(user.getUserEmail());
		criteria.andUserPasswordEqualTo(pwdStr);

		List<TUser> list = userMapper.selectByExample(example);
		System.out.println("list:" + list);
		return list.size() == 1 ? list.get(0) : null;
	}

	public boolean regist(TUser user) {
		System.out.println("接到的需要注册的user:" + user);
		String pwdStr = MD5Util.digest(user.getUserPassword());

		// 加密密码保存
		user.setUserPassword(pwdStr);
		// 账号是唯一约束,这里我是用自动生成一个,主要还是邮箱登陆
		String acctStr = UUID.randomUUID().toString().replace("-", "").substring(0, 8);
		user.setUserLonginacct(acctStr);
		// 设置用户名,跟生成的账号一样
		user.setUserName(user.getUserLonginacct());
		// 注册的邮箱帐号
		user.setUserEmail(user.getUserEmail());
		// 邮箱激活: 0:未激活 1::已激活
		user.setRegistState(0);
		// 权限等级: 1:普通用户, 2: 主播, 3:管理员
		user.setUserPermission(1);
		// 注册时时间
		user.setRegistDate(new Date());

		// Calendar c = Calendar.getInstance();
		// // 现在的时间(单位：毫秒)
		// Long time = c.getTimeInMillis();
		
		//创建加密激活码
		String regCode = MD5Util.digest(user.getUserEmail() + user.getRegistDate());
		user.setRegistCode(regCode);
		System.out.println("加密过的激活码：" + regCode);

		// 过期时间为半小时后
		// Long token_exptime = time + 1000 * 60;
		// System.out.println("过期时间:" + token_exptime);

		// 这里有可能会是数据库添加失败
		try {
			int i = userMapper.insertSelective(user);
			if (i > 0) {
				return sendActivateEmail(user);
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		return false;
	}

	/**
	 * 发送注册邮箱激活链接
	 * 
	 * @param user
	 * @return
	 */
	public boolean sendActivateEmail(TUser user) {
		if (user != null) {

			StringBuilder sb = new StringBuilder("复制下面链接在浏览器打开激活账号，30分钟生效，否则重新注册账号，链接只能使用一次，请尽快激活！</br>");
			sb.append("<a href=\"http://localhost:8081/blogProject-portal/user/activate?userEmail=")
					.append(user.getUserEmail()).append("&validateCode=").append(user.getRegistCode())
					.append("\">http://localhost:8081/blogProject-portal/user/activate?userEmail=")
					.append(user.getUserEmail()).append("&validateCode=").append(user.getRegistCode()).append("</a>");

			System.out.println("邮件内容：" + sb.toString());

			HtmlEmail htmlEmail = new HtmlEmail();
			// 设置主机名，远程服务器的主机名
			htmlEmail.setHostName("localhost");
			// 自定义的ip，一定要手动设置好端口号
			htmlEmail.setSmtpPort(25);
			// 设置登陆服务器的帐号跟密码
			htmlEmail.setAuthentication("admin@atguigu.com", "123456");
			// 设置发送给谁
			try {
				htmlEmail.addTo("xsb@atguigu.com");
				// 设置来源
				htmlEmail.setFrom("admin@atguigu.com");
				// 设置邮件标题
				htmlEmail.setSubject("轻博客帐号激活");
				// 设置邮件内容
				htmlEmail.setContent(sb.toString(), "text/html;charset=utf-8");
				// 发送邮件
				htmlEmail.send();
			} catch (EmailException e) {
				System.out.println("邮件发送失败：" + e);
				return false;
			}
			return true;
		}
		return false;
	}

	/**
	 * 查找邮箱
	 */
	public TUser find(String email) {
		TUserExample example = new TUserExample();
		Criteria criteria = example.createCriteria();
		criteria.andUserEmailEqualTo(email);
		List<TUser> list = userMapper.selectByExample(example);
		return list.size() == 1 ? list.get(0) : null;
	}
	
	/**
	 * 更新用户状态码
	 */
	public boolean updateStatus(TUser user) {
		//设置状态为1
		user.setRegistState(1);
		return userMapper.updateByPrimaryKeySelective(user) > 0;
	}
	
	/**
	 * 删除注册激活码
	 */
	public void deleteRegistCode(String registCode) {
		System.out.println("registCode:" + registCode);
		//int i = userMapper.delRegistCode(registCode);
		userMapper.delRegistCode(registCode);
	}

}

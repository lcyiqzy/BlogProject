package blogProject.restapi.service;

import java.util.List;

import blogProject.manager.bean.TPermission;
import blogProject.manager.bean.TUser;

public interface UserService {
	
	public TUser login(TUser user);

	public boolean regist(TUser user);

	public TUser find(String email);

	public boolean updateStatus(TUser user);

	public void deleteRegistCode(String registCode);

	public List<TPermission> findPermission(Integer userPermission);
}

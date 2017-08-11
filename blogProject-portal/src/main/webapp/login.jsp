<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title></title>
<!--<meta name="keywords" content="盒老师">
	<meta name="content" content="盒老师">-->
<meta http-equiv="X-UA-Compatible" content="IE=edge, chrome=1">
<link type="text/css" rel="stylesheet" href="${ctp}/css/login.css">
<script type="text/javascript" src="${ctp}/js/jquery-1.11.1.min.js"></script>
<script src="${ctp}/js/bootstrap.min.js"></script>

</head>
<body class="login_bj">
	<div class="zhuce_body">
		<div class="logo">
			<!--<a href="${ctp}/#"><img src="${ctp}/images/logo.png" width="114" height="54" border="0"></a>-->
			<!--<h1>轻博客</h1>-->
		</div>
		<div class="zhuce_kong login_kuang">
			<div class="zc">
				<div class="bj_bai">
					<h3>登录</h3>
					<form action="${ctp}/login" method="post">
						<input name="userEmail" type="text" class="kuang_txt"
							placeholder="邮箱"> <input name="userPassword" type="text"
							class="kuang_txt" placeholder="密码">
						<div>
							<a href="${ctp}/#">忘记密码？</a><input name="" type="checkbox"
								value="" checked><span>记住我</span>
						</div>
						<input type="submit" class="btn_zhuce" value="登录">
					</form>
				</div>
				<div class="bj_right">
					<div>
						<a href="index.html"><img src="images/icon_close4.png"
							align="right"></a>
					</div>
					<p>使用以下账号直接登录</p>
					<a href="${ctp}/#" class="zhuce_qq">QQ登录</a> <a href="${ctp}/#"
						class="zhuce_wb">微博登录</a> <a href="${ctp}/#" class="zhuce_wx">微信登录</a>
					<p>
						没有账号？<a href="${ctp}/register.jsp">立即注册</a>
					</p>
				</div>

			</div>


			<P>GentlyBlog.com&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;欢迎来到轻博客！</P>
		</div>

	</div>
	<script>
		
	</script>


</body>
</html>
>

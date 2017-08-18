<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title></title>
<meta http-equiv="X-UA-Compatible" content="IE=edge, chrome=1">
<link type="text/css" rel="stylesheet" href="${ctp}/css/login.css">

<!-- CSS -->
<link rel="stylesheet" href="${ctp}/assets/css/reset.css">
<link rel="stylesheet" href="${ctp}/assets/css/supersized.css">
<link rel="stylesheet" href="${ctp}/assets/css/style.css">

</head>
<body class="login_bj">
	<div class="zhuce_body">
		<div class="logo">
<%-- 			<a href="${ctp}/#"><img src="${ctp}/images/logo.png" width="114" height="54" border="0"></a> --%>
			<h1><a style="text-decoration: none" href="${ctp }/index.jsp">轻博客</a></h1>
		</div>
		<div class="zhuce_kong login_kuang">
			<div class="zc">
				<div class="form">
					<h1>
						登录
					</h1>
					<form id="loginForm" action="${ctp}/user/login" method="post">
						<input type="email" name="userEmail" class="username"
							placeholder="邮箱" required autocomplete="off"> 
						<span class="errorInfo" style="color: red;">${msg }</span> 
						<input type="password" name="userPassword" class="password" 
							placeholder="密码" required autocomplete="off"> 
						<span class="errorInfo" style="color: red;"></span>

						<button type="submit">登录</button>
						<br/>
						<br/>
						<label style="float: left;"> <a href="${ctp}/forgetpwd.html">忘记密码</a> </label> 
						<label style="float: right"> <a href="${ctp}/register.jsp">我要注册</a> </label>
<!-- 						<div class="error"> -->
<!-- 							<span>+</span> -->
<!-- 						</div> -->
					</form>
					<div class="connect">
						<br/>
						<br/>
						<br/>
						<p>GentlyBlog.com&nbsp;&nbsp;&nbsp;&nbsp;欢迎来到轻博客！</p>
					</div>
				</div>

			</div>



		</div>

	</div>

	<!-- script  -->
	<script type="text/javascript" src="${ctp}/js/jquery-1.11.1.min.js"></script>
	<script src="${ctp}/js/bootstrap.min.js"></script>
	<script src="${ctp}/js/jquery.validate.min.js"></script>
	<script src="${ctp}/assets/js/login_register.js"></script>

	<script type="text/javascript">
	</script>

</body>
</html>


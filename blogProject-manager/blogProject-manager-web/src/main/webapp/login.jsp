<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!doctype html>
<html lang="utf-8">
<head>
<meta charset="UTF-8">
<title></title>
<meta http-equiv="X-UA-Compatible" content="IE=edge, chrome=1">
<%@ include file="/WEB-INF/includes/common-css.jsp" %>
<%@ include file="/WEB-INF/includes/common-js.jsp" %>
<style type="text/css">
body{
    background-image: url("assets/img/20101001162251-2075887795.jpg")no-repeat;
}
</style>
</head>
<body class="login_bj">
	<div class="zhuce_body">
		<div class="zhuce_kong login_kuang">
			<div class="zc">
				<div class="bj_bai">
					<h3>登录</h3>
					<form action="${ctp}/usermanager/login" method="post">
						<input name="userLonginacct" type="text" class="kuang_txt"
							placeholder="用户名">
						 <input name="userPassword" type="text"
							class="kuang_txt" placeholder="密码">
						<div>
							<a href="${ctp}/#">忘记密码？</a><input name="" type="checkbox"
								value="" checked><span>记住我</span>
						</div>
						<input type="submit" class="btn_zhuce" value="登录">
					</form>
				</div>
			</div>

		</div>

	</div>

</body>
</html>

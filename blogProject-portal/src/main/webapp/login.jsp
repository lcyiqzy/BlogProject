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
    <link type="text/css" rel="stylesheet" href="css/login.css">
    <script type="text/javascript" src="js/jquery-1.8.0.min.js"></script>
    <script src="bootstrap/js/bootstrap.min.js"></script>

</head>
<body class="login_bj" >
<div class="zhuce_body">
	<div class="logo">
		<!--<a href="#"><img src="images/logo.png" width="114" height="54" border="0"></a>-->
		<!--<h1>轻博客</h1>-->
	</div>
    <div class="zhuce_kong login_kuang">
    	<div class="zc">
        	<div class="bj_bai">
            <h3>登录</h3>
       	  	  <form action="" method="get">
                <input name="" type="text" class="kuang_txt"  placeholder="邮箱">
                <input name="" type="text" class="kuang_txt"  placeholder="密码">
                <div>
               		<a href="#">忘记密码？</a><input name="" type="checkbox" value="" checked><span>记住我</span> 
                </div>
                <input name="登录" type="button" class="btn_zhuce" value="登录" onclick="dologin()">
                
                </form>
            </div>
        	<div class="bj_right">
            	<p>使用以下账号直接登录</p>
                <a href="#" class="zhuce_qq">QQ登录</a>
                <a href="#" class="zhuce_wb">微博登录</a>
                <a href="#" class="zhuce_wx">微信登录</a>
                <p>没有账号？<a href="register.html">立即注册</a></p>
            
            </div>
        </div>
         <P>GentlyBlog.com&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;欢迎来到轻博客！</P>
    </div>

</div>
 <script>
    function dologin() {
      
            window.location.href = "find.html";
        
    }
 </script>

    
</body>
</html>>
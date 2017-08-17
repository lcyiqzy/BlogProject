<%@page import="java.io.BufferedReader"%>  
<%@page import="java.io.FileReader"%>  
<%@page import="java.io.File"%>  
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<!--<head>
<title>Singlepage</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="" />
<script type="applijewelleryion/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<link href="css/bootstrap.css" rel='stylesheet' type='text/css' />
<!-- Custom Theme files -->
<!--
<link href="css/style.css" rel='stylesheet' type='text/css' />	
<script src="js/jquery-1.11.1.min.js"></script>
<script src="js/bootstrap.min.js"></script>-->



<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<title>Law &mdash; Free Website Template, Free HTML5 Template by freehtml5.co</title>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta name="description" content="Free HTML5 Website Template by FreeHTML5.co" />
	<meta name="keywords" content="free website templates, free html5, free template, free bootstrap, free website template, html5, css3, mobile first, responsive" />
	

	

  	<!-- Facebook and Twitter integration -->
	<meta property="og:title" content=""/>
	<meta property="og:image" content=""/>
	<meta property="og:url" content=""/>
	<meta property="og:site_name" content=""/>
	<meta property="og:description" content=""/>
	<meta name="twitter:title" content="" />
	<meta name="twitter:image" content="" />
	<meta name="twitter:url" content="" />
	<meta name="twitter:card" content="" />

	<link href="https://fonts.googleapis.com/css?family=Work+Sans:300,400,500,700,800" rel="stylesheet">
	
	<!-- Animate.css -->
	<link rel="stylesheet" href="css/animate.css">
	<!-- Icomoon Icon Fonts-->
	<link rel="stylesheet" href="css/icomoon.css">
	<!-- Bootstrap  -->
	<link rel="stylesheet" href="css/bootstrap.css">

	<!-- Magnific Popup -->
	<link rel="stylesheet" href="css/magnific-popup.css">

	<!-- Owl Carousel  -->
	<link rel="stylesheet" href="css/owl.carousel.min.css">
	<link rel="stylesheet" href="css/owl.theme.default.min.css">
	<!-- Flexslider  -->
	<link rel="stylesheet" href="css/flexslider.css">

	<!-- Theme style  -->
	<link rel="stylesheet" href="css/style.css">

	<!-- Modernizr JS -->
	<script src="js/modernizr-2.6.2.min.js"></script>
	<!-- FOR IE9 below -->
	<!--[if lt IE 9]>
	<script src="js/respond.min.js"></script>
	<![endif]-->

</head>
<body>
  		<%  
        File file = new File("D:/1.txt");  
        FileReader fr = new FileReader(file);  //字符输入流  
        BufferedReader br = new BufferedReader(fr);  //使文件可按行读取并具有缓冲功能  
        StringBuffer strB = new StringBuffer();   //strB用来存储jsp.txt文件里的内容  
        String str = br.readLine();  
        while(str!=null){  
            strB.append(str).append("<br>");   //将读取的内容放入strB  
            str = br.readLine();  
        }  
   	     br.close();    //关闭输入流  
    	%>  
<div class="fh5co-loader"></div>
	<div id="page">
	<nav class="fh5co-nav" role="navigation">
		<div class="top-menu">
			<div class="container">
				<div class="row">
					<div class="col-xs-2">
						<div id="fh5co-logo"><a href="index.jsp">轻博客<span>.</span></a></div>
					</div>
					<div class="col-xs-10 text-right menu-1">
						<ul>
							<li ><a href="index.jsp">首页</a></li>
							<li><a href="blog.jsp">写博客</a>
							<!--<li><a href="find.jsp">发现</a></li>
							<li><a href="like.jsp">关注</a></li>-->
							<!--<li><a href="won.jsp">Won Cases</a></li>
							<li class="has-dropdown">
								<a href="blog.jsp">Blog</a>
								<ul class="dropdown">
									<li><a href="#">Web Design</a></li>
									<li><a href="#">eCommerce</a></li>
									<li><a href="#">Branding</a></li>
									<li><a href="#">API</a></li>
								</ul>
							</li>
							<li><a href="about.jsp">About</a></li>
							<li><a href="contact.jsp">Contact</a></li>-->
							<li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</li>
						 <li class="btn-cta"><a href="register.jsp"><span>注册</span></a></li>
						 <li class="btn-cta"><a href="login.jsp"><span>登录</span></a></li>
						</ul>
					</div>
				</div>
				
			</div>
		</div>
	</nav>
	<aside id="fh5co-hero" class="js-fullheight">
		<div class="flexslider js-fullheight">
			<ul class="slides">
		   	<li style="background-image: url(images/img_bg_1.jpg);">
		   		<div class="overlay-gradient"></div>
		   		<div class="container">
		   			<div class="row">
			   			<div class="col-md-8 col-md-offset-2 text-center js-fullheight slider-text">
			   				<div class="slider-text-inner">
									<h1>霍乱时期的爱情</h1>
										<h2>“我对死亡感到唯一的痛苦，是没能为爱而死。”软弱者永远爱情的王国，爱情的王国是无情和吝啬的，女人们只肯委身于那些敢做敢为的男子汉，正是这样的男子汉能使她们得到她们所渴望的安全感，使她们能正视生活。</h2>
										<p><a  class="btn btn-primary btn-lg" href="singlepage.jsp">阅读全文</a></p>
			   				</div>
			   			</div>
			   		</div>
		   		</div>
		   	</li>
		   	<li style="background-image: url(images/img_bg_2.jpg);">
		   		<div class="overlay-gradient"></div>
		   		<div class="container">
		   			<div class="row">
			   			<div class="col-md-8 col-md-offset-2 text-center js-fullheight slider-text">
			   				<div class="slider-text-inner">
			   					<h1>「不思考」的零秒思考艺术</h1>
										<h2>零秒思考，并不是真的不思考，而是思考速度很快，快到感觉不到。什么样的思考能够达到这种境界呢？换个字眼，那就是直觉思考。所谓零秒思考，就是让你的思考变成一种直觉，遇到问题时，直觉反应出解决方案，甚至能看到结果。</h2>
										<p><a  class="btn btn-primary btn-lg" href="singlepage.jsp">阅读全文</a></p>
			   				</div>
			   			</div>
			   		</div>
		   		</div>
		   	</li>
		   	<li style="background-image: url(images/img_bg_3.jpg);">
		   		<div class="overlay-gradient"></div>
		   		<div class="container">
		   			<div class="row">
			   			<div class="col-md-8 col-md-offset-2 text-center js-fullheight slider-text">
			   				<div class="slider-text-inner">
			   					<h1>旅行路上，你在做什么</h1>
										<h2>开始喜欢旅行，似乎是很久以前的事情了。对于旅行的热爱，最初是因为什么，现在我已经记得不太清楚了。不过我仍然记得第一次出门旅行的样子，那是4岁的时候，至少我记得是那个时候。</h2>
										<p><a  class="btn btn-primary btn-lg" href="singlepage.jsp">阅读全文</a></p>
			   				</div>
			   			</div>
			   		</div>
		   		</div>
		   	</li>		   	
		  	</ul>
	  	</div>
	</aside>

<!-- banner -->


	<!-- technology-left -->
	<div class="technology">
	<div class="container">
		<div class="col-md-9 technology-left">
			<div class="agileinfo">

		  <h2 class="w3">SINGLE PAGE</h2>
			<div class="single">
			   <img src="images/sing-1.jpg" class="img-responsive" alt="">
			    <div class="b-bottom"> 
			      <h5 class="top">What turn out consetetur sadipscing elit</h5>
				   <p class="sub">
				    <%=strB %>  
				   </p>
			      <p>On Aug 01 <a class="span_link" href="#"><span class="glyphicon glyphicon-comment"></span>0 </a><a class="span_link" href="#"><span class="glyphicon glyphicon-eye-open"></span>56 </a></p>
				 
				</div>
			 </div>
			  

						<div class="response">
					<h4>精彩评论</h4>
					<div class="media response-info">
						<div class="media-left response-text-left">
							<a href="#">
								<img src="images/sin1.jpg" class="img-responsive" alt="">
							</a>
						</div>
						<div class="media-body response-text-right">
							<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit,There are many variations of passages of Lorem Ipsum available, 
								sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>
							<ul>
								<li>Jun 21, 2016</li>
								
							</ul>
							<div class="media response-info">
								<div class="media-left response-text-left">
									<a href="#">
										<img src="images/sin2.jpg" class="img-responsive" alt="">
									</a>
								</div>
								<div class="media-body response-text-right">
									<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit,There are many variations of passages of Lorem Ipsum available, 
										sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>
									<ul>
										<li>July 17, 2016</li>
										
									</ul>		
								</div>
								<div class="clearfix"> </div>
							</div>
						</div>
						<div class="clearfix"> </div>
					</div>
					<div class="media response-info">
						<div class="media-left response-text-left">
							<a href="#">
								<img src="images/sin1.jpg" class="img-responsive" alt="">
							</a>
						</div>
						<div class="media-body response-text-right">
							<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit,There are many variations of passages of Lorem Ipsum available, 
								sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>
							<ul>
								<li>Jul 22, 2016</li>
								
							</ul>
							<div class="media response-info">
								<div class="media-left response-text-left">
									<a href="#">
										<img src="images/sin2.jpg" class="img-responsive" alt="">
									</a>
								</div>
								<div class="media-body response-text-right">
									<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit,There are many variations of passages of Lorem Ipsum available, 
										sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>
									<ul>
										<li>Aug 01, 2016</li>
										
									</ul>		
								</div>
								<div class="clearfix"> </div>
							</div>
						</div>
						<div class="clearfix"> </div>
					</div>
				</div>	
				<div class="coment-form">
					<h4>留下你的评论</h4>
					<form action="#" method="post">
						<input type="text" value="Name " name="name" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Name';}" required="">
						<input type="email" value="Email" name="email" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Email';}" required="">
						<input type="text" value="Website" name="websie" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Website';}" required="">
						<textarea onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Your Comment...';}" required="">Your Comment...</textarea>
						<input type="submit" value="提交">
					</form>
				</div>	
				<div class="clearfix"></div>
			</div>
		</div>
		<!-- technology-right -->
		<div class="col-md-3 technology-right">
				
				
				<div class="blo-top1">
							
					<div class="tech-btm">
					<div class="search-1">
							<form action="#" method="post">
								<input type="search" name="Search" value="Search" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Search';}" required="">
								<input type="submit" value=" ">
							</form>
						</div>
					<h4>热门排行 </h4>
						<div class="blog-grids">
							<div class="blog-grid-left">
								<a href="singlepage.jsp"><img src="images/t2.jpg" class="img-responsive" alt=""></a>
							</div>
							<div class="blog-grid-right">
								
								<h5><a href="singlepage.jsp">Pellentesque dui Maecenas male</a> </h5>
							</div>
							<div class="clearfix"> </div>
						</div>
						<div class="blog-grids">
							<div class="blog-grid-left">
								<a href="singlepage.jsp"><img src="images/m2.jpg" class="img-responsive" alt=""></a>
							</div>
							<div class="blog-grid-right">
								
								<h5><a href="singlepage.jsp">Pellentesque dui Maecenas male</a> </h5>
							</div>
							<div class="clearfix"> </div>
						</div>
						<div class="blog-grids">
							<div class="blog-grid-left">
								<a href="singlepage.jsp"><img src="images/f2.jpg" class="img-responsive" alt=""></a>
							</div>
							<div class="blog-grid-right">
								
								<h5><a href="singlepage.jsp">Pellentesque dui Maecenas male</a> </h5>
							</div>
							<div class="clearfix"> </div>
						</div>
						<div class="blog-grids">
							<div class="blog-grid-left">
								<a href="singlepage.jsp"><img src="images/t3.jpg" class="img-responsive" alt=""></a>
							</div>
							<div class="blog-grid-right">
								
								<h5><a href="singlepage.jsp">Pellentesque dui Maecenas male</a> </h5>
							</div>
							<div class="clearfix"> </div>
						</div>
						<div class="blog-grids">
							<div class="blog-grid-left">
								<a href="singlepage.jsp"><img src="images/m3.jpg" class="img-responsive" alt=""></a>
							</div>
							<div class="blog-grid-right">
								
								<h5><a href="singlepage.jsp">Pellentesque dui Maecenas male</a> </h5>
							</div>
							<div class="clearfix"> </div>
						</div>
						<div class="insta">
					<h4>博客分类</h4>
						<ul>
							
							<li><a href="singlepage.jsp"><img src="images/t1.jpg" class="img-responsive" alt=""></a></li>
							<li><a href="singlepage.jsp"><img src="images/m1.jpg" class="img-responsive" alt=""></a></li>
							<li><a href="singlepage.jsp"><img src="images/f1.jpg" class="img-responsive" alt=""></a></li>
							<li><a href="singlepage.jsp"><img src="images/m2.jpg" class="img-responsive" alt=""></a></li>
							<li><a href="singlepage.jsp"><img src="images/f2.jpg" class="img-responsive" alt=""></a></li>
							<li><a href="singlepage.jsp"><img src="images/t2.jpg" class="img-responsive" alt=""></a></li>
							<li><a href="singlepage.jsp"><img src="images/f3.jpg" class="img-responsive" alt=""></a></li>
							<li><a href="singlepage.jsp"><img src="images/t3.jpg" class="img-responsive" alt=""></a></li>
							<li><a href="singlepage.jsp"><img src="images/m3.jpg" class="img-responsive" alt=""></a></li>
						</ul>
					</div>
					
					<p>Lorem ipsum ex vix illud nonummy, novum tation et his. At vix scripta patrioque scribentur, at pro</p>
					</div>
					
					
					
				</div>
				
			
		</div>
		<div class="clearfix"></div>
		<!-- technology-right -->
	</div>
</div>
<div class="footer">
		<div class="container">
			<div class="col-md-4 footer-left">
				<h4>About Me</h4>
				<p>Consectetur adipisicing Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod .</p>
				<img src="images/t4.jpg" class="img-responsive" alt="">
					<div class="bht1">
						<a href="singlepage.jsp">Read More</a>
					</div>
			</div>
			<div class="col-md-4 footer-middle">
			<h4>Latest Tweet</h4>
			<div class="mid-btm">
				<p>Sed do eiusmod tempor Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod .</p>
				<a href="http://sc.chinaz.com/">http://sc.chinaz.com/</a>
			</div>
			
				<p>Consectetur adipisicing Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod .</p>
				<a href="http://sc.chinaz.com/">http://sc.chinaz.com/</a>
		
			</div>
			<div class="col-md-4 footer-right">
				<h4>Newsletter</h4>
				<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt</p>
						<div class="name">
							<form action="#" method="post">
								<input type="text" placeholder="Your Name" required="">
								<input type="text" placeholder="Your Email" required="">
								<input type="submit" value="Subscribed Now">
							</form>
						
						</div>	
						
							<div class="clearfix"> </div>
					
			</div>
			<div class="clearfix"></div>
		</div>
	</div>
	<div class="copyright">
				<div class="container">
					<p>Copyright &copy; 2016.Company name All rights reserved.<a target="_blank" href="http://sc.chinaz.com/moban/">&#x7F51;&#x9875;&#x6A21;&#x677F;</a></p>
				</div>
			</div>
			
	<script src="js/jquery.min.js"></script>
	<!-- jQuery Easing -->
	<script src="js/jquery.easing.1.3.js"></script>
	<!-- Bootstrap -->
	<script src="js/bootstrap.min.js"></script>
	<!-- Waypoints -->
	<script src="js/jquery.waypoints.min.js"></script>
	<!-- Stellar Parallax -->
	<script src="js/jquery.stellar.min.js"></script>
	<!-- Carousel -->
	<script src="js/owl.carousel.min.js"></script>
	<!-- Flexslider -->
	<script src="js/jquery.flexslider-min.js"></script>
	<!-- countTo -->
	<script src="js/jquery.countTo.js"></script>
	<!-- Magnific Popup -->
	<script src="js/jquery.magnific-popup.min.js"></script>
	<script src="js/magnific-popup-options.js"></script>
	<!-- Main -->
	<script src="js/main.js"></script>

</body>
</html>
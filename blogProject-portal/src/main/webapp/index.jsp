<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>Law &mdash; Free Website Template, Free HTML5 Template by
	freehtml5.co</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description"
	content="Free HTML5 Website Template by FreeHTML5.co" />
<meta name="keywords"
	content="free website templates, free html5, free template, free bootstrap, free website template, html5, css3, mobile first, responsive" />

<!-- Facebook and Twitter integration -->
<meta property="og:title" content="" />
<meta property="og:image" content="" />
<meta property="og:url" content="" />
<meta property="og:site_name" content="" />
<meta property="og:description" content="" />
<meta name="twitter:title" content="" />
<meta name="twitter:image" content="" />
<meta name="twitter:url" content="" />
<meta name="twitter:card" content="" />

<!-- 	<link href="${ctp}/https://fonts.googleapis.com/css?family=Work+Sans:300,400,500,700,800" rel="stylesheet"> -->

<!-- Animate.css -->
<link rel="stylesheet" href="${ctp}/css/animate.css">
<!-- Icomoon Icon Fonts-->
<link rel="stylesheet" href="${ctp}/css/icomoon.css">
<!-- Bootstrap  -->
<link rel="stylesheet" href="${ctp}/css/bootstrap.css">

<!-- Magnific Popup -->
<link rel="stylesheet" href="${ctp}/css/magnific-popup.css">

<!-- Owl Carousel  -->
<link rel="stylesheet" href="${ctp}/css/owl.carousel.min.css">
<link rel="stylesheet" href="${ctp}/css/owl.theme.default.min.css">
<!-- Flexslider  -->
<link rel="stylesheet" href="${ctp}/css/flexslider.css">

<!-- Theme style  -->
<link rel="stylesheet" href="${ctp}/css/style.css">

<!-- Modernizr JS -->
<script src="${ctp}/js/modernizr-2.6.2.min.js"></script>

</head>
<body>

	<div class="fh5co-loader"></div>

	<div id="page">
		<nav class="fh5co-nav" role="navigation">
			<div class="top-menu">
				<div class="container">
					<div class="row">
						<div class="col-xs-2">
							<div id="fh5co-logo">
								<a href="${ctp}/index.jsp">轻博客<span>.</span></a>
							</div>
						</div>
						<div class="col-xs-10 text-right menu-1">
							<ul>
								
									<li class="active"><a href="${ctp}/index.html">首页</a></li>
									<li><a href="${ctp}/blog.html">写博客</a></li>
									<li><a href="${ctp}/find.html">发现</a></li>
									<li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</li>
								<c:if test="${empty loginUser}">
									<li class="btn-cta"><a href="${ctp}/register.jsp"><span>注册</span></a></li>
									<li class="btn-cta"><a href="${ctp}/login.jsp"><span>登录</span></a></li>
								</c:if>
								<c:if test="${not empty loginUser}">
									<li><a href="${ctp}/like.html">关注</a></li>
									<li class="has-dropdown"><a href="${ctp}/blog.html">${loginUser }</a>
										<ul class="dropdown">
											<li><a href="${ctp}/#">我的主页</a></li>
											<li><a href="${ctp}/#">收藏的文章</a></li>
											<li><a href="${ctp}/#">喜欢的文章</a></li>
											<li><a href="${ctp}/#">设置</a></li>
											<li role="separator" class="divider"></li>
											<li><a href="${ctp}/user/exitLogin">退出登录</a></li>
										</ul>
									</li>
								</c:if>
							</ul>
						</div>
					</div>

				</div>
			</div>
		</nav>

	
	
		<aside id="fh5co-hero" class="js-fullheight">
			<div class="flexslider js-fullheight">
				<ul class="slides">
					<li style="background-image: url(${ctp}/images/img_bg_1.jpg);">
						<div class="overlay-gradient"></div>
						<div class="container">
							<div class="row">
								<div
									class="col-md-8 col-md-offset-2 text-center js-fullheight slider-text">
									<div class="slider-text-inner">
										<h1>霍乱时期的爱情</h1>
										<h2>“我对死亡感到唯一的痛苦，是没能为爱而死。”软弱者永远爱情的王国，爱情的王国是无情和吝啬的，女人们只肯委身于那些敢做敢为的男子汉，正是这样的男子汉能使她们得到她们所渴望的安全感，使她们能正视生活。</h2>
										<p>
											<a class="btn btn-primary btn-lg" href="${ctp}/singlepage.jsp">阅读全文</a>
										</p>
									</div>
								</div>
							</div>
						</div>
					</li>
					<li style="background-image: url(${ctp}/images/img_bg_2.jpg);">
						<div class="overlay-gradient"></div>
						<div class="container">
							<div class="row">
								<div
									class="col-md-8 col-md-offset-2 text-center js-fullheight slider-text">
									<div class="slider-text-inner">
										<h1>「不思考」的零秒思考艺术</h1>
										<h2>零秒思考，并不是真的不思考，而是思考速度很快，快到感觉不到。什么样的思考能够达到这种境界呢？换个字眼，那就是直觉思考。所谓零秒思考，就是让你的思考变成一种直觉，遇到问题时，直觉反应出解决方案，甚至能看到结果。</h2>
										<p>
											<a class="btn btn-primary btn-lg" href="${ctp}/singlepage.jsp">阅读全文</a>
										</p>
									</div>
								</div>
							</div>
						</div>
					</li>
					<li style="background-image: url(${ctp}/images/img_bg_3.jpg);">
						<div class="overlay-gradient"></div>
						<div class="container">
							<div class="row">
								<div
									class="col-md-8 col-md-offset-2 text-center js-fullheight slider-text">
									<div class="slider-text-inner">
										<h1>旅行路上，你在做什么</h1>
										<h2>开始喜欢旅行，似乎是很久以前的事情了。对于旅行的热爱，最初是因为什么，现在我已经记得不太清楚了。不过我仍然记得第一次出门旅行的样子，那是4岁的时候，至少我记得是那个时候。</h2>
										<p>
											<a class="btn btn-primary btn-lg" href="${ctp}/singlepage.jsp">阅读全文</a>
										</p>
									</div>
								</div>
							</div>
						</div>
					</li>
				</ul>
			</div>
		</aside>
		<div class="technology">
			<div class="container">
				<div class="col-md-9 technology-left">
					<div class="tech-no">
						<!-- technology-top -->

						<div class="tc-ch wow fadeInDown" data-wow-duration=".8s"
							data-wow-delay=".2s">

							<div class="tch-img">
								<a href="${ctp}/singlepage.jsp"><img src="${ctp}/images/t4.jpg"
									class="img-responsive" alt=""></a>
							</div>

							<h3>
								<a href="${ctp}/singlepage.jsp">Lorem Ipsum is simply</a>
							</h3>
							<h6>
								BY <a href="${ctp}/singlepage.jsp">ADAM ROSE </a>JULY 10 2016.
							</h6>
							<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit,
								sed do eiusmod tempor incididunt ut labore et dolore magna
								aliqua. Ut enim ad minim veniam, quis nostrud eiusmod tempor
								incididunt ut labore et dolore magna aliqua exercitation ullamco
								laboris nisi ut aliquip ex ea commodo consequat.</p>
							<p>Ut enim ad minim veniam, quis nostrud eiusmod tempor
								incididunt ut labore et dolore magna aliqua exercitation ullamco
								laboris nisi ut aliquip ex ea commodo consequat.</p>
							<div class="bht1">
								<a href="${ctp}/singlepage.jsp">Continue Reading</a>
							</div>
							<div class="soci">
								<ul>
									<li class="hvr-rectangle-out"><a class="fb" href="${ctp}/#"></a></li>
									<li class="hvr-rectangle-out"><a class="twit" href="${ctp}/#"></a></li>
									<li class="hvr-rectangle-out"><a class="goog" href="${ctp}/#"></a></li>
									<li class="hvr-rectangle-out"><a class="pin" href="${ctp}/#"></a></li>
									<li class="hvr-rectangle-out"><a class="drib" href="${ctp}/#"></a></li>
								</ul>
							</div>
							<div class="clearfix"></div>
						</div>
						<div class="clearfix"></div>
						<!-- technology-top -->
						<!-- technology-top -->
						<div class="w3ls">
							<div class="col-md-6 w3ls-left wow fadeInDown"
								data-wow-duration=".8s" data-wow-delay=".2s">
								<div class="tc-ch">
									<div class="tch-img">
										<a href="${ctp}/singlepage.jsp"> <img src="${ctp}/images/m4.jpg"
											class="img-responsive" alt=""></a>
									</div>

									<h3>
										<a href="${ctp}/singlepage.jsp">Lorem Ipsum is simply</a>
									</h3>
									<h6>
										BY <a href="${ctp}/singlepage.jsp">ADAM ROSE </a>JULY 10 2016.
									</h6>
									<p>Ut enim ad minim veniam, quis nostrud eiusmod tempor
										incididunt ut labore et dolore magna aliqua exercitation
										ullamco laboris nisi ut aliquip ex ea commodo consequat.</p>
									<div class="bht1">
										<a href="${ctp}/singlepage.jsp">Read More</a>
									</div>
									<div class="soci">
										<ul>
											<li class="hvr-rectangle-out"><a class="fb" href="${ctp}/#"></a></li>
											<li class="hvr-rectangle-out"><a class="pin" href="${ctp}/#"></a></li>
										</ul>
									</div>
									<div class="clearfix"></div>
								</div>
							</div>
							<div class="col-md-6 w3ls-left wow fadeInDown"
								data-wow-duration=".8s" data-wow-delay=".2s">
								<div class="tc-ch">
									<div class="tch-img">
										<a href="${ctp}/singlepage.jsp"><img src="${ctp}/images/m5.jpg"
											class="img-responsive" alt=""></a>
									</div>

									<h3>
										<a href="${ctp}/singlepage.jsp">Lorem Ipsum is simply</a>
									</h3>
									<h6>
										BY <a href="${ctp}/singlepage.jsp">ADAM ROSE </a>JULY 10 2016.
									</h6>
									<p>Ut enim ad minim veniam, quis nostrud eiusmod tempor
										incididunt ut labore et dolore magna aliqua exercitation
										ullamco laboris nisi ut aliquip ex ea commodo consequat.</p>
									<div class="bht1">
										<a href="${ctp}/singlepage.jsp">Read More</a>
									</div>
									<div class="soci">
										<ul>
											<li class="hvr-rectangle-out"><a class="twit" href="${ctp}/#"></a></li>
											<li class="hvr-rectangle-out"><a class="drib" href="${ctp}/#"></a></li>
										</ul>
									</div>
									<div class="clearfix"></div>
								</div>
							</div>
							<div class="clearfix"></div>
						</div>
						<!-- technology-top -->
						<div class="wthree">
							<div class="col-md-6 wthree-left wow fadeInDown"
								data-wow-duration=".8s" data-wow-delay=".2s">
								<div class="tch-img">
									<a href="${ctp}/singlepage.jsp"><img src="${ctp}/images/f1.jpg"
										class="img-responsive" alt=""></a>
								</div>
							</div>
							<div class="col-md-6 wthree-right wow fadeInDown"
								data-wow-duration=".8s" data-wow-delay=".2s">
								<h3>
									<a href="${ctp}/singlepage.jsp">Lorem Ipsum is simply</a>
								</h3>
								<h6>
									BY <a href="${ctp}/singlepage.jsp">ADAM ROSE </a>JULY 10 2016.
								</h6>
								<p>Ut enim ad minim veniam, quis nostrud eiusmod tempor
									incididunt ut labore et dolore magna aliqua exercitation
									ullamco laboris .</p>
								<div class="bht1">
									<a href="${ctp}/singlepage.jsp">Read More</a>
								</div>
								<div class="soci">
									<ul>

										<li class="hvr-rectangle-out"><a class="twit" href="${ctp}/#"></a></li>
										<li class="hvr-rectangle-out"><a class="pin" href="${ctp}/#"></a></li>
									</ul>
								</div>
								<div class="clearfix"></div>

							</div>
							<div class="clearfix"></div>
						</div>
						<div class="wthree">
							<div class="col-md-6 wthree-left wow fadeInDown"
								data-wow-duration=".8s" data-wow-delay=".2s">
								<div class="tch-img">
									<a href="${ctp}/singlepage.jsp"><img src="${ctp}/images/f2.jpg"
										class="img-responsive" alt=""></a>
								</div>
							</div>
							<div class="col-md-6 wthree-right wow fadeInDown"
								data-wow-duration=".8s" data-wow-delay=".2s">
								<h3>
									<a href="${ctp}/singlepage.jsp">Lorem Ipsum is simply</a>
								</h3>
								<h6>
									BY <a href="${ctp}/singlepage.jsp">ADAM ROSE </a>JULY 10 2016.
								</h6>
								<p>Ut enim ad minim veniam, quis nostrud eiusmod tempor
									incididunt ut labore et dolore magna aliqua exercitation
									ullamco laboris .</p>
								<div class="bht1">
									<a href="${ctp}/singlepage.jsp">Read More</a>
								</div>
								<div class="soci">
									<ul>
										<li class="hvr-rectangle-out"><a class="goog" href="${ctp}/#"></a></li>
										<li class="hvr-rectangle-out"><a class="fb" href="${ctp}/#"></a></li>
									</ul>
								</div>
								<div class="clearfix"></div>

							</div>
							<div class="clearfix"></div>
						</div>
						<div class="wthree">
							<div class="col-md-6 wthree-left wow fadeInDown"
								data-wow-duration=".8s" data-wow-delay=".2s">
								<div class="tch-img">
									<a href="${ctp}/singlepage.jsp"><img src="${ctp}/images/f3.jpg"
										class="img-responsive" alt=""></a>
								</div>
							</div>
							<div class="col-md-6 wthree-right wow fadeInDown"
								data-wow-duration=".8s" data-wow-delay=".2s">
								<h3>
									<a href="${ctp}/singlepage.jsp">Lorem Ipsum is simply</a>
								</h3>
								<h6>
									BY <a href="${ctp}/singlepage.jsp">ADAM ROSE </a>JULY 10 2016.
								</h6>
								<p>Ut enim ad minim veniam, quis nostrud eiusmod tempor
									incididunt ut labore et dolore magna aliqua exercitation
									ullamco laboris.</p>
								<div class="bht1">
									<a href="${ctp}/singlepage.jsp">Read More</a>
								</div>
								<div class="soci">
									<ul>
										<li class="hvr-rectangle-out"><a class="drib" href="${ctp}/#"></a></li>
										<li class="hvr-rectangle-out"><a class="goog" href="${ctp}/#"></a></li>
									</ul>
								</div>
								<div class="clearfix"></div>

							</div>
							<div class="clearfix"></div>
						</div>
					</div>
				</div>
				<!-- technology-right -->
				<div class="col-md-3 technology-right">


					<div class="blo-top1">

						<div class="tech-btm">
							<div class="search-1 wow fadeInDown" data-wow-duration=".8s"
								data-wow-delay=".2s">
								<form action="#" method="post">
									<input type="search" name="Search" value="Search"
										onfocus="this.value = '';"
										onblur="if (this.value == '') {this.value = 'Search';}"
										required=""> <input type="submit" value=" ">
								</form>
							</div>
							<h4>热门排行</h4>
							<div class="blog-grids wow fadeInDown" data-wow-duration=".8s"
								data-wow-delay=".2s">
								<div class="blog-grid-left">
									<a href="${ctp}/singlepage.jsp"><img src="${ctp}/images/t2.jpg"
										class="img-responsive" alt=""></a>
								</div>
								<div class="blog-grid-right">

									<h5>
										<a href="${ctp}/singlepage.jsp">Pellentesque dui Maecenas male</a>
									</h5>
								</div>
								<div class="clearfix"></div>
							</div>
							<div class="blog-grids wow fadeInDown" data-wow-duration=".8s"
								data-wow-delay=".2s">
								<div class="blog-grid-left">
									<a href="${ctp}/singlepage.jsp"><img src="${ctp}/images/m2.jpg"
										class="img-responsive" alt=""></a>
								</div>
								<div class="blog-grid-right">

									<h5>
										<a href="${ctp}/singlepage.jsp">Pellentesque dui Maecenas male</a>
									</h5>
								</div>
								<div class="clearfix"></div>
							</div>
							<div class="blog-grids wow fadeInDown" data-wow-duration=".8s"
								data-wow-delay=".2s">
								<div class="blog-grid-left">
									<a href="${ctp}/singlepage.jsp"><img src="${ctp}/images/f2.jpg"
										class="img-responsive" alt=""></a>
								</div>
								<div class="blog-grid-right">

									<h5>
										<a href="${ctp}/singlepage.jsp">Pellentesque dui Maecenas male</a>
									</h5>
								</div>
								<div class="clearfix"></div>
							</div>
							<div class="blog-grids wow fadeInDown" data-wow-duration=".8s"
								data-wow-delay=".2s">
								<div class="blog-grid-left">
									<a href="${ctp}/singlepage.jsp"><img src="${ctp}/images/t3.jpg"
										class="img-responsive" alt=""></a>
								</div>
								<div class="blog-grid-right">

									<h5>
										<a href="${ctp}/singlepage.jsp">Pellentesque dui Maecenas male</a>
									</h5>
								</div>
								<div class="clearfix"></div>
							</div>
							<div class="blog-grids wow fadeInDown" data-wow-duration=".8s"
								data-wow-delay=".2s">
								<div class="blog-grid-left">
									<a href="${ctp}/singlepage.jsp"><img src="${ctp}/images/m3.jpg"
										class="img-responsive" alt=""></a>
								</div>
								<div class="blog-grid-right">

									<h5>
										<a href="${ctp}/singlepage.jsp">Pellentesque dui Maecenas male</a>
									</h5>
								</div>
								<div class="clearfix"></div>
							</div>
							<div class="insta wow fadeInDown" data-wow-duration=".8s"
								data-wow-delay=".2s">
								<h4>博客分类</h4>
								<ul>

									<li><a href="${ctp}/singlepage.jsp"><img src="${ctp}/images/t1.jpg"
											class="img-responsive" alt=""></a></li>
									<li><a href="${ctp}/singlepage.jsp"><img src="${ctp}/images/m1.jpg"
											class="img-responsive" alt=""></a></li>
									<li><a href="${ctp}/singlepage.jsp"><img src="${ctp}/images/f1.jpg"
											class="img-responsive" alt=""></a></li>
									<li><a href="${ctp}/singlepage.jsp"><img src="${ctp}/images/m2.jpg"
											class="img-responsive" alt=""></a></li>
									<li><a href="${ctp}/singlepage.jsp"><img src="${ctp}/images/f2.jpg"
											class="img-responsive" alt=""></a></li>
									<li><a href="${ctp}/singlepage.jsp"><img src="${ctp}/images/t2.jpg"
											class="img-responsive" alt=""></a></li>
									<li><a href="${ctp}/singlepage.jsp"><img src="${ctp}/images/f3.jpg"
											class="img-responsive" alt=""></a></li>
									<li><a href="${ctp}/singlepage.jsp"><img src="${ctp}/images/t3.jpg"
											class="img-responsive" alt=""></a></li>
									<li><a href="${ctp}/singlepage.jsp"><img src="${ctp}/images/m3.jpg"
											class="img-responsive" alt=""></a></li>
								</ul>
							</div>

							<p>Lorem ipsum ex vix illud nonummy, novum tation et his. At
								vix scripta patrioque scribentur, at pro</p>
						</div>



					</div>


				</div>
				<div class="clearfix"></div>
				<!-- technology-right -->
			</div>
		</div>
		<div class="footer">
			<div class="container">
				<div class="col-md-4 footer-left wow fadeInDown"
					data-wow-duration=".8s" data-wow-delay=".2s">
					<h4>About Me</h4>
					<p>Consectetur adipisicing Lorem ipsum dolor sit amet,
						consectetur adipisicing elit, sed do eiusmod .</p>
					<img src="${ctp}/images/t4.jpg" class="img-responsive" alt="">
					<div class="bht1">
						<a href="${ctp}/singlepage.jsp">Read More</a>
					</div>
				</div>
				<div class="col-md-4 footer-middle wow fadeInDown"
					data-wow-duration=".8s" data-wow-delay=".2s">
					<h4>Latest Tweet</h4>
					<div class="mid-btm">
						<p>Sed do eiusmod tempor Lorem ipsum dolor sit amet,
							consectetur adipisicing elit, sed do eiusmod .</p>
						<a href="${ctp}/http://sc.chinaz.com/">http://sc.chinaz.com/</a>
					</div>

					<p>Consectetur adipisicing Lorem ipsum dolor sit amet,
						consectetur adipisicing elit, sed do eiusmod .</p>
					<a href="${ctp}/http://sc.chinaz.com/">http://sc.chinaz.com/</a>

				</div>
				<div class="col-md-4 footer-right wow fadeInDown"
					data-wow-duration=".8s" data-wow-delay=".2s">
					<h4>Newsletter</h4>
					<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit,
						sed do eiusmod tempor incididunt</p>
					<div class="name">
						<form action="#" method="post">
							<input type="text" placeholder="Your Name" required=""> <input
								type="text" placeholder="Your Email" required=""> <input
								type="submit" value="Subscribed Now">
						</form>

					</div>

					<div class="clearfix"></div>

				</div>
				<div class="clearfix"></div>
			</div>
		</div>
		<div class="copyright wow fadeInDown" data-wow-duration=".8s"
			data-wow-delay=".2s">
			<div class="container">
				<p>
					Copyright &copy; 2016.Company name All rights reserved.<a
						target="_blank" href="${ctp}/http://sc.chinaz.com/moban/">&#x7F51;&#x9875;&#x6A21;&#x677F;</a>
				</p>
			</div>
		</div>

		<!-- jQuery -->
		<script src="${ctp}/js/jquery.min.js"></script>
		<!-- jQuery Easing -->
		<script src="${ctp}/js/jquery.easing.1.3.js"></script>
		<!-- Bootstrap -->
		<script src="${ctp}/js/bootstrap.min.js"></script>
		<!-- Waypoints -->
		<script src="${ctp}/js/jquery.waypoints.min.js"></script>
		<!-- Stellar Parallax -->
		<script src="${ctp}/js/jquery.stellar.min.js"></script>
		<!-- Carousel -->
		<script src="${ctp}/js/owl.carousel.min.js"></script>
		<!-- Flexslider -->
		<script src="${ctp}/js/jquery.flexslider-min.js"></script>
		<!-- countTo -->
		<script src="${ctp}/js/jquery.countTo.js"></script>
		<!-- Magnific Popup -->
		<script src="${ctp}/js/jquery.magnific-popup.min.js"></script>
		<script src="${ctp}/js/magnific-popup-options.js"></script>
		<!-- Main -->
		<script src="${ctp}/js/main.js"></script>
</body>
</html>


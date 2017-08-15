<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@include file="/WEB-INF/views/userCenter/includes/css.jsp"%>

</head>

<body>

	<%
		//设置点击高亮效果
		pageContext.setAttribute("curPage", "myFans");
	%>

	<div class="fh5co-loader"></div>

	<div id="page">
		<!--导入导航栏  -->
		<%@include file="/WEB-INF/views/userCenter/includes/navbar.jsp"%>

		<div class="container">
			<div class="col-md-9 technology-left">
				<div class="tech-no">

					<div class="clearfix"></div>

					<!-- technology-top -->
					<div class="wthree">
						<div class="col-md-3 wthree-left wow fadeInDown"
							data-wow-duration=".8s" data-wow-delay=".2s">
							<div class="tch-img">
								<a href="singlepage.html"><img src="${ctp}/images/f1.jpg"
									class="img-responsive" alt=""></a>
							</div>
						</div>
						<div class="col-md-6 wthree-right wow fadeInDown"
							data-wow-duration=".8s" data-wow-delay=".2s">

							<div class="info">
								<a class="" href="#">Util</a>
								<div class="meta">
									<span>关注 73</span><span>粉丝 637</span><span>文章 31</span>
								</div>
								<div class="meta">写了 60166 字，获得了 767 个喜欢</div>
							</div>
							<div class="clearfix"></div>

						</div>
						<div class="col-md-3 wthree-left wow fadeInDown"
							data-wow-duration=".8s" data-wow-delay=".2s">
							</br>
							<button type="button" class="btn btn-default btn-lg">添加关注</button>

						</div>
						<div class="clearfix"></div>
					</div>

					<div class="wthree">
						<div class="col-md-3 wthree-left wow fadeInDown"
							data-wow-duration=".8s" data-wow-delay=".2s">
							<div class="tch-img">
								<a href="singlepage.html"><img src="${ctp}/images/f1.jpg"
									class="img-responsive" alt=""></a>
							</div>
						</div>
						<div class="col-md-6 wthree-right wow fadeInDown"
							data-wow-duration=".8s" data-wow-delay=".2s">

							<div class="info">
								<a class="" href="#">Jason</a>
								<div class="meta">
									<span>关注 73</span><span>粉丝 637</span><span>文章 31</span>
								</div>
								<div class="meta">写了 60166 字，获得了 767 个喜欢</div>
							</div>
							<div class="clearfix"></div>

						</div>
						<div class="col-md-3 wthree-left wow fadeInDown"
							data-wow-duration=".8s" data-wow-delay=".2s">
							</br>
							<button type="button" class="btn btn-default btn-lg">添加关注</button>

						</div>
						<div class="clearfix"></div>
					</div>

					<div class="wthree">
						<div class="col-md-3 wthree-left wow fadeInDown"
							data-wow-duration=".8s" data-wow-delay=".2s">
							<div class="tch-img">
								<a href="singlepage.html"><img src="${ctp}/images/f1.jpg"
									class="img-responsive" alt=""></a>
							</div>
						</div>
						<div class="col-md-6 wthree-right wow fadeInDown"
							data-wow-duration=".8s" data-wow-delay=".2s">

							<div class="info">
								<a class="" href="#">Moon</a>
								<div class="meta">
									<span>关注 73</span><span>粉丝 637</span><span>文章 31</span>
								</div>
								<div class="meta">写了 60166 字，获得了 767 个喜欢</div>
							</div>
							<div class="clearfix"></div>

						</div>
						<div class="col-md-3 wthree-left wow fadeInDown"
							data-wow-duration=".8s" data-wow-delay=".2s">
							</br>
							<button type="button" class="btn btn-default btn-lg">添加关注</button>

						</div>
						<div class="clearfix"></div>
					</div>

				</div>
			</div>
			<!-- technology-right -->

			<%@include file="/WEB-INF/views/userCenter/includes/rightGrid.jsp"%>


		</div>
		<div class="clearfix"></div>
		<!-- technology-right -->
	</div>

	<div class="footer">
		<div class="container">
			<div class="col-md-4 footer-left wow fadeInDown"
				data-wow-duration=".8s" data-wow-delay=".2s">
				<h4>About Me</h4>
				<p>Consectetur adipisicing Lorem ipsum dolor sit amet,
					consectetur adipisicing elit, sed do eiusmod .</p>
				<img src="images/t4.jpg" class="img-responsive" alt="">
				<div class="bht1">
					<a href="singlepage.html">Read More</a>
				</div>
			</div>
			<div class="col-md-4 footer-middle wow fadeInDown"
				data-wow-duration=".8s" data-wow-delay=".2s">
				<h4>Latest Tweet</h4>
				<div class="mid-btm">
					<p>Sed do eiusmod tempor Lorem ipsum dolor sit amet,
						consectetur adipisicing elit, sed do eiusmod .</p>
					<a href="http://sc.chinaz.com/">http://sc.chinaz.com/</a>
				</div>

				<p>Consectetur adipisicing Lorem ipsum dolor sit amet,
					consectetur adipisicing elit, sed do eiusmod .</p>
				<a href="http://sc.chinaz.com/">http://sc.chinaz.com/</a>

			</div>
			<div class="col-md-4 footer-right wow fadeInDown"
				data-wow-duration=".8s" data-wow-delay=".2s">
				<h4>Newsletter</h4>
				<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed
					do eiusmod tempor incididunt</p>
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
					target="_blank" href="http://sc.chinaz.com/moban/">&#x7F51;&#x9875;&#x6A21;&#x677F;</a>
			</p>
		</div>
	</div>

	<%@include file="/WEB-INF/views/userCenter/includes/jquery.jsp"%>
</body>

</html>
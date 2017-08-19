<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>


<%@include file="/WEB-INF/views/userCenter/includes/jquery.jsp"%>
<%@include file="/WEB-INF/views/userCenter/includes/css.jsp"%>

</head>
<body>

	<div class="fh5co-loader"></div>

	<div id="page">
        <%@ include file="/WEB-INF/views/userCenter/includes/navbar.jsp" %>

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
											<a class="btn btn-primary btn-lg"
												href="${ctp}/singlepage.jsp">阅读全文</a>
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
											<a class="btn btn-primary btn-lg"
												href="${ctp}/singlepage.jsp">阅读全文</a>
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
											<a class="btn btn-primary btn-lg"
												href="${ctp}/singlepage.jsp">阅读全文</a>
										</p>
									</div>
								</div>
							</div>
						</div>
					</li>
				</ul>
			</div>
		</aside>
	</div>
	
	<div class="technology">
		<div class="container">
			<div class="col-md-9 technology-left">
				<div class="tech-no">
					<!-- technology-top -->

					<div class="tc-ch wow fadeInDown" data-wow-duration=".8s"
						data-wow-delay=".2s">

						<div class="tch-img">
							<a href="${ctp}/singlepage.jsp"><img
								src="${ctp}/images/t4.jpg" class="img-responsive" alt=""></a>
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
									<a href="${ctp}/singlepage.jsp"> <img
										src="${ctp}/images/m4.jpg" class="img-responsive" alt=""></a>
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
								
								<div class="clearfix"></div>
							</div>
						</div>
						<div class="col-md-6 w3ls-left wow fadeInDown"
							data-wow-duration=".8s" data-wow-delay=".2s">
							<div class="tc-ch">
								<div class="tch-img">
									<a href="${ctp}/singlepage.jsp"><img
										src="${ctp}/images/m5.jpg" class="img-responsive" alt=""></a>
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
								<a href="${ctp}/singlepage.jsp"><img
									src="${ctp}/images/f1.jpg" class="img-responsive" alt=""></a>
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
								incididunt ut labore et dolore magna aliqua exercitation ullamco
								laboris .</p>
							<div class="bht1">
								<a href="${ctp}/singlepage.jsp">Read More</a>
							</div>
							
							<div class="clearfix"></div>

						</div>
						<div class="clearfix"></div>
					</div>
					<div class="wthree">
						<div class="col-md-6 wthree-left wow fadeInDown"
							data-wow-duration=".8s" data-wow-delay=".2s">
							<div class="tch-img">
								<a href="${ctp}/singlepage.jsp"><img
									src="${ctp}/images/f2.jpg" class="img-responsive" alt=""></a>
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
								incididunt ut labore et dolore magna aliqua exercitation ullamco
								laboris .</p>
							<div class="bht1">
								<a href="${ctp}/singlepage.jsp">Read More</a>
							</div>
							
							<div class="clearfix"></div>

						</div>
						<div class="clearfix"></div>
					</div>
					<div class="wthree">
						<div class="col-md-6 wthree-left wow fadeInDown"
							data-wow-duration=".8s" data-wow-delay=".2s">
							<div class="tch-img">
								<a href="${ctp}/singlepage.jsp"><img
									src="${ctp}/images/f3.jpg" class="img-responsive" alt=""></a>
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
								incididunt ut labore et dolore magna aliqua exercitation ullamco
								laboris.</p>
							<div class="bht1">
								<a href="${ctp}/singlepage.jsp">Read More</a>
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
								<a href="${ctp}/singlepage.jsp"><img
									src="${ctp}/images/t2.jpg" class="img-responsive" alt=""></a>
							</div>
							<div class="blog-grid-right">

								<h5>
									<a href="${ctp}/singlepage.jsp">Pellentesque dui Maecenas
										male</a>
								</h5>
							</div>
							<div class="clearfix"></div>
						</div>
						<div class="blog-grids wow fadeInDown" data-wow-duration=".8s"
							data-wow-delay=".2s">
							<div class="blog-grid-left">
								<a href="${ctp}/singlepage.jsp"><img
									src="${ctp}/images/m2.jpg" class="img-responsive" alt=""></a>
							</div>
							<div class="blog-grid-right">

								<h5>
									<a href="${ctp}/singlepage.jsp">Pellentesque dui Maecenas
										male</a>
								</h5>
							</div>
							<div class="clearfix"></div>
						</div>
						<div class="blog-grids wow fadeInDown" data-wow-duration=".8s"
							data-wow-delay=".2s">
							<div class="blog-grid-left">
								<a href="${ctp}/singlepage.jsp"><img
									src="${ctp}/images/f2.jpg" class="img-responsive" alt=""></a>
							</div>
							<div class="blog-grid-right">

								<h5>
									<a href="${ctp}/singlepage.jsp">Pellentesque dui Maecenas
										male</a>
								</h5>
							</div>
							<div class="clearfix"></div>
						</div>
						<div class="blog-grids wow fadeInDown" data-wow-duration=".8s"
							data-wow-delay=".2s">
							<div class="blog-grid-left">
								<a href="${ctp}/singlepage.jsp"><img
									src="${ctp}/images/t3.jpg" class="img-responsive" alt=""></a>
							</div>
							<div class="blog-grid-right">

								<h5>
									<a href="${ctp}/singlepage.jsp">Pellentesque dui Maecenas
										male</a>
								</h5>
							</div>
							<div class="clearfix"></div>
						</div>
						<div class="blog-grids wow fadeInDown" data-wow-duration=".8s"
							data-wow-delay=".2s">
							<div class="blog-grid-left">
								<a href="${ctp}/singlepage.jsp"><img
									src="${ctp}/images/m3.jpg" class="img-responsive" alt=""></a>
							</div>
							<div class="blog-grid-right">

								<h5>
									<a href="${ctp}/singlepage.jsp">Pellentesque dui Maecenas
										male</a>
								</h5>
							</div>
							<div class="clearfix"></div>
						</div>
						<div class="insta wow fadeInDown" data-wow-duration=".8s"
							data-wow-delay=".2s">
							<h4>博客分类</h4>
							<ul>

								<li><a href="${ctp}/singlepage.jsp"><img
										src="${ctp}/images/t1.jpg" class="img-responsive" alt=""></a></li>
								<li><a href="${ctp}/singlepage.jsp"><img
										src="${ctp}/images/m1.jpg" class="img-responsive" alt=""></a></li>
								<li><a href="${ctp}/singlepage.jsp"><img
										src="${ctp}/images/f1.jpg" class="img-responsive" alt=""></a></li>
								<li><a href="${ctp}/singlepage.jsp"><img
										src="${ctp}/images/m2.jpg" class="img-responsive" alt=""></a></li>
								<li><a href="${ctp}/singlepage.jsp"><img
										src="${ctp}/images/f2.jpg" class="img-responsive" alt=""></a></li>
								<li><a href="${ctp}/singlepage.jsp"><img
										src="${ctp}/images/t2.jpg" class="img-responsive" alt=""></a></li>
								<li><a href="${ctp}/singlepage.jsp"><img
										src="${ctp}/images/f3.jpg" class="img-responsive" alt=""></a></li>
								<li><a href="${ctp}/singlepage.jsp"><img
										src="${ctp}/images/t3.jpg" class="img-responsive" alt=""></a></li>
								<li><a href="${ctp}/singlepage.jsp"><img
										src="${ctp}/images/m3.jpg" class="img-responsive" alt=""></a></li>
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
	


		<%@include file="/WEB-INF/views/userCenter/includes/footer.jsp"%>
</body>
</html>


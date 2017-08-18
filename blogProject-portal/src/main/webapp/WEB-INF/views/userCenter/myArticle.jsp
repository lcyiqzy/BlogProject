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
		pageContext.setAttribute("curPage", "myArticle");
	%>
	<div class="fh5co-loader"></div>
	<div id="page">

		<%@include file="/WEB-INF/views/userCenter/includes/navbar.jsp"%>

		<div class="container">
			<div class="col-md-9 technology-left">
				<div class="tech-no">
					<!-- technology-top -->

					<div class="tc-ch wow fadeInDown" data-wow-duration=".8s"
						data-wow-delay=".2s">

						<div class="tch-img">
							<a href="singlepage.html"><img src="${ctp}/images/t4.jpg"
								class="img-responsive" alt=""></a>
						</div>

						<h3>
							<a href="singlepage.html">Lorem Ipsum is simply</a>
						</h3>
						<h6>
							BY <a href="singlepage.html">ADAM ROSE </a>JULY 10 2016.
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
							<a href="singlepage.html">Continue Reading</a>
						</div>
						<div class="soci">
							<ul>
								<li class="hvr-rectangle-out"><a class="fb" href="#"></a></li>
								<li class="hvr-rectangle-out"><a class="twit" href="#"></a>
								</li>
								<li class="hvr-rectangle-out"><a class="goog" href="#"></a>
								</li>
								<li class="hvr-rectangle-out"><a class="pin" href="#"></a>
								</li>
								<li class="hvr-rectangle-out"><a class="drib" href="#"></a>
								</li>
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
									<a href="singlepage.html"> <img src="${ctp}/images/m4.jpg"
										class="img-responsive" alt=""></a>
								</div>

								<h3>
									<a href="singlepage.html">Lorem Ipsum is simply</a>
								</h3>
								<h6>
									BY <a href="singlepage.html">ADAM ROSE </a>JULY 10 2016.
								</h6>
								<p>Ut enim ad minim veniam, quis nostrud eiusmod tempor
									incididunt ut labore et dolore magna aliqua exercitation
									ullamco laboris nisi ut aliquip ex ea commodo consequat.</p>
								<div class="bht1">
									<a href="singlepage.html">Read More</a>
								</div>
								<div class="soci">
									<ul>
										<li class="hvr-rectangle-out"><a class="fb" href="#"></a>
										</li>
										<li class="hvr-rectangle-out"><a class="pin" href="#"></a>
										</li>
									</ul>
								</div>
								<div class="clearfix"></div>
							</div>
						</div>
						<div class="col-md-6 w3ls-left wow fadeInDown"
							data-wow-duration=".8s" data-wow-delay=".2s">
							<div class="tc-ch">
								<div class="tch-img">
									<a href="singlepage.html"><img src="${ctp}/images/m5.jpg"
										class="img-responsive" alt=""></a>
								</div>

								<h3>
									<a href="singlepage.html">Lorem Ipsum is simply</a>
								</h3>
								<h6>
									BY <a href="singlepage.html">ADAM ROSE </a>JULY 10 2016.
								</h6>
								<p>Ut enim ad minim veniam, quis nostrud eiusmod tempor
									incididunt ut labore et dolore magna aliqua exercitation
									ullamco laboris nisi ut aliquip ex ea commodo consequat.</p>
								<div class="bht1">
									<a href="singlepage.html">Read More</a>
								</div>
								<div class="soci">
									<ul>
										<li class="hvr-rectangle-out"><a class="twit" href="#"></a>
										</li>
										<li class="hvr-rectangle-out"><a class="drib" href="#"></a>
										</li>
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
								<a href="singlepage.html"><img src="${ctp}/images/f1.jpg"
									class="img-responsive" alt=""></a>
							</div>
						</div>
						<div class="col-md-6 wthree-right wow fadeInDown"
							data-wow-duration=".8s" data-wow-delay=".2s">
							<h3>
								<a href="singlepage.html">Lorem Ipsum is simply</a>
							</h3>
							<h6>
								BY <a href="singlepage.html">ADAM ROSE </a>JULY 10 2016.
							</h6>
							<p>Ut enim ad minim veniam, quis nostrud eiusmod tempor
								incididunt ut labore et dolore magna aliqua exercitation ullamco
								laboris .</p>
							<div class="bht1">
								<a href="singlepage.html">Read More</a>
							</div>
							<div class="soci">
								<ul>

									<li class="hvr-rectangle-out"><a class="twit" href="#"></a>
									</li>
									<li class="hvr-rectangle-out"><a class="pin" href="#"></a>
									</li>
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
								<a href="singlepage.html"><img src="${ctp}/images/f2.jpg"
									class="img-responsive" alt=""></a>
							</div>
						</div>
						<div class="col-md-6 wthree-right wow fadeInDown"
							data-wow-duration=".8s" data-wow-delay=".2s">
							<h3>
								<a href="singlepage.html">Lorem Ipsum is simply</a>
							</h3>
							<h6>
								BY <a href="singlepage.html">ADAM ROSE </a>JULY 10 2016.
							</h6>
							<p>Ut enim ad minim veniam, quis nostrud eiusmod tempor
								incididunt ut labore et dolore magna aliqua exercitation ullamco
								laboris .</p>
							<div class="bht1">
								<a href="singlepage.html">Read More</a>
							</div>
							<div class="soci">
								<ul>
									<li class="hvr-rectangle-out"><a class="goog" href="#"></a>
									</li>
									<li class="hvr-rectangle-out"><a class="fb" href="#"></a>
									</li>
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
								<a href="singlepage.html"><img src="${ctp}/images/f3.jpg"
									class="img-responsive" alt=""></a>
							</div>
						</div>
						<div class="col-md-6 wthree-right wow fadeInDown"
							data-wow-duration=".8s" data-wow-delay=".2s">
							<h3>
								<a href="singlepage.html">Lorem Ipsum is simply</a>
							</h3>
							<h6>
								BY <a href="singlepage.html">ADAM ROSE </a>JULY 10 2016.
							</h6>
							<p>Ut enim ad minim veniam, quis nostrud eiusmod tempor
								incididunt ut labore et dolore magna aliqua exercitation ullamco
								laboris.</p>
							<div class="bht1">
								<a href="singlepage.html">Read More</a>
							</div>
							<div class="soci">
								<ul>
									<li class="hvr-rectangle-out"><a class="drib" href="#"></a>
									</li>
									<li class="hvr-rectangle-out"><a class="goog" href="#"></a>
									</li>
								</ul>
							</div>
							<div class="clearfix"></div>

						</div>
						<div class="clearfix"></div>
					</div>
				</div>
			</div>
			<!-- technology-right -->

			<!--引入右边栏  -->
			<%@include file="/WEB-INF/views/userCenter/includes/rightGrid.jsp"%>

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
					<img src="${ctp}/images/t4.jpg" class="img-responsive" alt="">
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
						target="_blank" href="http://sc.chinaz.com/moban/">&#x7F51;&#x9875;&#x6A21;&#x677F;</a>
				</p>
			</div>
		</div>

		<%@include file="/WEB-INF/views/userCenter/includes/jquery.jsp"%>

		<script type="text/javascript">
			function edit_click() {

				$("#myModal").modal('show');

			}

			$("#edit_save").click(
					function() {

						$("#intro_form").submit();

						var text = $("#intro_text").val();

						var userId = $("#intro_text").attr("userId");

						$.get("${ctp}/userCenter/saveIntro?content=" + text
								+ "&userId=" + userId, function() {

							showIntro();

							$("#myModal").modal("hide");
						});

						return false;
					});

			function showIntro() {

				var userId = $("#intro_text").attr("userId");

				$.get("${ctp}/userCenter/getIntro?userId=" + userId, function(
						data) {

					$("#selfIntroduction").empty().append(data);

				});

			}
		</script>
</body>

</html>
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
		pageContext.setAttribute("curPage", "myFollow");
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
								<a class="" href="#">Gracker</a>
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

							<button type="button" class="btn btn-default btn-lg">&nbsp;&nbsp;已关注&nbsp;&nbsp;</button>

						</div>
						<div class="clearfix"></div>
					</div>
					
					
				</div>
				
				
			<nav aria-label="Page navigation"  style="text-align: center">
			<ul class="pagination pagination-lg">
				<li><a href="#" aria-label="Previous"> <span
						aria-hidden="true">&laquo;</span>
				</a></li>
				<li><a href="#">1</a></li>
				<li><a href="#">2</a></li>
				<li><a href="#">3</a></li>
				<li><a href="#">4</a></li>
				<li><a href="#">5</a></li>
				<li><a href="#" aria-label="Next"> <span aria-hidden="true">&raquo;</span>
				</a></li>
			</ul>
			</nav>
				
				
			</div>

			<%@include file="/WEB-INF/views/userCenter/includes/rightGrid.jsp"%>

			<div class="clearfix"></div>
			<!-- technology-right -->


		</div>





		<%@include file="/WEB-INF/views/userCenter/includes/footer.jsp"%>

		<%@include file="/WEB-INF/views/userCenter/includes/jquery.jsp"%>


		<script type="text/javascript">
			$(function() {

				$(".btn-lg").mouseenter(function() {

					$(this).text("取消关注");

				});

			});
		</script>
</body>

</html>
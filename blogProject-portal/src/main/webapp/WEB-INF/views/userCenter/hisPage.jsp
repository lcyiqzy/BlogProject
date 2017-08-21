<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<%@include file="/WEB-INF/views/userCenter/includes/css.jsp"%>
<%@include file="/WEB-INF/views/userCenter/includes/jquery.jsp"%>
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

					<c:if test="${not empty page}">
						<c:forEach items="${page.items}" var="article">
							<div class="tc-ch wow fadeInDown" data-wow-duration=".8s"
								data-wow-delay=".2s">

								<%-- 	<div class="tch-img">
								<a href="singlepage.html"><img src="${ctp}/images/t1.jpg"
									class="img-responsive" alt=""></a>
							</div> --%>

								<h3>
									<a href="${ctp }/article_page/articleShow.jsp">${article.articleName }</a>
								</h3>
								<h6>
									BY <a href="#">${hisUser.userName } </a>JULY 10 2016.
								</h6>
								<p>${article.articleSimplecontent }<a
										href="${ctp }/article_page/articleShow.jsp">...</a>
								</p>

								<a href="${ctp }/article_page/articleShow.jsp">继续阅读</a>

								<div class="clearfix"></div>
							</div>
							<div class="clearfix"></div>
						</c:forEach>
					</c:if>

					<c:if test="${empty page}">
						<div class="tc-ch wow fadeInDown" data-wow-duration=".8s"
							data-wow-delay=".2s">
							该用户尚未发布文章
							<div class="clearfix"></div>
						</div>

					</c:if>



					<%@include file="/WEB-INF/views/userCenter/includes/page.jsp"%>
				</div>
			</div>
			<!-- technology-right -->



			<%-- 	<div class="col-md-3 technology-right">

				<div class="blo-top1">

					<div class="tech-btm">
						<div class="divleft">个人介绍</div>
						<div class="divright">
							
						</div>


						<div id="selfIntroduction">${hisUser.userSelfIntroduction }</div>
						<hr>

						<h4>${hisUser.userName }</h4>


						<div class="blog-grids wow fadeInDown" data-wow-duration=".8s"
							data-wow-delay=".2s">
							<div class="blog-grid-left">

								<i>我的文章</i>


							</div>
							<div class="blog-grid-right">

								<h5>
									<a href="#">12</a>
								</h5>
							</div>
							<div class="clearfix"></div>
						</div>

					</div>
				</div>
			</div> --%>
			<%@include file="/WEB-INF/views/userCenter/includes/hisRightGrid.jsp"%>
		</div>
		<div class="clearfix"></div>
		<!-- technology-right -->
	</div>

	<%@include file="/WEB-INF/views/userCenter/includes/footer.jsp"%>



	<script type="text/javascript">
		
	</script>
</body>

</html>
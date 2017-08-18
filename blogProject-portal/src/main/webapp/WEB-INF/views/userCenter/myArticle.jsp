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
								BY <a href="#">${user.userName } </a>JULY 10 2016.
							</h6>
							<p>${article.articleSimplecontent }</p>
							
								<a href="${ctp }/article_page/articleShow.jsp">继续阅读</a>
							

							<div class="clearfix"></div>
						</div>
						<div class="clearfix"></div>
					</c:forEach>
					<%@include file="/WEB-INF/views/userCenter/includes/page.jsp"%>
				</div>
			</div>
			<!-- technology-right -->

			<!--引入右边栏  -->
			<%@include file="/WEB-INF/views/userCenter/includes/rightGrid.jsp"%>
		</div>
		<div class="clearfix"></div>
		<!-- technology-right -->
	</div>

	<%@include file="/WEB-INF/views/userCenter/includes/footer.jsp"%>



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

			$.get("${ctp}/userCenter/getIntro?userId=" + userId,
					function(data) {

						$("#selfIntroduction").empty().append(data);

					});

		}
	</script>
</body>

</html>
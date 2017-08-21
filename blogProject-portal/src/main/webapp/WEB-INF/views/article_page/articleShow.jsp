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


	<div class="fh5co-loader"></div>
	<div id="page">

		<%@include file="/WEB-INF/views/userCenter/includes/navbar.jsp"%>


		<!-- technology-left -->

		<div class="container">
			<div class="col-md-2"></div>
			<div class="col-md-8 ">
				<div class="agileinfo">

					<h2 class="w3">${article.articleName }</h2>

					<div class="single">
						<!-- 	<img src="images/sing-1.jpg" class="img-responsive" alt=""
							style="width: 100%"> -->
						<div class="b-bottom">

							<%-- 
						<iframe src="${article.articleUrl}"></iframe>  --%>

							
							<iframe src="${article.articleUrl}" id="iframepage" width="100%"
								frameborder="0" scrolling="no" marginheight="0" marginwidth="0"
								onLoad="iFrameHeight()"></iframe> 


							<br />
							<p>On Aug 01</p>
							<p>
								<a class="" href="#">${article.articleAuthor }</a>
							</p>

						</div>
					</div>
					<div class="coment-form">
						<h4>回复</h4>
						<form action="#" method="post">
							<textarea onfocus="this.value = '';"
								onblur="if (this.value == '') {this.value = '你的评论...';}"
								required="">你的评论...</textarea>
							<input type="submit" value="提交">
						</form>
					</div>
					<div class="clearfix"></div>
				</div>
			</div>

			<!-- technology-right -->
		</div>


		<!-- technology-right -->
	</div>

	<div class="clearfix"></div>
	<!-- technology-right -->

	<%@include file="/WEB-INF/views/userCenter/includes/footer.jsp"%>



	<script type="text/javascript" language="javascript">
		function iFrameHeight() {
			var ifm = document.getElementById("iframepage");
			var subWeb = document.frames ? document.frames["iframepage"].document
					: ifm.contentDocument;
			if (ifm != null && subWeb != null) {
				ifm.height = subWeb.body.scrollHeight;
				ifm.width = subWeb.body.scrollWidth;
			}
		}
	</script> 
</body>

</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML>
<html>
<head>
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


<meta property="og:title" content="" />
<meta property="og:image" content="" />
<meta property="og:url" content="" />
<meta property="og:site_name" content="" />
<meta property="og:description" content="" />
<meta name="twitter:title" content="" />
<meta name="twitter:image" content="" />
<meta name="twitter:url" content="" />
<meta name="twitter:card" content="" />

<link rel="stylesheet" href="${ctp}/css/animate.css">
<link rel="stylesheet" href="${ctp}/css/icomoon.css">
<link rel="stylesheet" href="${ctp}/css/bootstrap.css">
<link rel="stylesheet" href="${ctp}/css/magnific-popup.css">
<link rel="stylesheet" href="${ctp}/css/owl.carousel.min.css">
<link rel="stylesheet" href="${ctp}/css/owl.theme.default.min.css">
<link rel="stylesheet" href="${ctp}/css/flexslider.css">
<link rel="stylesheet" href="${ctp}/css/style.css">
<script src="${ctp}/js/modernizr-2.6.2.min.js"></script>
<script type="text/javascript" src="${ctp}/ckeditor/ckeditor.js"></script>
</head>
<body>
    
	<div id="wrapper">
		<div id="page">
			<%@ include file="/WEB-INF/views/userCenter/includes/navbar.jsp"%>
			<div class="main">
				<!-- MAIN CONTENT -->
				<div class="main-content">
					<div id="page-inner">
						<div class="col-md-12">
							<div class="row">
								<div class="col-md-1"></div>
								<div class="col-md-10">
									<div class="panel panel-default">
										<div class="panel-body">
											<form id="article" action="${ctp}/article/saveArticle"
												method="post">
												<input autofocus="autofocus" name="articleName" type="text"
													placeholder="标题"
													style="border: none; width: 400px; height: 35px" /> <br />
												<br />
												<textarea name="upload"></textarea>
												<script type="text/javascript">
													CKEDITOR.replace('upload',
														{
															filebrowserUploadUrl : '${ctp}/article/saveImg',
														});
												</script>

												<br /> 
												<select name="label" class="form-control"
													style="float: left; width: 200px; height: 50px">
													<option value="">---请选择分类---</option>
													<c:forEach items="${labels}" var="label">
														<option value="${label.id}">${label.labelName}</option>
													</c:forEach>
												</select>
											</form>

											<button id="save" type="button"
												class="btn btn-primary btn-success" style="float: right;">保存</button>
										</div>
									</div>
									<!--End Advanced Tables -->
								</div>
								<div class="col-md-1"></div>
							</div>
						</div>
					</div>
				</div>
			</div>
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
	<script src="${ctp}/plugin/layer/layer.js"></script>
	<!-- Main -->
	<script src="${ctp}/js/main.js"></script>
	<script type="text/javascript">
	    $(function(){

	    });
	    
		$("#save").click(function(){
	       layer.msg("保存完成");
	       $("#article").submit();
	       $("#article").empty();
	    });
		
	</script>
</body>
</html>


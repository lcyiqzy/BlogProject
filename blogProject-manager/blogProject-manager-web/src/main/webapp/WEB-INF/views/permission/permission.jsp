<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html lang="UTF-8">
<head>
<title>用户管理</title>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0">
<!-- VENDOR CSS -->
<link rel="stylesheet"
	href="${ctp}/assets/vendor/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet"
	href="${ctp}/assets/vendor/font-awesome/css/font-awesome.min.css">
<link rel="stylesheet" href="${ctp}/assets/vendor/linearicons/style.css">
<link rel="stylesheet"
	href="${ctp}/assets/vendor/chartist/css/chartist-custom.css">
<!-- MAIN CSS -->
<link rel="stylesheet" href="${ctp}/assets/css/main.css">
</head>

<body>
	<!-- WRAPPER -->
	<div id="wrapper">
		<!-- NAVBAR -->
		<%@ include file="/WEB-INF/includes/navbar.jsp"%>
		<!-- END NAVBAR -->
		<!-- LEFT SIDEBAR -->
		<%@ include file="/WEB-INF/includes/leftsidebar.jsp"%>
		<!-- END LEFT SIDEBAR -->
		<!-- MAIN -->
		<div class="main">
			<!-- MAIN CONTENT -->
			<div class="main-content">
				<div class="container-fluid">
					<h3 class="page-title">权限列表</h3>
					<button type="button" class="btn btn-danger del_btn"
						style="float: right; margin-left: 10px;">
						<i class=" glyphicon glyphicon-remove"></i> 删除
					</button>
					<button type="button" class="add_label btn btn-primary"
						style="float: right;">
						<i class="glyphicon glyphicon-plus"></i> 新增
					</button>
					<br>
					<br>
					<br>
					<div id="page-inner">

						<div class="row">
							<div class="col-md-12">
								<c:forEach items="${permissions}" var="permission">
									<div class="col-md-4">
										<div class="panel">
											<div class="panel-heading">
												<h3 class="panel-title">${permission.permission}</h3>
												<div class="right">
													<button type="button" class="btn-toggle-collapse">
														<i class="lnr lnr-chevron-up"></i>
													</button>
													<button type="button" class="btn-remove">
														<i class="lnr lnr-cross"></i>
													</button>
												</div>
											</div>
										</div>
									</div>
								</c:forEach>
							</div>
						</div>
						<!--End 权限列表 -->
					</div>
				</div>

			</div>
			<!-- END MAIN CONTENT -->
		</div>
		<!-- END MAIN -->
		<div class="clearfix"></div>
		<footer>
			<div class="container-fluid">
				<p class="copyright"></p>
			</div>
		</footer>
	</div>
	<!-- END WRAPPER -->
	<!-- Javascript -->
	<script src="${ctp}/assets/vendor/jquery/jquery.min.js"></script>
	<script src="${ctp}/assets/vendor/bootstrap/js/bootstrap.min.js"></script>
	<script
		src="${ctp}/assets/vendor/jquery-slimscroll/jquery.slimscroll.min.js"></script>
	<script src="${ctp}/assets/scripts/klorofil-common.js"></script>
</body>

</html>

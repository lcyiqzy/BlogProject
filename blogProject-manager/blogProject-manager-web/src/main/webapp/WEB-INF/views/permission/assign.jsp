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
					<h3 class="page-title">文章管理</h3>
					<div class="row">
						<div class="panel panel-default">
							<div class="panel-heading">
								<h3 class="panel-title">
									<i class="glyphicon glyphicon-th"></i> 数据矩阵
								</h3>
							</div>
							<div class="panel-body">
								<div class="table-responsive">
									<table class="table  table-bordered">
										<thead>
											<tr>
												<th>名称</th>
												<c:forEach items="${types}" var="type">
													<th>${type.type}</th>
												</c:forEach>
											</tr>
										</thead>
										<tbody>
											<%-- 											<input id="aa" type="hidden" value="${atc_info}" /> --%>
											<c:forEach items="${permissions}" var="permission">
												<tr>
													<td>${permission.permission}</td>
													<c:forEach items="${types}" var="type">
														<td><input class="check_input" type="checkbox"
															tid="${type.id}" pid="${permission.id}">${type.id}--${permission.id}</td>
													</c:forEach>
												</tr>
											</c:forEach>
										</tbody>
									</table>
								</div>
							</div>
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

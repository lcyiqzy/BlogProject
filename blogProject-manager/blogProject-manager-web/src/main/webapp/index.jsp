<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!doctype html>
<html lang="UTF-8">
<head>
<title>轻博客-电台后台管理系统</title>
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
        <%@ include file="/WEB-INF/includes/navbar.jsp" %>
		<!-- END NAVBAR -->
		<!-- LEFT SIDEBAR -->
		<%@ include file="/WEB-INF/includes/leftsidebar.jsp" %>
		<!-- END LEFT SIDEBAR -->
		<!-- MAIN -->
		<div class="main">
			<!-- MAIN CONTENT -->
			<div class="main-content">
				<div class="container-fluid">
					<!-- OVERVIEW -->
					<div class="panel panel-headline">
						<div class="panel-heading">
							<h3 class="panel-title">每周概述</h3>
							<p class="panel-subtitle">Period: July 14, 2017 - July 21,
								2017</p>
						</div>
						<div class="panel-body">
							<div class="row">
								<div class="col-md-3">
									<div class="metric">
										<span class="icon"><i class="fa fa-book"></i></span>
										<p>
											<span class="number">1,252</span> <span class="title">总文章数</span>
										</p>
									</div>
								</div>
								<div class="col-md-3">
									<div class="metric">
										<span class="icon"><i class="fa fa-shopping-bag"></i></span>
										<p>
											<span class="number">203</span> <span class="title">总音频数</span>
										</p>
									</div>
								</div>
								<div class="col-md-3">
									<div class="metric">
										<span class="icon"><i class="fa fa-user"></i></span>
										<p>
											<span class="number">274,678</span> <span class="title">总注册数</span>
										</p>
									</div>
								</div>
								<div class="col-md-3">
									<div class="metric">
										<span class="icon"><i class="fa fa-eye"></i></span>
										<p>
											<span class="number">74,678</span> <span class="title">周访问量</span>
										</p>
									</div>
								</div>
							</div>
<!-- 							<div class="row"> -->
<!-- 								<div class="col-md-9"> -->
<!-- 									<div id="headline-chart" class="ct-chart"></div> -->
<!-- 								</div> -->
<!-- 								<div class="col-md-3"> -->
<!-- 									<div class="weekly-summary text-right"> -->
<!-- 										<span class="number">2,315</span> <span class="percentage"><i -->
<!-- 											class="fa fa-caret-up text-success"></i> 12%</span> <span -->
<!-- 											class="info-label">Total Sales</span> -->
<!-- 									</div> -->
<!-- 									<div class="weekly-summary text-right"> -->
<!-- 										<span class="number">$5,758</span> <span class="percentage"><i -->
<!-- 											class="fa fa-caret-up text-success"></i> 23%</span> <span -->
<!-- 											class="info-label">Monthly Income</span> -->
<!-- 									</div> -->
<!-- 									<div class="weekly-summary text-right"> -->
<!-- 										<span class="number">$65,938</span> <span class="percentage"><i -->
<!-- 											class="fa fa-caret-down text-danger"></i> 8%</span> <span -->
<!-- 											class="info-label">Total Income</span> -->
<!-- 									</div> -->
<!-- 								</div> -->
<!-- 							</div> -->
						</div>
					</div>
					<!-- END OVERVIEW -->
					<div class="row">
						<div class="col-md-6">
							<!-- RECENT PURCHASES -->
							<!-- END RECENT PURCHASES -->
						</div>
						<div class="col-md-6">
							<!-- MULTI CHARTS -->
							<!-- END MULTI CHARTS -->
						</div>
					</div>
					<div class="row">
						<div class="col-md-7">
							<!-- TODO LIST -->
							
							<!-- END TODO LIST -->
						</div>
						<div class="col-md-5">
							<!-- TIMELINE -->
				
							<!-- END TIMELINE -->
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
				<p class="copyright">
				</p>
			</div>
		</footer>
	</div>
	<!-- END WRAPPER -->
	<!-- Javascript -->
	<script src="assets/vendor/jquery/jquery.min.js"></script>
	<script src="assets/vendor/bootstrap/js/bootstrap.min.js"></script>
	<script src="assets/vendor/jquery-slimscroll/jquery.slimscroll.min.js"></script>
	<script src="assets/vendor/jquery.easy-pie-chart/jquery.easypiechart.min.js"></script>
	<script src="assets/vendor/chartist/js/chartist.min.js"></script>
	<script src="assets/scripts/klorofil-common.js"></script>
	<script>
	$(function() {


	});
	</script>
</body>

</html>

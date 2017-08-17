<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!doctype html>
<html lang="UTF-8">
<head>
<title>用户管理</title>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0">
<%@ include file="/WEB-INF/includes/common-css.jsp"%>
<%@ include file="/WEB-INF/includes/common-js.jsp"%>
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
				<div id="page-inner">

					<div class="row">
						<div class="col-md-12">
							<!-- 用户列表 Tables -->
							<div class="panel panel-default">
								<div class="panel-heading" style="font-size: medium;">用户列表</div>
								<div class="panel-body">
									<div class="table-responsive">
										<table class="table table-striped table-bordered table-hover"
											id="dataTables-example">
											<thead>
												<tr>
													<th>Rendering engine</th>
													<th>Browser</th>
													<th>Platform(s)</th>
													<th>Engine version</th>
													<th>CSS grade</th>
													<th>CSS grade</th>
												</tr>
											</thead>
											<tbody>
												<tr class="odd gradeX">
													<td>Trident</td>
													<td>Internet Explorer 4.0</td>
													<td>Win 95+</td>
													<td class="center">4</td>
													<td class="center">X</td>
												</tr>
												<tr class="even gradeC">
													<td>Trident</td>
													<td>Internet Explorer 5.0</td>
													<td>Win 95+</td>
													<td class="center">5</td>
													<td class="center">C</td>
												</tr>
												<tr class="odd gradeA">
													<td>Trident</td>
													<td>Internet Explorer 5.5</td>
													<td>Win 95+</td>
													<td class="center">5.5</td>
													<td class="center">A</td>
												</tr>
												<tr class="even gradeA">
													<td>Trident</td>
													<td>Internet Explorer 6</td>
													<td>Win 98+</td>
													<td class="center">6</td>
													<td class="center">A</td>
												</tr>
												<tr class="odd gradeA">
													<td>Trident</td>
													<td>Internet Explorer 7</td>
													<td>Win XP SP2+</td>
													<td class="center">7</td>
													<td class="center">A</td>
												</tr>
												<tr class="even gradeA">
													<td>Trident</td>
													<td>AOL browser (AOL desktop)</td>
													<td>Win XP</td>
													<td class="center">6</td>
													<td class="center">A</td>
												</tr>

												<tr class="gradeU">
													<td>Other browsers</td>
													<td>All others</td>
													<td>-</td>
													<td class="center">-</td>
													<td class="center">U</td>
												</tr>
											</tbody>
										</table>
									</div>

								</div>
							</div>
							<!--End Advanced Tables -->
						</div>
					</div>

				</div>
				<!-- END MAIN CONTENT -->
			</div>
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

</body>

</html>

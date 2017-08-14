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
				<div id="page-inner">

					<div class="row">
						<div class="col-md-12">
							<!-- Tables -->
							<div class="panel panel-default">
								<div class="panel-heading" style="font-size: medium;">文章管理</div>
								<div class="panel-body">
									<form class="form-inline" role="form" style="float: left"
										action="${ ctp }/permission/user/users">
										<div class="form-group has-feedback">
											<div class="input-group">
												<div class="input-group-addon">查询条件</div>
												<input class="form-control has-success" type="text"
													name="search" value="${ search }" placeholder="请输入查询条件">
											</div>
										</div>
										<button type="button" class="btn btn-warning">
											<i class="glyphicon glyphicon-search"></i> 查询
										</button>
									</form>
									<button type="button" class="btn btn-danger del_btn"
										style="float: right; margin-left: 10px;">
										<i class=" glyphicon glyphicon-remove"></i> 删除
									</button>
									<br>
									<hr style="clear: both;">
                                    <div class="table-responsive">
                                        <table class="table  table-bordered">
                                            <thead>
                                                <tr>
                                                    <th width="30">#</th>
                                                    <th width="30"><input type="checkbox"
                                                        class="check_all_btn"></th>
                                                    <th>文章标题</th>
                                                    <th>作者</th>
                                                    <th>浏览量</th>
                                                    <th>被喜欢量</th> 
                                                    <th>评论量</th>
                                                    <th>创建日期</th>
                                                    <th width="200">操作</th>
                                                </tr>
                                            </thead>
                                            <tbody>
                                                <c:forEach items="${articles.list}" var="article">
                                                    <tr>
                                                        <td>${article.id }</td>
                                                        <td><input type="checkbox" class="check_single_btn" del_id="${user.id }"></td>
                                                        <td>${article.articleName }</td>
                                                        <td>${article.articleAuthor }</td>
                                                        <td>${article.articleReadNum }</td>
                                                        <td>${article.articleLikeNum }</td>
                                                        <td>${article.articleCommitNum }</td>
                                                        <td>${article.articleDate }</td>
                                                        <td>
                                                            <button type="button" class="btn btn-success btn-xs"
                                                                assign_id="${article.id }">
                                                                <i class=" glyphicon glyphicon-check"></i>
                                                            </button>
                                                            <button type="button" class="btn btn-primary btn-xs">
                                                                <i class=" glyphicon glyphicon-pencil"></i>
                                                            </button>
                                                            <button type="button" class="btn btn-danger btn-xs">
                                                                <i class=" glyphicon glyphicon-remove"></i>
                                                            </button>
                                                        </td>
                                                    </tr>
                                                </c:forEach>
                                            </tbody>
                                            <tfoot>
                                                <!-- 分页按钮 -->
                                            </tfoot>
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
			<!-- END MAIN -->
			<div class="clearfix"></div>
			<footer>
				<div class="container-fluid">
					<p class="copyright"></p>
				</div>
			</footer>
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

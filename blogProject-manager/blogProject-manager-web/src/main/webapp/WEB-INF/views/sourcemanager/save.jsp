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
<script type="text/javascript" src="${ctp}/ckeditor/ckeditor.js"></script>
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
                    <!-- 写博客模块 -->
					<div class="row">
						<div class="col-md-12">
							<div class="panel panel-default">
								<div class="panel-heading" style="font-size: medium;">写博客</div>
								<div class="panel-body">
								    
                                    <form id="article" action="${ctp}/source/saveArticle" method="post">
                                        <input name="articleName" type="text" placeholder="标题"/>
                                        <br/>
                                        <br/>
                                        <textarea name="upload"></textarea>
	                                    <script type="text/javascript">
	                                        CKEDITOR.replace('upload',{
	//                                          filebrowserBrowseUrl: '${ctp}/source/selectImg',
	                                            filebrowserUploadUrl: '${ctp}/source/saveImg',
	                                        });
	                                        
	                                    </script>
                                    </form>
                                    <br/>
									<button id="save" type="button" class="btn btn-primary btn-success" style="float: right;">保存</button>
								</div>
							</div>
							<!--End Advanced Tables -->
						</div>
					</div>
                    <!-- 写博客模块结束 -->
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
    <script type="text/javascript">
        $(function(){
        	
        });
        
        $("#save").click(function(){
        	alert(1);
        	$("#article").submit();
        });
    </script>
</body>
</html>

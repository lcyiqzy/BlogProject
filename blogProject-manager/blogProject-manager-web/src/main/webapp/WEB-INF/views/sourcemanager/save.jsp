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

<%@ include file="/WEB-INF/includes/common-css.jsp" %>
<%@ include file="/WEB-INF/includes/common-js.jsp" %>
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
								    
                                    <form id="article" action="${ctp}/article/saveArticle" method="post">
                                        <input name="articleName" type="text" placeholder="标题" style="width: 400px"/>
                                        <br/>
                                        <br/>
                                        <textarea name="upload"></textarea>
	                                    <script type="text/javascript">
	                                        CKEDITOR.replace('upload',{
	//                                          filebrowserBrowseUrl: '${ctp}/article/selectImg',
	                                            filebrowserUploadUrl: '${ctp}/article/saveImg',
	                                        });
	                                        
	                                    </script>
	                                    
	                                    <br/>
	                                     <select name="label" class="form-control" style="float: left;width: 150px">
	                                        <option value="">---请选择分类---</option>
	                                        <c:forEach items="${labels}" var="label">
	                                            <option value="${label.id}">${label.labelName}</option>
	                                        </c:forEach>
                                        </select>
                                    </form>
                                    
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

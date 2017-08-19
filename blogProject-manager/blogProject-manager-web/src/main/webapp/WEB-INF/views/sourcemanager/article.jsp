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
    <%
        pageContext.setAttribute("url", "source/article");
    %>
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
													<th width="150">操作</th>
												</tr>
											</thead>
											<tbody>
												<c:forEach items="${info.list}" var="article">
													<tr>
														<td>${article.id }</td>
														<td><input type="checkbox" class="check_single_btn"
															del_id="${article.authorId }"></td>
														<td>${article.articleName }</td>
														<td>${article.articleAuthor }</td>
														<td>${article.articleReadNum }</td>
														<td>${article.articleLikeNum }</td>
														<td>${article.articleCommitNum }</td>
														<td>${article.articleDate }</td>
														<td>
															<button type="button"
																class="content btn btn-success btn-xs"
																article_id="${article.id }"
																article_name="${article.articleName}"
																article_url="${article.articleUrl}">
																<i class=" glyphicon glyphicon-check"></i>
															</button>
															<button type="button" class="del btn btn-danger btn-xs"
																article_id="${article.id }"
																article_name="${article.articleName}"
																article_realurl="${article.articleRealUrl}"
																article_picurl="${article.articlePicUrl}">
																<i class=" glyphicon glyphicon-remove"></i>
															</button>
														</td>
													</tr>
												</c:forEach>
											</tbody>
											<tfoot>
												<!-- 分页按钮 -->
												<%@ include file="/WEB-INF/includes/page.jsp" %>
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

	<!-- 查看文章模态框 -->
	<div class="modal fade" id="articleModal" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel" data-backdrop="static">
		<div class="modal-dialog modal-lg" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title" id="myModalLabel"></h4>
				</div>
				<div class="modal-body">
					<div>
						<!-- 文章 -->
						<iframe style="border: none" class="articleContent" width="850" height="400"></iframe>
					</div>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
				</div>
			</div>
		</div>
	</div>
	<!-- END WRAPPER -->
	
	<script type="text/javascript">
		$(function() {

		});

		$(".content").click(
				function() {
					$("#articleModal").modal();
					$("#articleModal #myModalLabel").html(
							$(this).attr("article_name"));
					//alert($(this).attr("article_url"));
					$("#articleModal .articleContent").attr("src",
							$(this).attr("article_url"));
				});

		$(".del").click(function() {
			var id = $(this).attr("article_id");
			var name = $(this).attr("article_name");
			var realurl = $(this).attr("article_realurl");
			var picurl = $(this).attr("article_picurl");
			var delUrl = "${ctp}/article/del?did=" + id + "&drealurl=" + realurl + "&dpicurl=" + picurl
			
			layer.confirm(
					'你确定删除【' + name + '】吗', 
					{btn : [ '否', '是' ]},
					function(index, layero) {
					    layer.msg("没删成");
					}, 
					function(index,layero) {
						layer.msg("删除完成")
						location.href = delUrl;
// 						$.get(
// 							"${ctp}/article/del",
// 							{ did: id, drealurl: realurl,dpicurl: picurl}, 
// 							function(msg){
// 								layer.msg(msg);
// 							});
					});
		});
	</script>
</body>

</html>

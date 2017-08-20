<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@include file="/WEB-INF/views/userCenter/includes/css.jsp"%>
</head>

<body>

	<%
		//设置点击高亮效果
		pageContext.setAttribute("curPage", "myFollow");
	%>

	<div class="fh5co-loader"></div>

	<div id="page">
		<!--导入导航栏  -->
		<%@include file="/WEB-INF/views/userCenter/includes/navbar.jsp"%>

		<div class="container">
			<div class="col-md-9 technology-left">
				<div class="tech-no">

					<div class="clearfix"></div>

					<table class="table  table-bordered">
						<c:if test="${not empty page}">
							<c:forEach items="${page.items}" var="follow">
								<!-- technology-top -->
								<div class="wthree">
									<div class="col-md-3 wthree-left wow fadeInDown"
										data-wow-duration=".8s" data-wow-delay=".2s">
										<div class="tch-img">
											<a href="${ctp}/userCenter/toHisPage?userId=${follow.id}"><img src="${ctp}/images/mypic.jpg"
												class="img-responsive" alt=""></a>
										</div>
									</div>
									<div class="col-md-6 wthree-right wow fadeInDown"
										data-wow-duration=".8s" data-wow-delay=".2s">

										<div class="info">
											<a class=""
												href="${ctp}/userCenter/toHisPage?userId=${follow.id}">${follow.userName }</a>
											<div class="meta">
												<span>关注 ${follow.followNum }</span><span>粉丝
													${follow.followedNum}</span><span>文章 ${follow.articleNum }</span>
											</div>
											<div class="meta">写了 ${follow.userWritenum }
												字，获得了${follow.userGetlike }个喜欢</div>
										</div>
										<div class="clearfix"></div>

									</div>
									<div class="col-md-3 wthree-left wow fadeInDown"
										data-wow-duration=".8s" data-wow-delay=".2s">
										</br>

										<button id="${follow.id }_btn" type="button"
											class="btn btn-default btn-lg" fanId="${follow.id }"
											userId="${user.id}"></button>
									</div>
									<div class="clearfix"></div>
								</div>

							</c:forEach>
						</c:if>

						<c:if test="${empty page}">
							<div class="tc-ch wow fadeInDown" data-wow-duration=".8s"
								data-wow-delay=".2s">
								尚未关注任何用户
								<div class="clearfix"></div>
							</div>

						</c:if>
						<%@include file="/WEB-INF/views/userCenter/includes/page.jsp"%>

					</table>
				</div>


			</div>
			<%@include file="/WEB-INF/views/userCenter/includes/hisRightGrid.jsp"%>
			<div class="clearfix"></div>
			<!-- technology-right -->
		</div>





		<%@include file="/WEB-INF/views/userCenter/includes/footer.jsp"%>

		<%@include file="/WEB-INF/views/userCenter/includes/jquery.jsp"%>


		<script type="text/javascript">
			$(function() {
				buildBtn();
			});

			$("body").on(
					"click",
					".unFollowed",
					function() {

						var fanid = $(this).attr("fanId");

						var userid = $(this).attr("userId");

						var id = fanid + "_btn";

						$.get("${ctp}/userCenter/addFollow?fanId=" + fanid
								+ "&userId=" + userid, function() {
							$("#" + id).empty().append("&nbsp;已关注&nbsp;");

							buildBtn();

						});

					});

			$("body").on(
					"click",
					".followed",
					function() {

						var fanid = $(this).attr("fanId");

						var userid = $(this).attr("userId");

						var id = fanid + "_btn";

						$.get("${ctp}/userCenter/deleteFollow?fanId=" + fanid
								+ "&userId=" + userid, function() {
							$("#" + id).empty().append("添加关注");

							buildBtn();

						});

					});

			$("body").on("mouseenter", ".followed", function() {

				$(this).empty().append("取消关注");
			});

			$("body").on("mouseleave", ".followed", function() {

				$(this).empty().append("&nbsp;已关注&nbsp;");
			});

			function buildBtn() {

				$.each($(".btn-lg"), function() {

					var fanid = $(this).attr("fanId");

					var userid = $(this).attr("userId");

					var id = fanid + "_btn";

					$.get("${ctp}/userCenter/isFollowed?fanId=" + fanid
							+ "&userId=" + userid, function(data) {

						if (data) {

							$("#" + id).removeClass().addClass(
									"btn btn-default btn-lg followed").empty()
									.append("&nbsp;已关注&nbsp;");
						} else {

							$("#" + id).removeClass().addClass(
									"btn btn-default btn-lg unFollowed")
									.empty().append("添加关注");
						}

					});

				});
			}

			function edit_click() {

				$("#myModal").modal('show');

			}

			$("#edit_save").click(
					function() {

						$("#intro_form").submit();

						var text = $("#intro_text").val();

						var userId = $("#intro_text").attr("userId");

						$.get("${ctp}/userCenter/saveIntro?content=" + text
								+ "&userId=" + userId, function() {

							showIntro();

							$("#myModal").modal("hide");
						});

						return false;
					});

			function showIntro() {

				var userId = $("#intro_text").attr("userId");

				$.get("${ctp}/userCenter/getIntro?userId=" + userId, function(
						data) {

					$("#selfIntroduction").empty().append(data);

				});

			}
		</script>
</body>

</html>
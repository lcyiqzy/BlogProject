<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<nav class="fh5co-nav" role="navigation">
	<div class="top-menu">
		<div class="container">
			<div class="row">
				<div class="col-xs-2">
					<div id="fh5co-logo">
						<a href="${ctp}/index.jsp">轻博客<span>.</span></a>
					</div>
				</div>
				<div class="col-xs-10 text-right menu-1">
					<ul>

						<li class="active"><a href="${ctp}/index.html">首页</a></li>
						<li><a href="${ctp}/blog.html">写博客</a></li>
						<li><a href="${ctp}/find.html">发现</a></li>
						<c:if test="${empty loginUser}">
							<li class="btn-cta"><a href="${ctp}/register.jsp"><span>注册</span></a></li>
							<li class="btn-cta"><a href="${ctp}/login.jsp"><span>登录</span></a></li>
						</c:if>
						<c:if test="${not empty loginUser}">
							<li><a href="${ctp}/like.html">关注</a></li>
							<li class="has-dropdown"><a href="${ctp}/index.html">${loginUser }</a>
								<ul class="dropdown">
									<li><a href="${ctp}/#">我的主页</a></li>
									<li><a href="${ctp}/#">收藏的文章</a></li>
									<li><a href="${ctp}/#">喜欢的文章</a></li>
									<li><a href="${ctp}/#">设置</a></li>
									<li role="separator" class="divider"></li>
									<li><a href="${ctp}/user/index.html">退出登录</a></li>
								</ul></li>
						</c:if>
					</ul>
				</div>
			</div>
		</div>
	</div>
</nav>
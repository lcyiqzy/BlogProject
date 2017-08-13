<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<div id="sidebar-nav" class="sidebar">
	<div class="sidebar-scroll">
		<nav>
			<ul class="nav">
				<li><a href="${ctp}/index.jsp" class="active"><i class="lnr lnr-home"></i>
						<span>主页</span></a></li>
				<li><a href="${ctp}/usermanager/users" class=""><i class="lnr lnr-user"></i> <span>用户管理</span></a></li>
				<li><a href="#perPages" data-toggle="collapse"
					class="collapsed"><i class="lnr lnr-linearicons"></i> <span>权限管理</span>
						<i class="icon-submenu lnr lnr-chevron-left"></i></a>
					<div id="perPages" class="collapse ">
						<ul class="nav">
							<li><a href="${ctp}/permission/list" class="">权限列表</a></li>
							<li><a href="${ctp}/permission/assign" class="">权限分配</a></li>
						</ul>
					</div></li>
				<li><a href="#subPages" data-toggle="collapse"
					class="collapsed"><i class="lnr lnr-file-empty"></i> <span>资源管理</span>
						<i class="icon-submenu lnr lnr-chevron-left"></i></a>
					<div id="subPages" class="collapse ">
						<ul class="nav">
							<li><a href="${ctp}/source/label" class="">标签管理</a></li>
							<li><a href="${ctp}/source/article" class="">文章管理</a></li>
							<li><a href="${ctp}/source/column" class="">栏目管理</a></li>
							<li><a href="${ctp}/source/audio" class="">音频管理</a></li>
						</ul>
					</div></li>
				<li><a href="#audiPages" data-toggle="collapse"
					class="collapsed"><i class="lnr lnr-alarm"></i> <span>审核管理</span>
						<i class="icon-submenu lnr lnr-chevron-left"></i></a>
					<div id="audiPages" class="collapse ">
						<ul class="nav">
							<li><a href="${ctp}/audit/audi-anchor" class="">主播申请审核</a></li>
							<li><a href="${ctp}/audit/audi-column" class="">栏目申请审核</a></li>
							<li><a href="${ctp}/audit/audi-audio" class="">音频审核</a></li>
						</ul>
					</div></li>
				<li><a href="${ctp}/source/toSave" class=""><i class="lnr lnr-user"></i> <span>保存文章</span></a></li>
			</ul>
		</nav>
	</div>
</div>
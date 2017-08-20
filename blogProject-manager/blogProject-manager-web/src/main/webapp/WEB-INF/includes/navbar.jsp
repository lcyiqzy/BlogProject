<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<nav class="navbar navbar-default navbar-fixed-top">
	<div class="brand">
		<a href="#" style="font-size: medium;">轻博客-电台后台管理系统</a>
	</div>
	<div class="container-fluid">
		<div class="navbar-btn">
			<button type="button" class="btn-toggle-fullwidth">
				<i class="lnr lnr-arrow-left-circle"></i>
			</button>
		</div>
<!-- 		<form class="navbar-form navbar-left"> -->
<!-- 			<div class="input-group"> -->
<!-- 				<input type="text" value="" class="form-control" -->
<!-- 					placeholder="Search dashboard..."> <span -->
<!-- 					class="input-group-btn"><button type="button" -->
<!-- 						class="btn btn-primary">Search</button></span> -->
<!-- 			</div> -->
<!-- 		</form> -->
		<div id="navbar-menu">
			<ul class="nav navbar-nav navbar-right">
				<li class="dropdown"><a href="#"
					class="dropdown-toggle icon-menu" data-toggle="dropdown"> <i
						class="lnr lnr-alarm"></i> <span class="badge bg-danger">5</span>
				</a>
					<ul class="dropdown-menu notifications">
						<li><a href="#" class="notification-item"><span
								class="dot bg-warning"></span>System space is almost full</a></li>
						<li><a href="#" class="notification-item"><span
								class="dot bg-danger"></span>You have 9 unfinished tasks</a></li>
						<li><a href="#" class="notification-item"><span
								class="dot bg-success"></span>Monthly report is available</a></li>
						<li><a href="#" class="more">See all notifications</a></li>
					</ul></li>
				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown"><i class="lnr lnr-question-circle"></i>
						<span>Help</span> <i class="icon-submenu lnr lnr-chevron-down"></i></a>
					<ul class="dropdown-menu">
						<li><a href="#">Basic Use</a></li>
						<li><a href="#">Working With Data</a></li>
						<li><a href="#">Security</a></li>
						<li><a href="#">Troubleshooting</a></li>
					</ul></li>
				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown"><img
						src="${ctp}/assets/img/apple-icon.png" class="img-circle"
						alt="Avatar"> <span>${loginUser.userName}</span> <i
						class="icon-submenu lnr lnr-chevron-down"></i></a>
					<ul class="dropdown-menu">
						<li><a href="#"><i class="lnr lnr-user"></i> <span>个人资料</span></a></li>
						<li><a href="#"><i class="lnr lnr-envelope"></i> <span>消息</span></a></li>
						<li><a href="${ctp}/usermanager/returnblog"><i class="lnr lnr-cog"></i> <span>返回</span></a></li>
						<li><a href="${ctp}/usermanager/logout"><i class="lnr lnr-exit"></i> <span>退出</span></a></li>
					</ul></li>
			</ul>
		</div>
	</div>
</nav>
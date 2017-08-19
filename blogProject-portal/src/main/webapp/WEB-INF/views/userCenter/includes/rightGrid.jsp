<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<div class="col-md-3 technology-right">

	<div class="blo-top1">

		<div class="tech-btm">
			<div class="divleft">个人介绍</div>
			<div class="divright">
				<a href="javascript:void(0);" onclick="edit_click()">编辑</a>
			</div>
			<!--<a class="inline" data-action="start-edit-intro" href=""><i class="iconfont ic-edit-s"></i>编辑</a>-->
			</br>

			<div class="modal fade" id="myModal" role="dialog">
				<div class="modal-dialog" role="document">
					<div class="modal-content">
						<div class="modal-header">
							<button type="button" class="close" data-dismiss="modal"
								aria-label="Close">
								<span aria-hidden="true">&times;</span>
							</button>
							<h4 class="modal-title">请输入个人介绍</h4>
						</div>
						<div class="modal-body">
						<textarea name="intro" id="intro_text" userId="${user.id }"
								style="overflow-y: hidden; height: 30px; width: 570px; border: none;"
								onpropertychange="this.style.height=this.scrollHeight + 'px'"
								oninput="this.style.height=this.scrollHeight + 'px'"
								placeholder="请输入内容" autofocus="autofocus"></textarea>
						
							
						</div>
						<div class="modal-footer">
							<button type="button" class="btn btn-default"
								data-dismiss="modal">取消</button>
							<button  type="button" class="btn btn-primary" id="edit_save">保存</button>
						</div>
					</div>
				</div>
			</div>

			<div id="selfIntroduction">${user.userSelfIntroduction }</div>
			<hr>

			<h4>${user.userName }</h4>

			<div class="blog-grids wow fadeInDown" data-wow-duration=".8s"
				data-wow-delay=".2s">
				<div class="blog-grid-left">

					<c:if test="${curPage=='myFollow'}">
						<i style="color: red">我的关注</i>
					</c:if>
					<c:if test="${curPage!='myFollow'}">
						<i>我的关注</i>
					</c:if>


				</div>
				<div class="blog-grid-right">

					<h5>
						<a href="${ctp}/userCenter/toFollowPage?userId=${user.id}&mypage=1">${user.followNum }</a>
					</h5>
				</div>

				<div class="clearfix"></div>
			</div>
			<div class="blog-grids wow fadeInDown" data-wow-duration=".8s"
				data-wow-delay=".2s">
				<div class="blog-grid-left">

					<c:if test="${curPage=='myFans'}">
						<i style="color: red">我的粉丝</i>
					</c:if>
					<c:if test="${curPage!='myFans'}">
						<i>我的粉丝</i>
					</c:if>

				</div>
				<div class="blog-grid-right">

					<h5>
						<a href="${ctp}/userCenter/toFansPage?userId=${user.id}&mypage=1">${user.followedNum }</a>
					</h5>
				</div>
				<div class="clearfix"></div>
			</div>
			<div class="blog-grids wow fadeInDown" data-wow-duration=".8s"
				data-wow-delay=".2s">
				<div class="blog-grid-left">
					<c:if test="${curPage=='myArticle'}">
						<i style="color: red">我的文章</i>
					</c:if>
					<c:if test="${curPage!='myArticle'}">
						<i>我的文章</i>
					</c:if>

				</div>
				<div class="blog-grid-right">

					<h5>
						<a href="${ctp}/userCenter/toArticlePage?userId=${user.id}&mypage=1">${user.articleNum }</a>
					</h5>
				</div>
				<div class="clearfix"></div>
			</div>
			<div class="blog-grids wow fadeInDown" data-wow-duration=".8s"
				data-wow-delay=".2s">
				<div class="blog-grid-left">
					<c:if test="${curPage=='getLike'}">
						<i style="color: red">收获喜欢</i>
					</c:if>
					<c:if test="${curPage!='getLike'}">
						<i>收获喜欢</i>
					</c:if>

				</div>
				<div class="blog-grid-right">

					<h5>
					<span>${user.userGetlike }</span>
					</h5>
				</div>
				<div class="clearfix"></div>
			</div>
			<div class="blog-grids wow fadeInDown" data-wow-duration=".8s"
				data-wow-delay=".2s">
				<div class="blog-grid-left">
					<c:if test="${curPage=='myLike'}">
						<i style="color: red">我的喜欢</i>
					</c:if>
					<c:if test="${curPage!='myLike'}">
						<i>我的喜欢</i>
					</c:if>

				</div>
				<div class="blog-grid-right">

					<h5>
						<span>${user.userGetlike }</span>
					</h5>
				</div>
				<div class="clearfix"></div>
			</div>
			<div class="insta wow fadeInDown" data-wow-duration=".8s"
				data-wow-delay=".2s">
				<h4>我的文集</h4>
				<ul>

					<li><a href="singlepage.html"><img
							src="${ctp}/images/t1.jpg" class="img-responsive" alt=""></a></li>
					<li><a href="singlepage.html"><img
							src="${ctp}/images/m1.jpg" class="img-responsive" alt=""></a></li>
					<li><a href="singlepage.html"><img
							src="${ctp}/images/f1.jpg" class="img-responsive" alt=""></a></li>
					<li><a href="singlepage.html"><img
							src="${ctp}/images/m2.jpg" class="img-responsive" alt=""></a></li>
					<li><a href="singlepage.html"><img
							src="${ctp}/images/f2.jpg" class="img-responsive" alt=""></a></li>
					<li><a href="singlepage.html"><img
							src="${ctp}/images/t2.jpg" class="img-responsive" alt=""></a></li>
					<li><a href="singlepage.html"><img
							src="${ctp}/images/f3.jpg" class="img-responsive" alt=""></a></li>
					<li><a href="singlepage.html"><img
							src="${ctp}/images/t3.jpg" class="img-responsive" alt=""></a></li>
					<li><a href="singlepage.html"><img
							src="${ctp}/images/m3.jpg" class="img-responsive" alt=""></a></li>
				</ul>
			</div>


			<p>Lorem ipsum ex vix illud nonummy, novum tation et his. At vix
				scripta patrioque scribentur, at pro</p>
		</div>
	</div>
</div>



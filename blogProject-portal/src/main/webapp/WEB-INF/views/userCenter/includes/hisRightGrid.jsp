<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<div class="col-md-3 technology-right">

	<div class="blo-top1">

		<div class="tech-btm">
			<div class="divleft">个人介绍</div>
			<div class="divright"></div>
			<!--<a class="inline" data-action="start-edit-intro" href=""><i class="iconfont ic-edit-s"></i>编辑</a>-->
			</br>


			<c:if test="${not empty hisuser.userSelfIntroduction}">
				<div id="selfIntroduction">${user.userSelfIntroduction }</div>
			</c:if>

			<c:if test="${empty hisuser.userSelfIntroduction}">
				<div id="selfIntroduction">暂无个人介绍</div>
			</c:if>

			<hr>

			<h4>${hisuser.userName }</h4>
			<div class="blog-grids wow fadeInDown" data-wow-duration=".8s"
				data-wow-delay=".2s">
				<div class="blog-grid-left">
					<c:if test="${curPage=='myArticle'}">
						<i style="color: red">Ta的文章</i>
					</c:if>
					<c:if test="${curPage!='myArticle'}">
						<i>Ta的文章</i>
					</c:if>

				</div>
				<div class="blog-grid-right">

					<h5>
						<a
							href="${ctp}/userCenter/toArticlePage?userId=${hisuser.id}&mypage=0">${hisuser.articleNum }</a>
					</h5>
				</div>
				<div class="clearfix"></div>
			</div>

			<div class="blog-grids wow fadeInDown" data-wow-duration=".8s"
				data-wow-delay=".2s">
				<div class="blog-grid-left">

					<c:if test="${curPage=='myFollow'}">
						<i style="color: red">Ta的关注</i>
					</c:if>
					<c:if test="${curPage!='myFollow'}">
						<i>Ta的关注</i>
					</c:if>

				</div>
				<div class="blog-grid-right">

					<h5>
						<a
							href="${ctp}/userCenter/toFollowPage?userId=${hisuser.id}&mypage=0">${hisuser.followNum}</a>
					</h5>
				</div>

				<div class="clearfix"></div>
			</div>
			<div class="blog-grids wow fadeInDown" data-wow-duration=".8s"
				data-wow-delay=".2s">
				<div class="blog-grid-left">

					<c:if test="${curPage=='myFans'}">
						<i style="color: red">Ta的粉丝</i>
					</c:if>
					<c:if test="${curPage!='myFans'}">
						<i>Ta的粉丝</i>
					</c:if>

				</div>
				<div class="blog-grid-right">

					<h5>
						<a
							href="${ctp}/userCenter/toFansPage?userId=${hisuser.id}&mypage=0">${hisuser.followedNum }</a>
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
						<span>${hisuser.userGetlike }</span>
					</h5>
				</div>
				<div class="clearfix"></div>
			</div>
			<div class="blog-grids wow fadeInDown" data-wow-duration=".8s"
				data-wow-delay=".2s">
				<div class="blog-grid-left">
					<c:if test="${curPage=='myLike'}">
						<i style="color: red">Ta的喜欢</i>
					</c:if>
					<c:if test="${curPage!='myLike'}">
						<i>Ta的喜欢</i>
					</c:if>

				</div>
				<div class="blog-grid-right">

					<h5>
						<span>${hisuser.userGetlike }</span>
					</h5>
				</div>
				<div class="clearfix"></div>
			</div>
			<div class="insta wow fadeInDown" data-wow-duration=".8s"
				data-wow-delay=".2s">
				<h4>Ta的文集</h4>
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



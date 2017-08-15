<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="col-md-3 technology-right">

	<div class="blo-top1">

		<div class="tech-btm">
			<div class="divleft">个人介绍</div>
			<div class="divright">
				<a href="#">编辑</a>
			</div>
			<!--<a class="inline" data-action="start-edit-intro" href=""><i class="iconfont ic-edit-s"></i>编辑</a>-->

			</br>
			<div id="selfIntroduction">在此处显示用户的个人介绍</div>
			<hr>

			<h4>Jack</h4>

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
						<a href="${ctp}/userCenter/tomyFollowPage?userId=1">53</a>
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
						<a href="${ctp}/userCenter/tomyFansPage">53</a>
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
						<a href="singlepage.html">53</a>
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
						<a href="singlepage.html">53</a>
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
						<a href="singlepage.html">53</a>
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
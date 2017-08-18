<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<%@include file="/WEB-INF/views/userCenter/includes/css.jsp"%>
<%@include file="/WEB-INF/views/userCenter/includes/jquery.jsp"%>
</head>

<body>


	<div class="fh5co-loader"></div>
	<div id="page">

		<%@include file="/WEB-INF/views/userCenter/includes/navbar.jsp"%>


		<!-- technology-left -->
		<div class="technology">
			<div class="container">
				<div class="col-md-9 technology-left" style="width: 100%">
					<div class="contact-section">
						<h2 class="w3">写博客</h2>


						<div class="contact-grids">
							<div class="col-md-8 contact-grid" style="width: 100%">

								<p>Blog是一个网页，通常由简短且经常更新的帖子（Post，作为动词，表示张贴的意思，作为名字，指张贴的文章）构成，这些帖子一般是按照年份和日期倒序排列的。而作为Blog的内容，它可以是你纯粹个人的想法和心得，包括你对时事新闻、国家大事的个人看法，或者你对一日三餐、服饰打扮的精心料理等，也可以是在基于某一主题的情况下或是在某一共同领域内由一群人集体创作的内容。</p>
								<form action="#" method="post">
									<input type="text" name="Title" value="标题 "
										onfocus="this.value = '';"
										onblur="if (this.value == '') {this.value = '标题';}"
										required="">
									<textarea type="text" name="textarea"
										onfocus="this.value = '';"
										onblur="if (this.value == '') {this.value = '博客内容';}"
										required="">博客内容</textarea>
									<input type="submit" value="提交">
								</form>
							</div>

							<div class="clearfix"></div>
						</div>
						<!--<div class="google-map">
						<iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d424145.8679554096!2d150.65178930803913!3d-33.847403996396665!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x6b129838f39a743f%3A0x3017d681632a850!2sSydney+NSW%2C+Australia!5e0!3m2!1sen!2sin!4v1470643502584" allowfullscreen></iframe>
					</div>-->

					</div>
				</div>
			</div>
			<div class="clearfix"></div>
			<!-- technology-right -->
		</div>

		<!-- technology-right -->
	</div>

	<div class="clearfix"></div>
	<!-- technology-right -->

	<%@include file="/WEB-INF/views/userCenter/includes/footer.jsp"%>



	<script type="text/javascript">
		
	</script>
</body>

</html>
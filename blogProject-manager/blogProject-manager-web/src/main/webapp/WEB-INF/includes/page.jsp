<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<tr>
	<td colspan="9" align="center">
		<ul class="pagination">
			<li><a href="${ctp}/${url}?pn=1">首页</a></li>
			<c:if test="${info.hasPreviousPage}">
				<li><a href="${ctp}/${url}?pn=${info.prePage}">上一页</a></li>
			</c:if>

			<c:forEach items="${info.navigatepageNums}" var="pn">
				<c:if test="${ pn == info.pageNum }">
					<li class="active"><a href="${ctp}/${url}?pn=${info.pageNum}">${pn}<span
							class="sr-only"></span></a></li>
				</c:if>
				<c:if test="${ pn != info.pageNum }">
					<li><a href="${ctp}/${url}?pn=${pn}">${pn}</a></li>
				</c:if>
			</c:forEach>

			<c:if test="${info.hasNextPage}">
				<li><a href="${ctp}/${url}?pn=${info.nextPage}">下一页</a></li>
			</c:if>
			<li><a href="${ctp}/${url}?pn=${info.pages}">末页</a></li>
		</ul>
	</td>
</tr>

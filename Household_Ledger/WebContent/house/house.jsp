<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html>
<title>Fixed Top Navbar Example for Bootstrap</title>
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge;">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

	<!-- Bootstrap core CSS -->
	<link href="${path}/css/bootstrap.min.css" rel="stylesheet">

	<!-- Custom styles for this template -->
	<link href="${path}/css/navbar-fixed-top.css" rel="stylesheet">
	<title>가계부</title>
	<c:set var="path" value="${pageContext.request.contextPath}" scope="application" />
	<jsp:include page="/nav/header.jsp"></jsp:include>
</head>
<body>
	<div class="container-fluid">
		<!-- Main component for a primary marketing message or call to action -->
		<div class="well">
			<div class="row">
				<c:choose>
					<c:when test="${empty requestScope.list}">
						<tr>
							<td colspan="5">
								<p align="center">
									<b><span style="font-size: 9pt;">등록된 상품이 없습니다.</span></b>
								</p>
							</td>
						</tr>
					</c:when>
					<c:otherwise>
						<div class="col-md-6">
							<h2>지출</h2>
							<table class="table">
								<thead>
									<tr>
										<th>소지 유형</th>
										<th>가격</th>
										<th>지출/수입</th>
										<th>잔액</th>
										<th>사용처</th>
										<th>사용 시간</th>
									</tr>
								</thead>
								<c:forEach items="${requestScope.list}" var="house">
									<c:choose>
										<c:when test="${'output' eq house.rec}">
											<tbody>
												<tr>
													<c:choose>
														<c:when test="${null eq house.ownType}">
															<td>현금</td>
														</c:when>
														<c:otherwise>
															<td>${house.ownType}</td>
														</c:otherwise>
													</c:choose>
													<td>지출</td>
													<td>${house.price}</td>
													<td>${house.ownMoney}</td>
													<td>${house.use}</td>
													<td>${house.useTime}</td>
												</tr>
											</tbody>
										</c:when>
									</c:choose>
								</c:forEach>
							</table>
						</div>
						<div class="col-md-6">
							<h2>수입</h2>
							<table class="table">
								<thead>
									<tr>
										<th>소지 유형</th>
										<th>가격</th>
										<th>지출/수입</th>
										<th>잔액</th>
										<th>사용처</th>
										<th>사용 시간</th>
									</tr>
								</thead>
								<c:forEach items="${requestScope.list}" var="house">
									<c:choose>
										<c:when test="${'input' eq house.rec}">
											<tbody>
												<tr>
													<c:choose>
														<c:when test="${null eq house.ownType}">
															<td>현금</td>
														</c:when>
														<c:otherwise>
															<td>${house.ownType}</td>
														</c:otherwise>
													</c:choose>
													<td>수입</td>
													<td>${house.price}</td>
													<td>${house.ownMoney}</td>
													<td>${house.use}</td>
													<td>${house.useTime}</td>
												</tr>
											</tbody>
										</c:when>
									</c:choose>
								</c:forEach>
							</table>
						</div>
					</c:otherwise>
				</c:choose>
			</div>
		</div>
	</div>

	<!-- Bootstrap core JavaScript================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
	<script src="${path}/js/bootstrap.min.js"></script>
	<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
	<script src="../../assets/js/ie10-viewport-bug-workaround.js"></script>
</body>
</html>
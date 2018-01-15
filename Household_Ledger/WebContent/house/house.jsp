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
	<div class="container">	
		<!-- Main component for a primary marketing message or call to action -->
		<div class="jumbotron">
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
					<c:forEach items="${requestScope.list}" var="house">
						<tr>
							<td bgcolor="">
								<p align="center">
									<span style="font-size: 9pt;"> ${house.rec}</span>
								</p>
							</td>
							<td bgcolor="">
								<p>
									<span style="font-size: 9pt;"> ${house.ownType}</span>
									</span>
								</p>
							</td>
						</tr>
					</c:forEach>
				</c:otherwise>
			</c:choose>
		</div>
	</div>

	<!-- Bootstrap core JavaScript================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
	<script src="${path}/js/bootstrap.min.js"></script>
	<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
	<script src="../../assets/js/ie10-viewport-bug-workaround.js"></script>
</body>
</html>
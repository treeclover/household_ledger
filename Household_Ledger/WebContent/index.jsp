<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="kr">
<head>
	<c:set var="path" value="${pageContext.request.contextPath}" scope="application"/>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge;">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
	<c:set var="path" value="${pageContext.request.contextPath}" scope="application" />

	<title>Fixed Top Navbar Example for Bootstrap</title>

	<!-- Bootstrap core CSS -->
	<link href="${path}/css/bootstrap.min.css" rel="stylesheet">

	<!-- Custom styles for this template -->
	<link href="${path}/css/navbar-fixed-top.css" rel="stylesheet">

	<!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
	<!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
	<script src="../../assets/js/ie-emulation-modes-warning.js"></script>

	<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
	<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>

<jsp:include page="nav/header.jsp"></jsp:include>

<body>

	<div class="container">
		<!-- Main component for a primary marketing message or call to action -->
		<div class="jumbotron">
			<!-- 여기부터 작성할 jsp코드 작성하기. -->
			<div class="row">
				<h1>가계부 홈페이지</h1>
			<h4> 반갑습니다 <cite title="Source Title">어서오세요!</cite></h4>
			<h4> 1. 주요기능 <br>
				2) 자료실 형태의 게시판관리 (등록, 수정, 삭제, 검색, 다운로드)
				<P>2. 주요 기술 및 환경
				<p>
					&nbsp;&nbsp; 어서오세요 <br> &nbsp;&nbsp;&nbsp;&nbsp; : 가계부 홈페이지
					입니다.<br>
			</h4>
			<img alt="가계부 샘플 이미지" src="${path}/save/household.png">
			</div>
			<!-- 여기까지 작성할 jsp코드 작성하기. -->
		</div>
		<!-- /container -->
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

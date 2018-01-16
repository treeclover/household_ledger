<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="kr">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge;">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<meta name="description" content="">
<meta name="author" content="">
<link rel="icon" href="../../favicon.ico">

<title>Fixed Top Navbar Example for Bootstrap</title>

<!-- Bootstrap core CSS -->
<link href="css/bootstrap.min.css" rel="stylesheet">

<!-- Custom styles for this template -->
<link href="css/navbar-fixed-top.css" rel="stylesheet">

<!-- Just for debugging purposes. Don'tactually copy these 2 lines! -->
<!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
<script src="../../assets/js/ie-emulation-modes-warning.js"></script>

<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>

	<jsp:include page="nav/header.jsp" /> <!-- 헤더 -->

	<div class="container">
		<div class="jumbotron">
			<c:choose>
				<c:when test="${empty loginUser}">
					<h1>환영합니다</h1>
					<p>아직 회원이 아니세요 ?</p>
					<p> <a href="memberForm.jsp" class="btn btn-primary btn-lg"> 회원가입 </a>&nbsp;&nbsp;&nbsp; </p>
					<form class="form-horizontal" method="post"  action="${pageContext.request.contextPath}/user">
						<fieldset>
							<legend>Login</legend>
							<div class="form-group">
								<label for="userId" class="col-lg-2 control-label">User	Id</label>
								<div class="col-lg-10">
									<input type="text" class="form-control" id="userId" name="userId" placeholder="userId">
								</div>
							</div>
							<div class="form-group">
								<label for="pwd" class="col-lg-2 control-label">Password</label>
								<div class="col-lg-10">
									<input type="password" class="form-control" id="userPwd" name="userPwd" placeholder="password">
								</div>
							</div>
							<div class="form-group">
								<div class="col-lg-10 col-lg-offset-2">
									<button class="btn btn-default"><a href="index.jsp">Cancel</a></button> <!-- 취소 누르면 index로 -->
									<button type="submit" class="btn btn-primary">Submit</button> <!-- 확인 누르면 정보 정확히 입력 했는지 따지고 /user로 -->
								</div>
							</div>
						</fieldset>
					</form>
				</c:when>
				<c:otherwise> <!--  비어있지 않으면 유저와 이름 출력  -->		
					<legend>Login</legend>
					<blockquote>
						<p>가계부 홈페이지에 오신것을 환영합니다!</p>
						<div class="alert alert-dismissible alert-warning">
							<h4>      Welcome!</h4>
							<p><a>    ${loginUser} 님 어서오세요 ! </a></p>  <!-- 세션에 들어와있어야 출력 가능 --> 
							<p><button class="btn btn-default"><a href="memberUpdate.jsp">회원수정</a></button></p>
						</div>
					</blockquote>
				</c:otherwise>
			</c:choose>
		</div>
	</div>


	<!-- Bootstrap core JavaScript
    ================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
	<script src="../../assets/js/ie10-viewport-bug-workaround.js"></script>
</body>
</html>


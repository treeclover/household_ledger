<!--  회원수정   ------------------------------------------------------------------------------------- -->
<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
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

<!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
<!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
<script src="../../assets/js/ie-emulation-modes-warning.js"></script>

<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
    <style>
  table {border: 5px groove pink; width:500px}
  td,th{border:1px black solid ;  padding:10px}
  input{border:solid 1px gray}
  
</style>
</head>
<body>

	<jsp:include page="nav/header.jsp" />
	 
	<div class="container">
	<form method="post" action="${pageContext.request.contextPath}/UpdateServlet">
<table cellspacing="0" align="center">
   <caption><h2> 회원수정 </h2></caption>
  <tr>
	<td width="100px">ID</td>
	<td width="400px"> ${loginUser} </td>
  </tr>
  <tr>
	<td>PWD</td>
	<td><input type="password" name="userPwd" /></td>
  </tr>
  <tr>
	<td>name</td>
	<td><input type="text" name="name" /></td>
  </tr>
  <tr>
	<td>birthDate</td>
	<td><input type="text" name="birthDate" /></td>
  </tr>
  <tr>
	<td>emailAddr</td>
	<td><input type="text" name="emailAddr" /></td>
  </tr>
    <tr>
	<td>div</td>
	<td><input type="text" name="div" /></td>
  </tr>
  <tr>
	<td colspan="2" style="text-align: center;background-color: pink">
	<input type="submit" value="회원수정" />
	<a href="#" onclick="history.back(); return false;"><input type="button" value="뒤로가기"></a>
	<a href="memberDelete.jsp" ><input type="button" value="회원삭제"></a>
	</td>
	
  </tr>
  </table> 
</form>
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
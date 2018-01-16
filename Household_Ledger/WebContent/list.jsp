<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<c:set var="path" value="${pageContext.request.contextPath}"
	scope="application" />

<jsp:include page="nav/header.jsp"></jsp:include>
<html>
<head>
<c:set var="path" value="${pageContext.request.contextPath}"
	scope="application" />
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge;">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<c:set var="path" value="${pageContext.request.contextPath}"
	scope="application" />

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

<body>

	<table align="center" border="0" cellpadding="5" cellspacing="2"
		width="100%" bordercolordark="white" bordercolorlight="black">
		<caption>
			<h2 align="center">게시판</h2>
		</caption>
		<colgroup>
			<col width="5%" />
			<col width="10%" />
			<col width="30%" />
			<col width="30%" />
			<col width="5%" />
			<col width="5%" />
			<col width="7%" />
		</colgroup>
		<tr>
			<td bgcolor="skyblue">
				<p align="center">
					<font color="white"><b><span style="font-size: 9pt;">글
								번호</span></b></font>
				</p>
			</td>
			<td bgcolor="skyblue">
				<p align="center">
					<font color="white"><b><span style="font-size: 9pt;">아이디</span></b></font>
				</p>
			</td>
			<td bgcolor="skyblue">
				<p align="center">
					<font color="white"><b><span style="font-size: 9pt;">제목</span></b></font>
				</p>
			</td>
			<td bgcolor="skyblue">
				<p align="center">
					<font color="white"><b><span style="font-size: 9pt;">내용</span></b></font>
				</p>
			</td>

			<td bgcolor="skyblue">
				<p align="center">
					<font color="white"><b><span style="font-size: 9pt;">조회수</span></b></font>
				</p>
			</td>
			<td bgcolor="skyblue">
				<p align="center">
					<font color="white"><b><span style="font-size: 9pt;">첨부
								파일</span></b></font>
				</p>
			</td>
			<td bgcolor="skyblue">
				<p align="center">
					<font color="white"><b><span style="font-size: 9pt;">첨부
								파일</span></b></font>
				</p>
			</td>
			<td bgcolor="skyblue">
				<p align="center">
					<font color="white"><b><span style="font-size: 9pt;">작성
								시간</span></b></font>
				</p>
			</td>
		</tr>

		<c:choose>
			<c:when test="${empty requestScope.list}">
				<tr>
					<td colspan="5">
						<p align="center">
							<b><span style="font-size: 9pt;">등록된 게시물이 없습니다.</span></b>
						</p>
					</td>
				</tr>
			</c:when>
			<c:otherwise>
				<c:forEach items="${requestScope.list}" var="boardDto">
					<tr onmouseover="this.style.background='#eaeaea'"
						onmouseout="this.style.background='white'">
						<td bgcolor="">
							<p align="center">
								<span style="font-size: 9pt;"> ${boardDto.idx}</span>
							</p>
						</td>
						<td bgcolor="">
							<p>
								<span style="font-size: 9pt;"> ${boardDto.userId} </span>
							</p>
						</td>

						<td bgcolor="">
							<p align="center">
								<span style="font-size: 9pt;"> <a
									href="board?command=boardDetail&idx=${boardDto.idx}">
										${boardDto.title} </a>
								</span>
							</p>
						</td>
						<td bgcolor="">
							<p align="center">
								<span style="font-size: 9pt;"> ${boardDto.content}</span>
							</p>
						</td>

						<td bgcolor="">
							<p align="center">
								<span style="font-size: 9pt;"> ${boardDto.viewCount}</span>
							</p>
						</td>
						<td bgcolor="">
							<p align="center">
								<span style="font-size: 9pt;"> </span>
							</p>
						</td>
						<td bgcolor="">
							<p align="center">
								<span style="font-size: 9pt;"> </span>
							</p>
						</td>
						<td bgcolor="">
							<p align="center">
								<span style="font-size: 9pt;"> ${boardDto.writeTime}</span>
							</p>
						</td>
					</tr>
				</c:forEach>
			</c:otherwise>
		</c:choose>
	</table>
	<hr>
	<div align=right>
		<input type="button" value="글쓰기" onclick="Write();">
		<script type="text/javascript">
			function Write() {
				location.href = "Write.jsp";
			}
		</script>
		<script type="text/javascript">
			function test() {
				location.href = "Delete.jsp";
			}
		</script>
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
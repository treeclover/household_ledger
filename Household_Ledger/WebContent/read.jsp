<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<SCRIPT language=javascript>
		function sendUpdate() {
			location.href = "Update.jsp";
		}

		function sendDelete() {
			document.requestForm.command.value = "delete";
			document.requestForm.submit();
		}
	</script>

	<table align="center" cellpadding="5" cellspacing="2" width="600"
		border='1'>
		<tr>
			<td width="1220" height="20" colspan="4" bgcolor="skyblue">
				<p align="center">
					<font color="white" size="3"><b> 게시물 자세히보기</b></font>
				</p>
			</td>
		</tr>
		<tr>
			<td width="100" height="20">
				<p align="right">
					<b><span style="font-size: 9pt;">글쓴이</span></b>
				</p>
			</td>
			<td width="450" height="20" colspan="3"><span
				style="font-size: 9pt;"><b>${requestScope.bdto.userId}</b></span></td>
		</tr>
		<tr>
			<td width="100" height="20">
				<p align="right">
					<b><span style="font-size: 9pt;">등록일</span></b>
				</p>
			</td>
			<td width="300" height="20"><span style="font-size: 9pt;"><b>${requestScope.bdto.writeTime}</b></span>
			</td>
			<td width="100" height="20">
				<p align="right">
					<b><span style="font-size: 9pt;">조회수</span></b>
				</p>
			</td>
			<td width="100" height="20">
				<p>
					<b><span style="font-size: 9pt;"></span>${requestScope.bdto.viewCount}</b>
				</p>
			</td>
		</tr>
		<tr>
			<td width="100" height="20">
				<p align="right">
					<b><span style="font-size: 9pt;">제목</span></b>
				</p>
			</td>
			<td width="450" height="20" colspan="3"><span
				style="font-size: 9pt;"><b>${requestScope.bdto.title}</b></span></td>
		</tr>
		<tr>
			<td width="100" height="200" valign="top">
				<p align="right">
					<b><span style="font-size: 9pt;">내용</span></b>
				</p>
			</td>
			<!-- 브라우저에 글 내용을 뿌려줄 때는 개행문자(\n)가 <br>태그로 변환된 문자열을 보여줘야 한다. -->
			<td width="450" height="200" valign="top" colspan="3"><span
				style="font-size: 9pt;"><b><pre>${requestScope.bdto.content}</pre></b></span></td>
		</tr>



		<tr>
			<td height="20" colspan="4" align="center" valign="middle">
				<!-- 수정시 필요한 데이터들을 hidden으로 숨겨놓고 폼 데이터로 보내준다. --> <input type=hidden
				name="modelNum" value="${bdto.idx}"> <input type=hidden
				name="command" value=""> <input type=button value="수정하기"
				onClick="sendUpdate()"> <input type=button value="삭제하기"
				onClick="sendDelete()">
				</form>

			</td>
		</tr>
	</table>
	<hr>
	<div align=right>
		<input type="button" value="목록으로 돌아가기" onclick="list();">
</body>
</html>
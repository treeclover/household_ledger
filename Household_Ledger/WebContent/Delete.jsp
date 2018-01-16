<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<SCRIPT language=javascript>
		function checkValid() {
			var f = window.document.writeForm;

			if (f.price.value == "") {
				alert("삭제할 글 번호를 입력하세요.");
				f.price.focus();
				return false;
			}

			return true;
		}
	</SCRIPT>
	<form name="Delete" method="post" action="delete"
		onSubmit='return checkValid()'>

		<table align="center" cellpadding="5" cellspacing="2" width="600"
			border="1">

			<tr>
				<td width="1220" height="20" colspan="2" bgcolor="skyblue">
					<p align="center">
						<font color="white" size="3"><b> 삭제하기 </b></font>
					</p>
				</td>
			</tr>

			<tr>
				<td width="150" height="20">
					<p align="right">
						<b><span style="font-size: 9pt;">글 번호</span></b>
					</p>
				</td>
				<td width="450" height="20"><b><span
						style="font-size: 9pt;"> <input type=text name="idx"
							size="50"></span></b></td>
				<td width="450" height="20" colspan="2" align="center"><b><span
						style="font-size: 9pt;"> <input type=submit value=delete>
					</span> </b></td>
			</tr>
		</table>
	</form>

</body>
</html>
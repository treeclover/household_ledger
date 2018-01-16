<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="css/style.css">

<script type="text/javascript">
	function list() {
		location.href = "select";
	}
</script>

<SCRIPT language=javascript>
	function checkValid() {
		var f = window.document.writeForm;

		if (f.price.value == "") {
			alert("제목을 입력해 주세요.");
			f.price.focus();
			return false;
		}
		if (f.description.value == "") {
			alert("내용을 입력해 주세요.");
			f.description.focus();
			return false;
		}
		if (f.password.value == "") {
			alert("");
			f.password.focus();
			return false;
		}

		return true;
	}
</SCRIPT>


</HEAD>
<BODY>

	<form name="writeForm" method="post" action="write"
		onSubmit='return checkValid()' enctype="multipart/form-data">

		<table align="center" cellpadding="5" cellspacing="2" width="600"
			border="1">

			<tr>
				<td width="1220" height="20" colspan="2" bgcolor="skyblue">
					<p align="center">
						<font color="white" size="3"><b> 글쓰기 </b></font>
					</p>
				</td>
			</tr>

			<tr>
				<td width="150" height="20">
					<p align="right">
						<b><span style="font-size: 9pt;">제목</span></b>
					</p>
				</td>
				<td width="450" height="20"><b><span
						style="font-size: 9pt;"> <input type=text name="title"
							size="50"></span></b></td>
			</tr>
			<tr>
				<td width="150" height="20">
					<p align="right">
						<b><span style="font-size: 9pt;">내용</span></b>
					</p>
				</td>
				<td width="450" height="20"><b><span
						style="font-size: 9pt;"> <textarea name="content" cols="50"
								rows="10"></textarea></span></b></td>
			</tr>

			<tr>
				<td width="150" height="20">
					<p align="right">
						<b><span style="font-size: 9pt;">파일첨부</span></b>
					</p>
				</td>
				<td width="450" height="20"><b><span
						style="font-size: 9pt;"> <input type="file" name="fileName"
							maxlength="60" size="40">
					</span></b></td>
			</tr>
			<tr>
				<td width="450" height="20" colspan="2" align="center"><b><span
						style="font-size: 9pt;"> <input type=submit value=insert><b>
						</b>

					</span></b></td>
			</tr>
		</table>

	</form>

	<hr>
	<div align=right>
		<input type="button" value="돌아가기" onclick="go();">
		<script type="text/javascript">
			function go() {
				location.href = "index.jsp";
			}
		</script>
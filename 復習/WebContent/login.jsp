<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <jsp:useBean id = "user" scope ="session" class = "復習.LoginUserBean"></jsp:useBean>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Java入門</title>
<link href="/schoo/WEB-sample10/css/login.css" rel="stylesheet" type="text/css" />
</head>
<body>
<div class ="login_pane">
	<h1>ログイン画面</h1>
	<h2>ログインIDとパスワードを入力してください</h2>
	<form action = "../LoginServlet" method = "post">
		<table class = "table_form">
			<tbody>
				<tr>
					<th>ログインID</th>
				</tr>
				<tr>
					<th>パスワード</th>
					<td><input type = "password" name = "pass"></td>
					</tr>
				
			</tbody>
			</table>
			<input class = "common_button" type = "submit" name = "submit" value = "ログイン"/>
	</form>
</div>
</body>
</html>
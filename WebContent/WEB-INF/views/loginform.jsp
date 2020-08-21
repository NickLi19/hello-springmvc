<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
<style>
	span {
		color: red;
	}
</style>
</head>
<body>
	<form:form method="post" action="login" modelAttribute="loginForm">
		<form:label path="username" for="username">
			Username
		</form:label>
		<form:input path="username" />
		<span><form:errors path="username" /></span>
		<br />
		<form:label path="password" for="password">
			Password
		</form:label>
		<form:password path="password" />
		<span><form:errors path="password" /></span>
		<br />
		<input type="submit" value="OK" />
	</form:form>
</body>
</html>
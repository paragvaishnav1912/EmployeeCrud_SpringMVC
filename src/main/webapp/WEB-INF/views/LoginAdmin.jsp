<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<link rel="stylesheet"
	href="<c:url value ="/resources/css/loginStyle.css"/>">
</head>
<body>
	<div class="login">
		<div class="imgLogo">
			<img src="/resources/images/login.png" alt="">
		</div>
		<form action="/login" method="post">
			<div class="inputOne">
				<div class="labels">UserName:</div>
				<div class="inputTags">
					<input type="text" name="userEmail" id=""
						placeholder="Enter your Username">
				</div>
			</div>
			<div class="inputOne">
				<div class="labels">Password:</div>
				<div class="inputTags">
					<input type="password" placeholder="Enter your Password"
						name="userPassword">
				</div>
			</div>
			<div class="inputOne">
				<div class="inputTags">
					<input type="checkbox" name="choice"><label>Remember
						Me</label>
				</div>
			</div>
			<div class="inputOne">
				<div class="inputTags">
					<input type="submit" value="Login">
				</div>
			</div>
			<a class="bottom" href="/registerPage">Not have an Account ?
				Create New One</a>
		</form>
	</div>
</body>
</html>
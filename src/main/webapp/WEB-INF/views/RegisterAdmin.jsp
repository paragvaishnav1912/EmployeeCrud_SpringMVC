<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
<link rel="stylesheet" href="<c:url value ="/resources/css/regStyle.css"/>">
</head>
<body>
	<div class="container">
		<div class="sideImg">
			<img src="/resources/images/sideImg.jpg" alt="">
		</div>
		<div class="regForm">
			<div class="logo">
				<img src="/resources/images/reg.png">
				<h2 align="center">Register YourSelf</h2>
			</div>
			<form:form action="/saveUser" id="frmReg" method="post">
				<div class="inputBox">
					<div class="labels">
						<label>Your Name:</label>
					</div>
					<div class="inputTags">
						<input type="text" name="userName" placeholder="Enter Your Name">
					</div>
				</div>
				<div class="inputBox">
					<div class="labels">
						<label>Your Email'Id:</label>
					</div>
					<div class="inputTags">
						<input type="text" name="userEmail" placeholder="Enter Your Password">
					</div>
				</div>
				<div class="inputBox">
					<div class="labels">
						<label>Password:</label>
					</div>
					<div class="inputTags">
						<input type="password" name="userPassword"
							placeholder="Enter Your Password">
					</div>
				</div>
				<div class="inputBox">
					<div class="labels">
						<label>Re-Password:</label>
					</div>
					<div class="inputTags">
						<input type="password" name="userPassword1"
							placeholder="Re-Enter Your Password">
					</div>
				</div>
				<div class="inputBox">
					<div class="labels">
						<label></label>
					</div>
					<div class="inputTags">
						<input type="submit" name="user" value="Submit">
					</div>
				</div>
				<a href="/">Already have an Account?</a>
				<form:errors path="desc" cssClass="text-warning"/>
			</form:form>
		</div>
	</div>
</body>
</html>
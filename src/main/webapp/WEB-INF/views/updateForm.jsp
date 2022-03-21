<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>EmployeeForm</title>
<link rel="stylesheet" href="<c:url value ="/resources/css/style.css"/>">
</head>
<body>
	<h1 id="headerInfo" align="center">Employee CRUD Tool</h1>
	<div class="container1">
		<div class="header">
			<h4>Add Employee</h4>
		</div>
		<form id="employeeForm" action="/updateData/${employee.eid}" method="post">
			<div class="input_tags">
				<div class="tags">
					<label>Name:</label>
					<div class="innerTag">
						<input class="inputs" type="text" name="ename"
							value="${employee.ename}" placeholder="Enter Name">
						<p class="msg"></p>
					</div>
				</div>
				<div class="tags">
					<label>Gender:</label>
					<div class="innerTag">
						<div class="radio">
						<c:if test="${employee.gen == 'male'}">
							<input type="radio" value="male" name="gen" checked="true" id="">Male
							<input type="radio" value="female" name="gen" id="">FeMale
						</c:if>
						<c:if test="${employee.gen == 'female'}">
							<input type="radio" value="male" name="gen" id="">Male
							<input type="radio" value="female" name="gen" id="" checked="true">FeMale
						</c:if>
						</div>
					</div>
				</div>
				<div class="tags">
					<label for="">Date Of Birth:</label>
					<div class="innerTag">
						<input class="inputs" type="date" value="${employee.dob}"
							name="dob">
					</div>
				</div>
				<div class="tags">
					<label>Email :</label>
					<div class="innerTag">
						<input type="text" class="inputs" name="email"
							value="${employee.email}" placeholder="Enter Email" />
						<p class="msg"></p>
					</div>
				</div>
				<div class="tags">
					<label for="">Phone No:</label>
					<div class="innerTag">
						<input class="inputs" type="text" name="phno"
							value="${employee.phno}" placeholder="Enter Phone Number">
						<p class="msg"></p>
					</div>
				</div>
				<div class="tags">
					<label for="">Designation:</label>
					<div class="innerTag">
						<input class="inputs" type="text" name="desgination"
							value="${employee.desgination}"
							placeholder="Enter Your Designation">
						<p class="msg"></p>
					</div>
				</div>
				<div class="tags">
					<div class="innerTag">
						<input class="btn" type="submit" value="Update">
					</div>
				</div>
			</div>
		</form>
	</div>
</body>
</html>
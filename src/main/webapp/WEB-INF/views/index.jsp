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
		<form id="employeeForm" action="/processPage" method="post">
			<div class="input_tags">
				<div class="tags">
					<label>Name:</label>
					<div class="innerTag">
						<input class="inputs" type="text" name="ename"
							placeholder="Enter Name">
						<p class="msg"></p>
					</div>
				</div>
				<div class="tags">
					<label>Gender:</label>
					<div class="innerTag">
						<div class="radio">
							<input type="radio" value="male" name="gen" checked="true" id="">Male
							<input type="radio" value="female" name="gen" id="">FeMale
						</div>
						<!-- <p class="msg"></p> -->
					</div>

				</div>
				<div class="tags">
					<label for="">Date Of Birth:</label>
					<div class="innerTag">
						<input class="inputs" type="date" name="dob">
						<p class="msg"></p>
					</div>
				</div>
				<div class="tags">
					<label>Email :</label>
					<div class="innerTag">
						<input type="text" class="inputs"  name="email"
							placeholder="Enter Email" />
						<p class="msg"></p>
					</div>
				</div>
				<div class="tags">
					<label for="">Phone No:</label>
					<div class="innerTag">
						<input class="inputs" type="text" name="phno"
							placeholder="Enter Phone Number">
						<p class="msg"></p>
					</div>
				</div>
					<div class="tags">
					<label for="">Designation:</label>
					<div class="innerTag">
						<input class="inputs" type="text" name="desgination"
							placeholder="Enter Your Designation">
						<p class="msg"></p>
					</div>
				</div>
				<div class="tags">
					<div class="innerTag">
						<input  class="btn" type="submit" value="Submit">
					</div>
				</div>
			</div>
		</form>
	</div>

	<div id="display1">
		<h3 id="header1" align="center">Employee Data</h3>
		<div id="di" class="display">
			<div class="header_below">
				<h4>Display Details</h4>
			</div>
			<table id="tbl">
				<thead>
					<tr>
						<th>Name</th>
						<th>Gender</th>
						<th>DOB</th>
						<th>Email Id</th>
						<th>Phone No</th>
						<th>Hobby</th>
						<th>Operation</th>
					</tr>
					<c:forEach var="emp" items="${data}" varStatus="emplcnt">	
						<tr>
							<td>${emp.ename}</td>
							<td>${emp.gen}</td>
							<td>${emp.dob}</td>
							<td>${emp.email}</td>
							<td>${emp.phno}</td>
							<td>${emp.desgination}</td>
							<td><a href="editData/${emp.eid}" class="btns">Edit</a>
								<a href="deleteData/${emp.eid}" class="btns">Delete</a>
							</td>
						</tr>
					</c:forEach>
				</thead>
				<tbody>

				</tbody>
			</table>

		</div>
	</div>
</body>
</html>
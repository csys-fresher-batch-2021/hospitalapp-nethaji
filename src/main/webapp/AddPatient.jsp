<%@page import="java.util.List"%>
<%@page import="in.nethaji.service.PatientReason"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Patient - Add</title>
</head>
<body>
	<jsp:include page="Header.jsp"></jsp:include>
	<main class="container-fluid">
		<h3>Add Patient Record</h3>
		<form action="AddPatientServlet">
			<label for="patientName">Patient Name:</label> <input type="text"
				name="patientName" pattern="[A-Za-z\s]{3,20}"
				placeholder="Enter Patient name" required autofocus /> <br /> <br />
			<label for="age">Age:</label> <input type="number" id="age"
				name="age" min="1" max="100"> <br /> <br /> <label
				for="gender">Gender:</label> <br /> <input type="radio"
				name="gender" value="male"> Male<br /> <input type="radio"
				name="gender" value="female"> Female<br /> <input
				type="radio" name="gender" value="other"> Other <br /> <label
				for="reason">Reason:</label> <select name="reason" required>
				<option selected disabled value="">--select reason--</option>
				<%
				List<String> reasonList = PatientReason.getReasonList();
				for (String reason : reasonList) {
				%>
				<option value="<%=reason%>"><%=reason%></option>
				<%
				}
				%>
			</select> <br />
			<button type="submit">Register</button>
		</form>
	</main>
</body>
</html>
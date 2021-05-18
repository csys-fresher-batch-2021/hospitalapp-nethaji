<%@page import="in.nethaji.service.DoctorSpecialist"%>
<%@page import="in.nethaji.service.DoctorService"%>
<%@page import="java.util.List"%>
<%@page import="in.nethaji.model.Doctor"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>HospitalApp - Add Doctor</title>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	<main class="container-fluid">
		<h3>Add Doctor Record</h3>
		<form action="AddDoctorServlet">
			<label for="doctorName">Doctor Name</label> <input type="text"
				name="doctorName" pattern="[A-Za-z\s]{3,20}"
				placeholder="Enter Doctor name" required autofocus /> <br /> <br />
			<label for="specialist"> Specialist </label> 
			
			<select name="specialist" required>
			<option selected disabled value="">--Select Specialist--</option>
				<%
				List<String> specialistInfo = DoctorSpecialist.getSpecialistList();
				
				for (String specialist : specialistInfo) {
				%>
				<option value="<%=specialist %>"><%=specialist%></option>
				<%
				}
				%>
			</select><br />
			<button type="submit">Submit</button>

		</form>
	</main>
</body>
</html>
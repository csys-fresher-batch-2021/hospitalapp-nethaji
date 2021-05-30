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
	<jsp:include page="Header.jsp"></jsp:include>
	<main class="main">
		<form action="AddDoctorServlet">
			<h1>Add Doctor Record</h1>
			<br /> <label for="doctorName">Doctor Name</label> <input
				type="text" name="doctorName" pattern="[A-Za-z\s]{3,20}"
				placeholder="Enter Doctor name" required autofocus /> <br /> <br />
			<label for="specialist"> Specialist </label> <select
				name="specialist" required>
				<option selected disabled value="">--Select Specialist--</option>
				<%
				List<String> specialistInfo = DoctorSpecialist.getSpecialistList();

				for (String specialist : specialistInfo) {
				%>
				<option value="<%=specialist%>"><%=specialist%></option>
				<%
				}
				%>
			</select><br />
			<div style="text-align: center">
				<jsp:include page="Message.jsp"></jsp:include><br />
				<button>Submit</button>
			</div>

		</form>
	</main>
</body>
</html>
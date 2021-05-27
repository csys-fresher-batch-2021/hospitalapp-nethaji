<%@page import="in.nethaji.model.Doctor"%>
<%@page import="java.util.List"%>
<%@page import="in.nethaji.service.DoctorService"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>List of Doctors</title>
</head>
<body>
<%
String loggedInUsername = (String)session.getAttribute("LOGGED_IN_ADMIN");
String role = (String)session.getAttribute("ROLE");
%>
	<jsp:include page="Header.jsp"></jsp:include>
	<main class="container-fluid">
		<h3>List of Doctors</h3>
		<%if(loggedInUsername != null && role != null && role.equalsIgnoreCase("ADMIN")){ %>
		<a href="AddDoctor.jsp">Add Doctor</a><br />
		<% } %>
		<table class="table table-bordered">
			<caption>List of Available Doctors</caption>
			<thead>
				<tr>
					<th scope="col">S.no</th>
					<th scope="col">Doctor name</th>
					<th scope="col">Specialist</th>
					<th scope="col">Delete</th>
				</tr>
			</thead>
			<tbody>
				<%
				DoctorService doctorService = new DoctorService();
				List<Doctor> doctorInfo = doctorService.getDoctors();
				int i = 0;
				for (Doctor doctor : doctorInfo) {
					i++;
				%>
				<tr>
					<td><%=i%></td>
					<td>Dr.<%=doctor.getDoctorName()%></td>
					<td><%=doctor.getSpecialist()%></td>
					<%if(loggedInUsername != null && role != null && role.equalsIgnoreCase("ADMIN")){ %>
					<td><a
						href="DeleteDoctorServlet?doctorName=<%=doctor.getDoctorName()%>"
						class="btn btn-danger">Delete</a></td>
					<%} %>
				</tr>
				<%
				}
				%>
			</tbody>
		</table>

		<br />

	</main>

</body>
</html>
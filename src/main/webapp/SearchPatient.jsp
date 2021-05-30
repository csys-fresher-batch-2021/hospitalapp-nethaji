<%@page import="in.nethaji.service.PatientService"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="in.nethaji.model.Patient"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Patient | Search Patient</title>
</head>
<body>
	<%
	String loggedInAsAdmin = (String) session.getAttribute("LOGGED_IN_ADMIN");
	String loggedInAsUser = (String) session.getAttribute("LOGGED_IN_USER");
	String role = (String) session.getAttribute("ROLE");
	if (loggedInAsAdmin == null && loggedInAsUser == null) {
		response.sendRedirect("Index.jsp");
	} else {
		response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.1.
		response.setHeader("Pragma", "no-cache"); // HTTP 1.0.
		response.setDateHeader("Expires", 0);
	}
	%>
	<jsp:include page="Header.jsp"></jsp:include>
	<main class="main">
		<table class="table table-bordered">
			<caption>List of Available Patients</caption>
			<h1>Search Patient</h1>
			<br />
			<caption>List of Search Patients</caption>
			<thead>
				<tr>
					<th scope="col">S.no</th>
					<th scope="col">Name</th>
					<th scope="col">Age</th>
					<th scope="col">Gender</th>
					<th scope="col">reason</th>
					<%
					if (loggedInAsAdmin != null && role != null && role.equalsIgnoreCase("ADMIN")) {
					%>
					<th scope="col">Delete</th>
					<%
					}
					%>
				</tr>
			</thead>
			<tbody>
				<%
				Patient patient = (Patient) request.getAttribute("patientName");
				int i = 1;
				%>
				<%
				if (patient != null) {
				%>
				<tr>
					<td><%=i%></td>
					<td><%=patient.getPatientName()%></td>
					<td><%=patient.getPatientAge()%></td>
					<td><%=patient.getPatientGender()%></td>
					<td><%=patient.getReason()%></td>
					<%
					if (loggedInAsAdmin != null && role != null && role.equalsIgnoreCase("ADMIN")) {
					%>
					<td><a
						href="DeletePatientServlet?patientName=<%=patient.getPatientName()%>"
						class="btn btn-danger">Delete</a></td>
					<%
					}
					%>
				</tr>
				<%
				} else {
				%>
				<h2>No Record Found</h2>
				<%
				}
				%>


			</tbody>
		</table>
	</main>
</body>
</html>
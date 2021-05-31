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
		<h1>List of Doctors</h1>
		<%
		if (loggedInAsAdmin != null && role != null && role.equalsIgnoreCase("ADMIN")) {
		%>
		<a href="AddDoctor.jsp" class="btn btn-primary">Add Doctor</a><br />
		<br />
		<%
		}
		%>
		<table class="table table-bordered">
			<caption>List of Available Doctors</caption>
			<thead>
				<tr>
					<th scope="col">S.no</th>
					<th scope="col">Doctor Id</th>
					<th scope="col">Doctor name</th>
					<th scope="col">Specialist</th>
					<%
					if (loggedInAsAdmin != null && role != null && role.equalsIgnoreCase("ADMIN")) {
					%>
					<th scope="col">Edit</th>
					<th scope="col">Delete</th>
					<%
					}
					%>
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
					<td><%=doctor.getDoctorId()%></td>
					<td>Dr.<%=doctor.getDoctorName()%></td>
					<td><%=doctor.getSpecialist()%></td>
					<%
					if (loggedInAsAdmin != null && role != null && role.equalsIgnoreCase("ADMIN")) {
					%>
					<td><a
						href="EditDoctorServlet?doctorId=<%=doctor.getDoctorId()%>"
						class="btn btn-primary">Edit</a></td>
					<td><a
						href="DeleteDoctorServlet?doctorId=<%=doctor.getDoctorId()%>"
						class="btn btn-danger">Delete</a></td>
					<%
					}
					%>
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
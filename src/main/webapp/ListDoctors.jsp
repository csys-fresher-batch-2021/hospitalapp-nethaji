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
	<jsp:include page="header.jsp"></jsp:include>
	<main class="container-fluid">
		<h3>List of Doctors</h3>
		<a href="AddDoctor.jsp">Add Doctor</a><br />
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
				List<Doctor> doctorInfo = DoctorService.getDoctors();
				int i = 0;
				for (Doctor doctor : doctorInfo) {
					i++;
				%>
				<tr>
					<td scope="col"><%=i%></td>
					<td scope="col">Dr.<%=doctor.getDoctorName()%></td>
					<td scope="col"><%=doctor.getSpecialist()%></td>
					<td scope="col"><a
						href="DeleteDoctorServlet?doctorName=<%=doctor.getDoctorName()%>"
						class="btn btn-danger">Delete</a>
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
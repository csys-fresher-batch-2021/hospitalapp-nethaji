<%@page import="in.nethaji.model.Patient"%>
<%@page import="java.util.List"%>
<%@page import="in.nethaji.service.PatientService"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>HospitalApp - Patients</title>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	<main class="container-fluid">
		<h3>List of Patient</h3>
		<a href="AddPatient.jsp">Add Patient</a><br />
		<table class="table table-bordered">
			<caption>List of Available Patients</caption>
			<thead>
				<tr>
					<th scope="col">S.no</th>
					<th scope="col">Id</th>
					<th scope="col">Name</th>
					<th scope="col">Age</th>
					<th scope="col">Gender</th>
					<th scope="col">reason</th>
					<th scope="col">Delete</th>
				</tr>
			</thead>
			<tbody>
				<%
				List<Patient> patientInfo = PatientService.getPatients();
				int i = 0;
				int j = 100;
				for (Patient patient : patientInfo) {
					i++;
					j++;
				%>
				<tr>
					<td><%=i%></td>
					<td><%=j%></td>
					<td><%=patient.getPatientName()%></td>
					<td><%=patient.getPatientAge()%></td>
					<td><%=patient.getPatientGender()%></td>
					<td><%=patient.getReason()%></td>
					<td><a
						href="DeletePatientServlet?patientName=<%=patient.getPatientName()%>"
						class="btn btn-danger">Delete</a></td>
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
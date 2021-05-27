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
<% 
String loggedInUsername = (String)session.getAttribute("LOGGED_IN_ADMIN");
String role = (String)session.getAttribute("ROLE"); %>
	<jsp:include page="Header.jsp"></jsp:include>
	<main class="container-fluid">
		<h3>List of Patient</h3>
		<% if(loggedInUsername != null && role != null && role.equalsIgnoreCase("ADMIN")){ %>

		<a href="AddPatient.jsp">Add Patient</a><br />
		<% } %>
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
			<tbody id="patient-tbl">
			</tbody>
		</table>

		<br />

		<script>
function getAllPatient(){
	console.log("Fetching all Patients");
	let url = "DisplayPatientDetails";
	fetch(url).then(res=> res.json()).then(res=>{
		let patients = res;
		console.log("Got response from servlet");
		console.log(patients);
		let content = "";
		i=0;
		j=100;
		for(let patient of patients){
			content +="<tr> "+
			"<td>" + ++i +"</td>" +
			"<td>"+ ++j +"</td>" +
			"<td>"+patient.patientName +"</td>" +
			"<td>"+patient.patientAge+ 	"</td>" + 
			"<td>"+patient.patientGender+"</td>" +
			"<td>"+patient.reason+"</td>"+
			"<td><a href='DeletePatientServlet?patientName=" + patient.patientName +"' class='btn btn-danger'>Delete</a></td>"+
			"</tr>";
		}
		console.log(content);
		
		document.querySelector("#patient-tbl").innerHTML= content;
		
	});
	
}
getAllPatient();
</script>


	</main>

</body>
</html>
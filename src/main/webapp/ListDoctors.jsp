<%@page import="in.nethaji.model.Doctor"%>
<%@page import="java.util.List"%>
<%@page import="in.nethaji.service.DoctorService"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List of Doctors</title>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	<main class="container-fluid">
	<h3>List of Doctors</h3>
	<table class="table table-bordered">
	<thead>
    <tr>
      <th>S.no</th>
      <th>Doctor name</th>
      <th>Specialist</th>
    </tr>
  	</thead>
  	<tbody>
  	<%
  	List<Doctor> doctorInfo = DoctorService.getDoctors(); 
  	  	int i=0;
  	  	for(Doctor doctor : doctorInfo){
  	  		i++;
  	%>
  	   <tr>
  	     <td><%=i %></td>
    	 <td>Dr.<%=doctor.getDoctorName() %></td>
    	 <td><%=doctor.getSpecialist() %> </td>
   	   </tr>
   	  <% } %>
  	</tbody>
	</table>
	</main>
	
</body>
</html>
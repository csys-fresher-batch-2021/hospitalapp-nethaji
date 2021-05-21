<%@page import="in.nethaji.service.MedicineService"%>
<%@page import="in.nethaji.model.Medicine"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>HospitalApp - Medicine</title>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	<main class="container-fluid">
		<h3>List of Medicine</h3>
		<a href="AddMedicine.jsp">Add Medicine</a><br />
		<table class="table table-bordered">
			<caption>List of Available Medicine</caption>
			<thead>
				<tr>
					<th scope="col">Id</th>
					<th scope="col">Medicine name</th>
					<th scope="col">Price</th>
					<th scope="col">Expiry Date</th>
					<th scope="col">Quantity</th>
				</tr>
			</thead>
			<tbody>
				<%
				List<Medicine> medicineInfo = MedicineService.getMedicineList();
				int i = 10;
				for (Medicine medicine : medicineInfo) {
					i++;
				%>
				<tr>
					<td><%=i%></td>
					<td><%=medicine.getMedicineName()%></td>
					<td><%=medicine.getMedicinePrice()%></td>
					<td><%=medicine.getMedicineExpiry() %></td>
					<td><%=medicine.getQuantity() %></td>
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
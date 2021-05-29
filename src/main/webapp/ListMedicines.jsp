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
		<h1>List of Medicine</h1>
		<%
		if (loggedInAsAdmin != null && role != null && role.equalsIgnoreCase("ADMIN")) {
		%>
		<a href="AddMedicine.jsp">Add Medicine</a><br />
		<%
		}
		%>
		<table class="table table-bordered">
			<caption>List of Available Medicine</caption>
			<thead>
				<tr>
					<th scope="col">Id</th>
					<th scope="col">Medicine name</th>
					<th scope="col">Price</th>
					<th scope="col">Expiry Date</th>
					<th scope="col">Days Remaining</th>
					<th scope="col">Quantity</th>
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
				MedicineService medicineService = new MedicineService();
				List<Medicine> medicineInfo = medicineService.getMedicineList();
				int i = 10;
				for (Medicine medicine : medicineInfo) {
					i++;	
				%>
				<tr>
					<td><%=i%></td>
					<td><%=medicine.getMedicineName()%></td>
					<td><%=medicine.getPrice()%></td>
					<td><%=medicine.getExpiryDate()%></td>
					<td><%=medicine.getUsedIn() %></td>
					<td><%=medicine.getQuantity()%></td>
					<%
					if (loggedInAsAdmin != null && role != null && role.equalsIgnoreCase("ADMIN")) {
					%>
					<td><a
						href="DeleteMedicineServlet?medicineName=<%=medicine.getMedicineName()%>"
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
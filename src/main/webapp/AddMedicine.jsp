<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Medicine - Add Medicine</title>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	<main class="container-fluid">
		<h3>Add Medicine Record</h3>
		<form action="AddMedicineServlet">
			<label for="medicineName">Medicine Name:</label> <input type="text"
				name="medicineName" pattern="[A-Za-z\s]{3,20}"
				placeholder="Enter Medicine name" required autofocus /> <br /> <br />
			<label for="price">Price:</label> <input type="text" id="price"
				name="price" min="1" max="10000"> <br /> <br /> <label
				for="expiryDate">Expired Date:</label> <input type="date"
				id="expiryDate" name="expiryDate"> <br /> <br /> <label
				for="quantity">Quantity:</label> <input type="number" id="quantity"
				name="quantity" min="1" max="1000"> <br /> <br />

			<button type="Submit">Add Medicine</button>
		</form>
	</main>
</body>
</html>
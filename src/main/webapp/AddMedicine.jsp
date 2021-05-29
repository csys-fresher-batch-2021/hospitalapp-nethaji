<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Medicine - Add Medicine</title>
<link rel="stylesheet" href="css/style.css">
</head>
<body>
	<jsp:include page="Header.jsp"></jsp:include>
	<main class="main">

		<form action="AddMedicineServlet">
			<h1>Add Medicine Record</h1>
			<label for="medicineName">Medicine Name:</label> <input type="text"
				name="medicineName" pattern="[A-Za-z\s]{3,20}"
				placeholder="Enter Medicine name" required autofocus /> <br /> <br />
			<label for="price">Price:</label> <input type="text" id="price"
				name="price" min="1" max="10000"> <br /> <br /> <label
				for="expiryDate">Expired Date:</label> <input type="date"
				id="expiryDate" name="expiryDate"> <br /> <br /> <a
				href="" onclick="CheckExpiryDate()">Click to calculate Expiry
				Date</a><br> <label for="expiry"> Used In: </label> <input
				type="number" id="expiry" name="expiry"
				placeholder="Calculate Expiry date" readonly> <br> <label
				for="quantity">Quantity:</label> <input type="number" id="quantity"
				name="quantity" min="1" max="1000"> <br /> <br />

			<button type="Submit">Add Medicine</button>
		</form>
	</main>
	<script>
		// Calculating Expiry Date

		function CheckExpiryDate() {
			event.preventDefault();
			var expiryDate = new Date(document.querySelector("#expiryDate").value);
			var expiration = moment(expiryDate).format("YYYY-MM-DD");
			var current_date = moment().format("YYYY-MM-DD");
			var expiry = moment(expiration).diff(current_date, 'days');
			document.getElementById("expiry").value = expiry;
			return expiry;
		}
	</script>

</body>
</html>
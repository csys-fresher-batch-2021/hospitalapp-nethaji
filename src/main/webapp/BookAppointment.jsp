<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Book Appointment</title>
</head>
<body>
	<jsp:include page="Header.jsp"></jsp:include>
	<main class="main">
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

		<form action="BookAppointmentServlet">
			<h1>Book Appointment</h1>
			<label for="patientName">Patient Name:</label> <input type="text"
				name="patientName" pattern="[A-Za-z\s]{3,20}"
				placeholder="Enter Patient name" required autofocus /> <br /> <br />
			<label for="age">Age:</label> <input type="number" id="age"
				name="age" min="1" max="100"> <br /> <br /> <label
				for="phoneNumber">Phone number:</label> <input type="number"
				id="phoneNumber" name="phoneNumber" pattern="[789][0-9]{9}"><br />
			<br /> <label for="gender">Gender:</label> <br /> <input
				type="radio" name="gender" value="male"> Male <input
				type="radio" name="gender" value="female">&nbsp; Female
			&nbsp;<input type="radio" name="gender" value="other"> Other
			<br /> <br /> <input type="hidden" name="doctorId"
				value="<%=request.getParameter("doctorId")%>">
			<div style="text-align: center">
				<jsp:include page="Message.jsp"></jsp:include><br />
				<button type="Submit">BOOK</button>
			</div>
		</form>
	</main>

</body>
</html>
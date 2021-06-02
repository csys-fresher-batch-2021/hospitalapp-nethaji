<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Hospital | Wards</title>
<style>
body {
	background-image: url("img/bg4.jpg");
	background-repeat: no-repeat;
	background-size: cover;
	backgroud-position: center;
}

form {
	border: 5px solid #008CBA !important;
	margin-left: 20px !important;
}

.btn {
	font-size: 20px !important;
	padding: 20px !important;
	border-radius: 10px !important;
	width: 100% !important;
}
</style>
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
		<h3 style="color: #008CBA">Hospital Management System</h3>
		<form action="WardSelectionServlet" method="get">
			<%
			if (loggedInAsUser != null) {
			%>
			<a href="WardSelectionServlet?specialist=General" class="btn btn-primary"> General ward </a> <br/ >
			<br /> <a href="WardSelectionServlet?specialist=ENT" class="btn btn-primary"> ENT </a>
			<br/ > <br /> <a href="WardSelectionServlet?specialist=Cardiology"
				class="btn btn-primary"> Cardiology </a> <br/ > <br /> <a
				href="WardSelectionServlet?specialist=ophthalmologist" class="btn btn-primary">
				ophthalmologist </a> <br/ > <br />
			<%
			}
			%>
		</form>
	</main>
</body>
</html>
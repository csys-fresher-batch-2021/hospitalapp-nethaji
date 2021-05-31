<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Hospital | Login</title>
<link rel="stylesheet" href="css/style.css">
<style>
body {
	background-image: url("img/bg.jpg");
	background-repeat: repeat;
	background-size: cover;
}
</style>
</head>
<body>
	<%
	String loggedInUsername = (String) session.getAttribute("LOGGED_IN_USER");
	%>
	<jsp:include page="LoginHeader.jsp"></jsp:include>
	<main class="main">
		<form action="UserLoginServlet" method="post">
			<h1>User Login</h1>
			<br> <label for="username"> Username: </label> <input
				type="text" id="username" name="username"
				placeholder="Enter the user name" required autofocus> <br>
			<br> <label for="password"> Password: </label> <input
				type="password" id="password" name="password" required autofocus>
			<br> <br>

			<div style="text-align: center">
				<jsp:include page="Message.jsp"></jsp:include><br />
				<button type="Submit">Submit</button>
			</div>
		</form>
	</main>
</body>
</html>
<link rel="stylesheet" href="assets/css/bootstrap.min.css">
<link rel="stylesheet" href="assets/css/fontawesome.min.css">
<link rel="stylesheet" href="css/style.css" type="text/css" >

<%
String loggedInAsAdmin = (String) session.getAttribute("LOGGED_IN_ADMIN");
String loggedInAsUser = (String) session.getAttribute("LOGGED_IN_USER");
String role = (String) session.getAttribute("ROLE");
%>

<header>
	<nav class="navbar navbar-expand-sm navbar-dark bg-dark">
		<a class="navbar-brand" href="Home.jsp">Hospital App</a>
		<button class="navbar-toggler d-lg-none" type="button"
			data-toggle="collapse" data-target="#collapsibleNavId"
			aria-controls="collapsibleNavId" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="collapsibleNavId">
			<ul class="navbar-nav mr-auto mt-2 mt-lg-0">
				<li class="nav-item active"><a class="nav-link" href="Home.jsp">Home
						<span class="sr-only">(current)</span>
				</a></li>
				<li class="nav-item"><a class="nav-link" href="ListDoctors.jsp">Doctors</a>
				</li>
				<li class="nav-item"><a class="nav-link"
					href="ListPatients.jsp">Patients</a></li>
				<li class="nav-item"><a class="nav-link"
					href="ListMedicines.jsp">Medicine</a></li>
			</ul>

			<ul class="navbar-nav ml-auto mt-2 mt-lg-0">
				<%
				if (loggedInAsAdmin == null && loggedInAsUser == null && role == null && "ADMIN".equalsIgnoreCase(role)) {
				%>
				
				<li class="nav-item active"><a class="nav-link"
					href="Index.jsp">Login</a></li>
				<li class="nav-item"><a class="nav-link" href="Register.jsp">Register</a>
				</li>
				<%
				} else if(loggedInAsUser == null && loggedInAsAdmin != null) {
				%>
				<li class="nav-item"><a class="nav-link" href="#">Welcome <%=loggedInAsAdmin%></a>
				</li>
				<li class="nav-item"><a class="nav-link" href="LogoutServlet">Logout</a>
				</li>

				<%
				}else{
				%>
				<li class="nav-item"><a class="nav-link" href="#">Welcome <%=loggedInAsUser%></a>
				</li>
				<li class="nav-item"><a class="nav-link" href="LogoutServlet">Logout</a>
				</li>
				
				<%} %>
			</ul>

		</div>
	</nav>
</header>
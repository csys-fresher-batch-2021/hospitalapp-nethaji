<link rel="stylesheet" href="assets/css/bootstrap.min.css">
<link rel="stylesheet" href="assets/css/fontawesome.min.css">
<link rel="stylesheet" href="css/style.css" type="text/css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" href="https://pro.fontawesome.com/releases/v5.10.0/css/all.css" integrity="sha384-AYmEC3Yw5cVb3ZcuHtOA93w35dYTsvhLPVnYs9eStHfGJvOvKxVfELGroGkvsg+p" crossorigin="anonymous"/>

<%
String loggedInAsAdmin = (String) session.getAttribute("LOGGED_IN_ADMIN");
String loggedInAsUser = (String) session.getAttribute("LOGGED_IN_USER");
String role = (String) session.getAttribute("ROLE");
%>

<header>
	<nav class="navbar navbar-expand-sm navbar-dark bg-dark">

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
				} else if (loggedInAsUser == null && loggedInAsAdmin != null) {
				%>
				<li class="nav-item"><a class="nav-link" href="#">Welcome <%=loggedInAsAdmin%></a>
				</li>
				<li class="nav-item"><a class="nav-link" href="LogoutServlet">Logout</a>
				</li>

				<%
				} else {
				%>
				<li class="nav-item"><a class="nav-link" href="#">Welcome <%=loggedInAsUser%></a>
				</li>
				<li class="nav-item"><a class="nav-link" href="LogoutServlet">Logout</a>
				</li>

				<%
				}
				%>
			</ul>
	</nav>
	<div class="sidebar">
		<a class="navbar-brand" href="Home.jsp">Hospital App</a><br /> <br />
		<a href="#home"><i class="fa fa-fw fa-home"></i> Home</a>
		<button class="dropdown-btn">
			<i class="fa fa-user-md"></i> &nbsp; Doctor <i
				class="fa fa-caret-down"></i>
		</button>
		<div class="dropdown-container">
			<a href="ListDoctors.jsp">List Doctors</a> <a href="AddDoctor.jsp">Add
				Doctors</a> <a href="#">Search Doctors</a>
		</div>
		<button class="dropdown-btn">
			<i class="fa fa-fw fa-user"></i>&nbsp;Patient <i
				class="fa fa-caret-down"></i>
		</button>
		<div class="dropdown-container">
			<a href="ListPatients.jsp">List Patients </a> <a
				href="AddPatient.jsp">Add Patient</a> <a href="#">Search
				Patients</a>
		</div>
		<button class="dropdown-btn">
			<i class="fa fa-pills"></i></i></i>&nbsp;Medicine<i class="fa fa-caret-down"></i>
		</button>
		<div class="dropdown-container">
			<a href="ListPatients.jsp">List Medicines </a> <a
				href="AddMedicine.jsp">Add Medicine</a>
		</div>


		<a href="#clients"><i class="fa fa-fw fa-user"></i>&nbsp; Clients</a>
		<a href="#contact"><i class="fa fa-fw fa-envelope"></i> &nbsp;
			Contact</a>
	</div>
</header>

<script>
	var dropdown = document.getElementsByClassName("dropdown-btn");
	var i;

	for (i = 0; i < dropdown.length; i++) {
		dropdown[i].addEventListener("click", function() {
			this.classList.toggle("active");
			var dropdownContent = this.nextElementSibling;
			if (dropdownContent.style.display === "block") {
				dropdownContent.style.display = "none";
			} else {
				dropdownContent.style.display = "block";
			}
		});
	}
</script>
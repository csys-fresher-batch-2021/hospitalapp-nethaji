<!Doctype>
<html>
<head>
<title>HospitalApp</title>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	<main class="container-fluid">
		<h3>Hopital Management System</h3>

		<c:out value="Hello" />
		<c:set var="now" value="<%=new Date()%>" />
		<fmt:formatDate type="date" pattern="yyyy-MM-dd" value="${now}" />

	</main>
</body>
</html>

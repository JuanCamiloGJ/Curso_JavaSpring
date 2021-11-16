<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Alumnos Spring</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/recursos/estilos/miestilo.css">
</head>
<body>
	Hola ${param.nombreAlumno}. Bienvenido al curso de Spring

	<p>
		<br>
	<h2>Atención a todos!</h2>
	${mensajeClaro}
	</p>

	<!-- La etiqueta que colocamos nos situa en el WebApp -->
	<img alt="foto"
		src="${pageContext.request.contextPath}/recursos/imgs/casa2.jpg"
		width="700" height="400">
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Confirmación de registro</title>
</head>
<body>
	<!-- con las jsp tags podemos usar el nombre que le dimos en el model y llamar los datos. -->
	El alumno con nombre ${elAlumno.nombre}, apellido ${elAlumno.apellido} , edad <strong>${elAlumno.edad}</strong> y email <strong>${elAlumno.email}</strong> se ha registrado.
	<br/>
	La asignatura escogida es: ${elAlumno.optativa}
	<br>
	La ciudad donde iniciará los estudios el alumno es: ${elAlumno.ciudadEstudios}.
	<br>
	Los idiomas escogidos por el alumno son: ${elAlumno.idiomasAlumno}
</body>
</html>
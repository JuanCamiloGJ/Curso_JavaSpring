<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!-- para usar las form mvc tags debemos agregar este enlace -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Formulario Registro</title>
</head>
<body>
	<!-- así se hace un formulario con estos tags
	en action es el metodo de lcontrolador que va a procesar los datos
	em model es el nombre del objeto que agregamos al modelo en nuestro controlador -->
	<form:form action="procesarFormulario" modelAttribute="elAlumno">
		<!-- el path debe de tener el nombre exacto de nuestro metodo setter de 
				nuestra clase alumno, es decir nuestro metodo se llama setNombre, aqui se pone nombre
				si nuestro metodo se llamara setElNombre se colocaria elNombre -->
		Nombre:<form:input path="nombre" />
		<br>
		<br>
		<br>
		Apellido:<form:input path="apellido" />
		<br>
		<br>
		<br>
		Asignaturas Optativa: <br>
		<form:select path="optativa" multiple="true">
			<form:option value="Diseño" label="Diseño"/>
			<form:option value="Karate" label="Karate"/>
			<form:option value="Comercio" label="Comercio"/>
			<form:option value="Danza" label="Danza"/>
		</form:select>
		<br><br><br>
		<!-- mismo path ára que funcionen en conjunto. -->
		Barcelona<form:radiobutton path="ciudadEstudios" value="Barcelona"/>
		Madrid<form:radiobutton path="ciudadEstudios" value="Madrid"/>
		Valencia<form:radiobutton path="ciudadEstudios" value="Valencia"/>
		Bilbao<form:radiobutton path="ciudadEstudios" value="Bilbao"/>
		<br><br><br>
		
		<!-- check box -->
		inglés<form:checkbox path="idiomasAlumno" value="Inglés"/>
		Frances<form:checkbox path="idiomasAlumno" value="Frances"/>
		Aleman<form:checkbox path="idiomasAlumno" value="Aleman"/>
		Chino<form:checkbox path="idiomasAlumno" value="Chino"/>
		
		<br><br><br>
		
		<input type="submit" value="Enviar">
	</form:form>


</body>
</html>
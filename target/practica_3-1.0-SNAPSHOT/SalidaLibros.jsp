<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>REGISTRO DE LIBROS</title>
  
    </head>
    <body>
        <jsp:useBean id="Libros" scope="request" class="com.emergentes.practica_3.Libros" />
        <h1>El libro registrados es:</h1>
        <p>Titulo: <jsp:getProperty name="Libros" property="titulo" /></p>
        <p>Autor: <jsp:getProperty name="Libros" property="autor" /></p>
        <p>Resumen: <jsp:getProperty name="Libros" property="resumen" /></p>
        <p>Medio: <jsp:getProperty name="Libros" property="medio" /></p>
        <a href="registroLibros.jsp"  >volver</a>
        
    </body>
</html>
<%-- 
    Document   : mostrar-resultado
    Created on : 24-sep-2020, 16:33:12
    Author     : grifiun
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>RESULTADO</title>
    </head>
    <body>
        <h1>Resultado</h1>
        <p><%=request.getAttribute("respuesta")%></p>
    </body>
</html>

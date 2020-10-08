<%-- 
    Document   : indexjsp
    Created on : 8/10/2020, 09:30:39 AM
    Author     : CITIUS-PRESTAMO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <div  class="sr">
            <button id="sr">
                <% if (request.getAttribute("operacion") != null) { %>
            ${operacion}
            <% } else {%>
            ${error}
            <% }%>
            </button> 
        </div><br>
        
           <form action="./CalcServlet" method="POST">      
            <input type="text" name="t1" value="" />
            <input type="text" name="t2" value="" />
            <br>
            <input type="submit" value="sumar" name ="operacion"/>   
            <br>
            <input type="submit" value="restar" name ="operacion" /> 
            <br>
            <input type="submit" value="multiplicar" name ="operacion" /> 
            <br>
            <input type="submit" value="dividir" name ="operacion" /> 
            
        </form>
    </body>
</html>

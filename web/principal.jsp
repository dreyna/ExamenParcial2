<%-- 
    Document   : principal
    Created on : 28/09/2015, 10:28:34 AM
    Author     : Docente
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="WEB-INF/sjsp/sesion.jspf" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
        <%@include file="WEB-INF/sjsp/archivos.jspf" %>
<script type="text/javascript">
    if(history.forward(1)){
            location.replace( history.forward(1) );      
          }
</script>
<script type="text/javascript">window.history.forward();function noBack(){window.history.forward();}</script>

    </head>
    <body>
        <%@include file="WEB-INF/sjsp/top.jspf" %>
        <!--<div>Contenido</div>  -->      
        
        <%@include  file="WEB-INF/sjsp/footer.jspf" %>
    </body>

</html>
<%@include file="WEB-INF/sjsp/cerrar.jspf" %>

<%-- 
    Document   : dollar_to_rand_outcome
    Created on : 16 Mar 2025, 15:00:50
    Author     : Owethu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Rand outcome!</h1>
        <%
           Double dollar =(Double) request.getAttribute("dollar");
           Double rand = (Double) request.getAttribute("rand");
        %>
        <p>
            <b><%=dollar%></b> is the equivalent to <b><%=rand%></b>
            Please click <a href="menu.jsp">here</a> to go to the menu page or
            <a href="index.html" > here </a> to go to the HOME page.
        </p>
    </body>
</html>

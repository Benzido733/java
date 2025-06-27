<%-- 
    Document   : dollar_to_rand
    Created on : 16 Mar 2025, 14:29:55
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
        <h1>Dollar Amount!</h1>
        <p>
            Please enter the dollar amount below to convert.
        </p>
        <form action ="DollarToRandServlet.do" method ="POST">
            <table>
                <tr><td>Dollar amount: </td>
                <td><input type="text" name = "dollar" /></td></tr>
                <tr><td></td>
                <td><input type="submit" name = "CONVERT" /></td></tr>
            </table>
           
        </form>
    </body>
</html>

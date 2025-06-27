<%-- 
    Document   : rand_to_dollar
    Created on : 16 Mar 2025, 14:24:08
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
        <h1>Rand Amount</h1>

      <p>
            Please enter the rand amount below to convert.
        </p>
        <form action ="RandToDollarServlet.do" method ="POST">
            <table>
                <tr>
                    <td>Rand amount: </td>
                <td><input type="text" name = "rand" />
                </td>
                </tr>
                <tr>
                    <td></td>
                <td><input type="submit" name = "CONVERT" /></td></tr>
            </table>
           
        </form>
    </body>
</html>

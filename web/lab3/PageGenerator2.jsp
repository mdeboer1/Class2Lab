<%-- 
    Document   : PageGenerator2
    Created on : Jan 22, 2015, 2:05:55 PM
    Author     : mdeboer1
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    String color = request.getParameter("color");
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1 style="color:<%= color %>">This is a JSP table</h1>
        <table border="1" width="400">
            <%
                out.print("<th>Row 1</th>");
                out.print("<th>Row 2</th>");
                out.print("<th>Row 3</th>");
                for (int row = 0; row < 3; row++){
                out.print("<tr>");
                for (int col = 0; col < 3; col++){
                    out.print("<td>Hello</td>");
                }
                out.print("</tr>");
            }
            %>
        </table>
    </body>
</html>

<%-- 
    Document   : results
    Created on : Jan 26, 2015, 12:17:11 PM
    Author     : mdeboer1
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Your Message</title>
    </head>
    <body>
        <p>
            <% 
                String message = (String)request.getAttribute("message");
                if (message == null){
                    message = "Message is null";
                }
                out.print(message.toString());
            %>
        </p>
    </body>
</html>

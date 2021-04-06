
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="resources/css/style.css" rel="stylesheet" type="text/css"/>
        <link href="resources/css/contact.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container">
            <%@include file="components/header.jsp" %>
            <div class="page-body">
                <div class="main">
                    <p>${requestScope.error}</p>
                </div>
                <%@include file="components/right.jsp" %>
            </div>
            <%@include file="components/footer.jsp" %>
        </div>
    </body>
</html>

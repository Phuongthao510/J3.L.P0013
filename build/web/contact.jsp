<%-- 
    Document   : home
    Created on : Dec 24, 2020, 8:59:20 AM
    Author     : Nam Ngoc
--%>

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
                    <h3 class="title">Find Maria's Cafe</h3>
                    <br /><br />
                    <div class="section contact-info">
                        <div class="address">
                            <h3 class="title">Address and contact:</h3>
                            <p class="content">${requestScope.infor.description}<br />${requestScope.infor.address}</p>
                            <p class="content">Tel: ${requestScope.infor.phone}</p>
                            <p class="content">Email: ${requestScope.infor.email}</p>
                        </div>
                        <div class="opening-hours">
                            <h3 class="title">Opening hours:</h3>
                            <p class="content">${requestScope.infor.openHours}</p>
                        </div>
                    </div>
                    <div class="section map">
                        <img src="resources/img/map2.png" alt=""/>
                    </div>
                </div>
                <%@include file="components/right.jsp" %>
            </div>
            <%@include file="components/footer.jsp" %>
        </div>
    </body>
</html>

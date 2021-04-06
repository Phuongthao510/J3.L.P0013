
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="resources/css/style.css" rel="stylesheet" type="text/css"/>
        <link href="resources/css/home.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container">
            <%@include file="components/header.jsp" %>
            <div class="page-body">
                <div class="main">
                    <div class="banner">
                        <img src="resources/img/banner.jpg" alt=""/>
                    </div>
                    <div class="post">
                        <a href="detail?id=${requestScope.latestPost.id}" class="title">${requestScope.latestPost.title}</a>
                        <div class="post-info">
                            <a href="detail?id=${requestScope.latestPost.id}" class="post-image"><img src="${requestScope.latestPost.image}" alt=""/></a>
                            <p class="content">${requestScope.latestPost.description}</p>
                        </div>
                    </div>
                </div>
                <%@include file="components/right.jsp" %>
            </div>
            <%@include file="components/footer.jsp" %>
        </div>
    </body>
</html>

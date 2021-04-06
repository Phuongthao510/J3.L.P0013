<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="resources/css/style.css" rel="stylesheet" type="text/css"/>
        <link href="resources/css/menu.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container">
            <%@include file="components/header.jsp" %>
            <div class="page-body">
                <div class="main">
                    <h3 class="title">Menu and Price list</h3>
                    <div class="menus">
                        <c:forEach items="${requestScope.menus}" var="m">
                            <div class="menu">
                                <p class="content intro">
                                    <span>${m.name}</span>
                                    <span class="text-right">Price</span>
                                </p>
                                <p class="content intro">
                                    <span>${m.description}</span>
                                    <span class="text-right">€${m.price}</span>
                                </p>
                                <p class="content">${m.content}</p>
                            </div>
                        </c:forEach>
                    </div>
                    <ul id="pagination" class="list-unstyled"></ul>
                    <script src="resources/js/pagger.js" type="text/javascript"></script>
                    <script>
                        pagger('pagination', ${requestScope.pageIndex}, ${requestScope.totalPages});
                    </script>
                </div>
                <%@include file="components/right.jsp" %>
            </div>
            <%@include file="components/footer.jsp" %>
        </div>
    </body>
</html>

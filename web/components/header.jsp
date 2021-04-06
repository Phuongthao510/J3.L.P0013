
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<header>
    <div class="site-info">
        <h1 class="logo">The Sushi Restaurant</h1>
        <p class="subtitle">Welcome to this website</p>
    </div>
    <ul class="navigation list-unstyled">
        <li><a href="home" class="${requestScope.homeBold}">Home</a></li>
        <li><a href="menu" class="${requestScope.menuBold}">Menu and Price list</a></li>
        <li><a href="contact" class="${requestScope.contactBold}">Find us</a></li>
    </ul>
</header>

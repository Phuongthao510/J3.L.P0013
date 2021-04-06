
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<footer>
    <p class="view-count">
        <fmt:formatNumber pattern="######" minIntegerDigits="6" value="${sessionScope.views}" />
    </p>
</footer>

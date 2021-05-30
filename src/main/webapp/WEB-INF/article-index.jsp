<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="pl">
<head>
    <meta charset="UTF-8">
    <title>Dodaj artykuł</title>
</head>
<body>
    <h3>Lista artykułów</h3>
    <c:forEach items="${articles}" var="article" varStatus="status">
        <h5>${article.title}: nr ${status.index + 1}</h5>
        <p>${article.content}</p>
        <ul>
        <c:forEach items="${article.tags}" var="tag">
            <li>${tag}</li>
        </c:forEach>
        </ul>
        <p>Data publikacji: ${article.published}</p>
    </c:forEach>
</body>
</html>
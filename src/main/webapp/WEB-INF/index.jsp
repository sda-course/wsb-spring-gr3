<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%--@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" --%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Servlety</title>
</head>
<body>
<h2 >Spis serwletów</h2>
<ul>
    <li>
        <a href="/query?user=karol&count=5">ParametersServlet</a>
    </li>
    <li>
        <a href="/cookie?login=ania">CookiesServlet</a>
    </li>
    <li>
        <a href="/blog/add">Dodaj artykuł</a>
    </li>
    <li>
        <a href="/blog/browse">Przeglądaj</a>
    </li>
</ul>
</body>
</html>
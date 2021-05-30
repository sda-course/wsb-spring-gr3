<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%--@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" --%>
<!DOCTYPE html>
<html lang="pl">
<head>
    <meta charset="UTF-8">
    <title>Dodaj artykuł</title>
</head>
<body>
<h3>Dodaj artykuł</h3>
<form method="post">
    <label for="title">Tytuł artykułu</label><br>
    <input type="text" name="title" required id="title"><br>
    <label for="content">Treść</label><br>
    <textarea name="content" id="content" required></textarea><br>
    <label for="tags">Tagi</label><br>
    <input type="text" name="tags" id="tags" required><br>
    <input type="submit" value="Zapisz"><br>
</form>
</body>
</html>

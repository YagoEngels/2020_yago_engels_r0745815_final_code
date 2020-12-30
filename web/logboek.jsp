<%--
  Created by IntelliJ IDEA.
  User: yagoe
  Date: 22-12-2020
  Time: 09:24
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="nl">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="style.css" type="text/css">
    <title>logboek</title>
</head>
<body class="body">
<div class="bg"></div>
<header>
    <h1>DATABASE</h1>
</header>
<nav>
    <ul>
        <li><a href="servlet?task=home" >HOME</a></li>
        <li><a href="add.jsp">ADD PLAYER</a></li>
        <li><a href="servlet?task=overview">PLAYER LIST</a></li>
        <li><a href="find.html" >FIND PLAYER</a></li>
        <li><a href="servlet?task=logs" class="kleur">HISTORY</a></li>
    </ul>
</nav>
<article>
    <h2> Logboek over server gebruikende activiteiten</h2>
    <table class="tabel">
        <thead>
        <th>datum</th>
        <th>tijd</th>
        <th>pagina</th>
        <th>activiteit</th>
        </thead>
        <c:forEach var="object" items="${db1}">
            <tr>
                <td><p>${object.date}</p></td>
                <td><p>${object.time}</p></td>
                <td><p>${object.page}</p></td>
                <td><p>${object.activity}</p></td>
            </tr>
        </c:forEach>
    </table>
</article>
</body>
</html>

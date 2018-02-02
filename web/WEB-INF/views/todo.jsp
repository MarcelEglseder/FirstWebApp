<%--
  Created by IntelliJ IDEA.
  User: Marcel
  Date: 15.12.2017
  Time: 09:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Willkommenseite</title>
</head>
<body>
<p>Hallo ${name}! Herzlich Willkommen</p>
<p>Deine Todos sind: </p>
<ol>
    <c:forEach var="todo" items="${todos}">
        <li>
                ${todo.name} &nbsp; &nbsp; &nbsp; <a href="/delete-todo.do?name=${todo.name}">Löschen</a>
        </li>
    </c:forEach>

</ol>
<form method="get" action="/addTodo.do">
    <input type="submit" value="Neues Todo hinzufügen">
</form>
</body>
</html>

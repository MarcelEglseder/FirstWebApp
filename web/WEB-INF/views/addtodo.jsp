<%--
  Created by IntelliJ IDEA.
  User: Marcel
  Date: 19.01.2018
  Time: 09:19
  To change this template use File | Settings | File Templates.
--%>
<%@include file="../common/header.jspf"%>
<%@include file="../common/navigation.jspf"%>

<div class="container">
    <form action="addTodo.do" method="post">
    Todo: <input type="text" name="name">
    <input type="submit" value="Eintragen" class="btn btn-success">
</form>
</div>
<%@include file="../common/footer.jspf"%>

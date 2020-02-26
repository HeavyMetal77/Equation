<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Input Data</title>
</head>
<body>

<hr>
<p>Введіть дані квадратного рівняння ax^2 + bx + c = 0</p><br>
<hr>

<form:form action="processForm" method="post" modelAttribute="inputData">
    <table>
        <tr>
            <td><form:label path="a">a</form:label></td>
            <td><form:input path="a"/></td>
        </tr>
        <tr>
            <td><form:label path="b">b</form:label></td>
            <td><form:input path="b"/></td>
        </tr>
        <tr>
            <td><form:label path="c">c</form:label></td>
            <td><form:input path="c"/></td>
        </tr>
        <tr>
            <td></td>
            <td><input type="submit" value="рассчитать"/></td>
        </tr>
    </table>
</form:form>


</body>
</html>
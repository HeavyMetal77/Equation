<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>

<head>
    <title>result</title>
</head>

<body>
Для вихідних даних: a = ${inputData.a}, b = ${inputData.b}, c = ${inputData.c},
<br>
відповідь: x1 = ${inputData.x1},  x2 = ${inputData.x2}
<br>

<hr>

<div id="container">
    <div id="content">
        <table>
            <tr>
                <th>a</th>
                <th>b</th>
                <th>c</th>
                <th>x1</th>
                <th>x2</th>
            </tr>
<p>База даних:</p>
            <c:forEach var="tempEquation" items="${equations}">
                <tr>
                    <td>${tempEquation.a}</td>
                    <td>${tempEquation.b}</td>
                    <td>${tempEquation.c}</td>
                    <td>${tempEquation.x1}</td>
                    <td>${tempEquation.x2}</td>
                </tr>
            </c:forEach>
        </table>
    </div>
</div>
<hr>
<a href="/equation/showForm">Вирішити інше рівняння</a> <br>
</body>
</html>

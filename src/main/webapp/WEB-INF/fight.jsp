<%--
  Created by IntelliJ IDEA.
  User: RottingAlien
  Date: 9/7/2019
  Time: 2:57 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en" xmlns:th="http://www.thymeleaf.org">
<head>

    <meta charset="UTF-8">
    <title>The Isle Damage Calculator</title>
</head>
<body>
<h1>The Isle Damage Calculator!</h1>

<!--/*@thymesVar id="fightResults" type="java.util.List"*/-->
<!--/*@thymesVar id="dino2" type="java.lang.String"*/-->
<!--/*@thymesVar id="dino1" type="java.lang.String"*/-->
<table>
    <thead>
    <tr>
        <th>
            Fight Result:
        </th>
    </tr>
    </thead>
    <tbody>
    <tr th:each="info : ${fightResults}">
        <td th:text="${info}"></td>
    </tr>
    </tbody>
</table>
<input type="button" th:value="${dino1} + ' Details'"
       th:onclick="'window.location.href =\'' + @{'/'+${dino1}+'/'+${growth1}}+'\''"/>
<input type="button" th:value="${dino2} + ' Details'"
       th:onclick="'window.location.href =\'' + @{'/'+${dino2}+'/'+${growth2}}+'\''"/>
<button type="button" onclick="history.back()">Back</button>
<input type="button" th:value="'Reset'" th:onclick="'window.location.href =' + @{'/'}"/>

<h1>More details:</h1>
<table>
    <thead>
    <tr>
        <th>
            First Dino:
        </th>
        <th>
            Second Dino:
        </th>
    </tr>
    </thead>
    <tbody>
    <tr th:each="info1 : ${dino1Info}">
        <td>
            <label th:text="${info1}"></label>
        </td>
    </tr>
    <tr th:each="info2 : ${dino2Info}">
        <td>
            <label th:text="${info2}"></label>
        </td>
    </tr>
    </tbody>
</table>

</body>
</html>
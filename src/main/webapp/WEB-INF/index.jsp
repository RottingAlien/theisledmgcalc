<%--
  Created by IntelliJ IDEA.
  User: RottingAlien
  Date: 9/7/2019
  Time: 2:56 PM
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
<!--/*@thymesVar id="dinoMap" type="rottingalien.theisledmgcalc.DinosaurList"*/-->
<form th:action="@{/fight}">
    <table>
        <thead>
        <tr>
            <th>First Dino</th>
        </tr>
        <tr>
            <th>First Dinossaur</th>
            <th>Second Dinossaur</th>
        </tr>
        </thead>
        <tbody>

        <tr th:each="dino : ${dinoMap.getDinoMap().values()}">
            <td>
                <label>
                    <input th:type="radio" th:name="dino1" th:value="${dino.getName()}" th:id="${dino.getName()}+'1'">
                    [(${dino.getName()})] </label>
            </td>
            <td>
                <label>
                    <input th:type="radio" th:name="dino2" th:value="${dino.getName()}" th:id="${dino.getName()}+'2'">
                    [(${dino.getName()})] </label>
            </td>
        </tr>
        <tr th:each="growth : ${dinoMap.getDinoMap().get('Triceratops').getGrowthStates().values()}">
            <td>
                <label>
                    <input th:type="radio" th:name="dino1Growth" th:value="${growth.getName()}" th:id="${growth.getName()}+'1'">
                    [(${growth.getName()})] </label>
            </td>
            <td>
                <label>
                    <input th:type="radio" th:name="dino2Growth" th:value="${growth.getName()}" th:id="${growth.getName()}+'2'">
                    [(${growth.getName()})] </label>
            </td>
        </tr>
        </tbody>
    </table>
    <input type="submit" value="Submit">
</form>

</body>
</html>
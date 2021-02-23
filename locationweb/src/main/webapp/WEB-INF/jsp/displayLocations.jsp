<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Show Locations</title>
</head>
<body>
<h2>Locations : </h2>
<TABLE>
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Code</th>
        <th>Type</th>
    </tr>

    <c:forEach items="${Locations}" var="location">
        <tr>
            <td>${location.id}</td>
            <td>${location.name}</td>
            <td>${location.code}</td>
            <td>${location.type}</td>
            <td><a href="deleteLocation?id=${location.id}">Delete</a></td>
            <td><a href="updateLocation?id=${location.id}">Edit</a></td>
        </tr>
    </c:forEach>
</TABLE>
<a href="showCreate">Add Location</a>
</body>
</html>
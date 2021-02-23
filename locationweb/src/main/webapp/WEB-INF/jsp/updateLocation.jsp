<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Update Location</title>
</head>
<body>
<form action="updateLoc" method="post">
        <pre>
<%--            ID : <input type="text" name="id" value="${location.id}" readonly />--%>
            Code : <input type="text" name="code" value="${location.code}"/>
            Name : <input type="text" name="name" value="${location.name}"/>
            Type :
            Urbin <input type="radio" name="type" value="URBIN" ${location.type=='URBIN'?'checked':''}/>
            Rural <input type="radio" name="type" value="RURAL" ${location.type=='RURAL'?'checked':''}/>
            <input type="submit" value="Update"/>
        </pre>
</form>
</body>
</html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Create Location</title>
</head>
<body>
<form action="saveLoc" method="post">
    <pre>
    Code : <input type="text" name="code"/>
    Name : <input type="text" name="name"/>
    Type :
    Urbin <input type="radio" name="type" value="URBIN"/>
    Rural <input type="radio" name="type" value="RURAL"/>
    <input type="submit" value="Save"/>
</pre>
</form>
${saveResponse}

<a href="displayLocations">View All</a>
</body>
</html>
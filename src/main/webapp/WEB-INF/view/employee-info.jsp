<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!doctype html>
<html lang="en">
<head>
    <title>Document</title>
</head>
<body>
    <h2>Employee info</h2>

    <form:form modelAttribute="employee" action="/saveEmployee">
        <form:hidden path="id"/>

        name <form:input path="name"/>
        <br><br>
        surname <form:input path="surname"/>
        <br><br>
        department <form:input path="department"/>
        <br><br>
        salary <form:input path="salary"/>
        <br><br>
        <input type="submit" value="send">
    </form:form>
</body>
</html>
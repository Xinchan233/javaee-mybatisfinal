
<%@ page import="java.util.List" %>


<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>choose what you want to do</title>
</head>
<body>

<div align="center">
    <h2>教师登陆</h2>
    <form action="${pageContext.request.contextPath}/app/Tlogin" method="post">
        <table style="line-height: 40px">
            <tr>
                <th>工号:</th>
                <td><input type="text" name="id" maxlength="30" size="50" required></td>
            </tr>
            <tr>
                <th>密码:</th>
                <td><input type="text" name="pw" maxlength="30" size="50" required></td>
            </tr>

            <tr align="center">
            <td><button type="submit" class="btn">Login in</button></td>
        </tr>
        </table>
    </form>
</div>

</body>
</html>

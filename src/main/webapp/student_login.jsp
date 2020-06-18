
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>studnet_login</title>

    <div align="center">
        <h2>学生登陆</h2>
        <form action="${pageContext.request.contextPath}/app/login" method="post">
            <table style="line-height: 40px">
                <tr>
                    <th>学号:</th>
                    <td><input type="text" name="sId" maxlength="30" size="50" required></td>
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
</head>
<body>

</body>
</html>

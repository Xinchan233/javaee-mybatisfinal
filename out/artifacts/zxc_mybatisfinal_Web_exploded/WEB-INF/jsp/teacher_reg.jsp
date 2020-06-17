
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>teacher_register</title>

    <div align="center">
        <h2>老师注册</h2>
        <form action="${pageContext.request.contextPath}/app/tregister" method="post">
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
                    <td><button type="submit" class="btn">register</button></td>
                </tr>
            </table>
        </form>
    </div>
</head>
<body>

</body>
</html>

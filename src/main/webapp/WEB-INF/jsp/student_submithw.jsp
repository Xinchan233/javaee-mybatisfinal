<%--
  Created by IntelliJ IDEA.
  User: apple
  Date: 2020/6/10
  Time: 23:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<div align="center">
    <h2>添加作业</h2>
    <form action="${pageContext.request.contextPath}/app/SubmitHomeworkServlet" method="post">
        <table style="line-height: 40px">
            <tr>
                <th>学号:</th>
                <td><input type="text" name="id" maxlength="30" size="50" required></td>
            </tr>
            <tr>
                <th>作业id:</th>
                <td><input type="text" name="hwid" maxlength="30" size="50" required></td>
            </tr>
            <tr>
                <th>作业名称:</th>
                <td><input type="text" name="hwname" maxlength="30" size="50" required></td>
            </tr>
            <tr>
                <th>作业内容:</th>
                <td><input type="text" name="content" maxlength="30" size="50" required></td>
            </tr>

            <tr align="center">
                <td><input type="submit" name="submit" value="添加作业"> </td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>

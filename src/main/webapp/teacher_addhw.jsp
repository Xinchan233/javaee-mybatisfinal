<!DOCTYPE html>
<html lang="en">
<head>
    <style>
        body{
            font-size:40px;
            background:url(/Img/2.jpg);
            background-repeat: no-repeat;
            background-size: 100% auto;
        }
    </style>
</head>
<body>
<div align="center" class="login" >
    <div style="color: white"><h5>teacher add homework</h5></div>
    <form action="${pageContext.request.contextPath}/app/updateHomeworkServlet" method="post">
        <div class="form">
            <div class="item">
                <i class="fa fa-user-circle" aria-hidden="true"></i>
                <input name="hwname" type=text placeholder="homeworkName" >
            </div>
            <div class="item">
                <i class="fa fa-key" aria-hidden="true"></i>
                <input name="content" type=text placeholder="content" >
            </div>

        </div>
        <button type="submit" value="Login">submit</button>
    </form>
</div>
</body>
</html>


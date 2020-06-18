<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>老师注册</title>
    <link  rel="stylesheet"  href="./Css/Index.css">
    <link  rel="stylesheet"  href="font-awesome-4.7.0/css/font-awesome.css">
</head>
<body>
<div class="login">
    <h1>teacher register</h1>
    <form action="${pageContext.request.contextPath}/app/tregister" method="post">
        <div class="form">
            <div class="item">
                <i class="fa fa-user-circle" aria-hidden="true"></i>
                <input name="id" type=text placeholder="teacherID" >
            </div>

            <div class="item">
                <i class="fa fa-key" aria-hidden="true"></i>
                <input name="pw" type=text placeholder="password" >
            </div>

        </div>
        <button type="submit" value="Login">register</button>
    </form>
</div>
</body>
</html>

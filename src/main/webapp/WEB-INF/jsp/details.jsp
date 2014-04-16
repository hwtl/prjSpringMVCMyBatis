<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Jerry
  Date: 14-4-14
  Time: 11:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<form method="post" >
    姓名：${employee.userName}
    工号：${employee.userCode}
    电话：${employee.mobilePhone}
    性别：${employee.sex == 0 ? "女" : "男"}
</form>
</body>
</html>

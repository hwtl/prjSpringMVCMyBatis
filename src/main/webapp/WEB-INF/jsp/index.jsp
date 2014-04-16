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
       <c:forEach var="employee" items="${employees}">
           <p>HELLO WORLD 【${employee.userName}】</p>
       </c:forEach>
<form method="post" >
    姓名：<input type="text" name="userName"/>
    工号：<input type="text" name="userCode"/>
    电话：<input type="text" name="mobilePhone"/>
    性别：<input type="radio" name="sex" value="0"/>女
         <input type="radio" name="sex" value="1"/>男
    <input type="submit" />
</form>
</body>
</html>

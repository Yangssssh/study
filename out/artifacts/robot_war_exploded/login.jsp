<%--
  Created by IntelliJ IDEA.
  User: Y.sh
  Date: 2018/1/10
  Time: 15:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
<s:form action="mg" method="POST" name="frmLogin" id="frmLogin">
    用户名:<s:textfield name="manager.id"></s:textfield><br>
    密码:<s:password name="manager.pwd"></s:password><br>
    <s:submit value="登录"></s:submit>
</s:form>
</body>
</html>

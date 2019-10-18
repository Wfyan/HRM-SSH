<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>用户登录页</title>
</head>
<body vLink="#006666" link="#003366" bgColor="#E0F0F8">
	<center>
	用户登录<br><br>
	<s:form action="login"> 
		<s:textfield name="user.username" label="用户名" />
		<s:password name="user.password" label="密  码" />
	    <s:submit value="登录"></s:submit>
	</s:form>
	  <a href="index.jsp">返回首页</a><br> 
	</center>
</body>
</html>

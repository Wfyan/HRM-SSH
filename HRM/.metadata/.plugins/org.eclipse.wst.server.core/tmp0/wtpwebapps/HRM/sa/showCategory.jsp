<%@ page language="java" contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>Info</title>
</head>
<body vLink="#006666" link="#003366" bgColor="#E0F0F8">
<center>
	<h3>分类信息</h3>
		<s:iterator value="List" id="msg">
			<td><s:property value="#msg.kindId"/></td>
			<td><s:property value="#msg.kindName"/></td><br/>
		</s:iterator>
</center>
</body>
</html>
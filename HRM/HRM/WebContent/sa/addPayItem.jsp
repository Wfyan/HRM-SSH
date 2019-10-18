<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<s:head theme="ajax" />
<head>
<meta http-equiv="Content-Type" content="text/html;charset=utf-8">
<title>薪酬项目</title>
</head>
<body vLink="#006666" link="#003366" bgColor="#E0F0F8">
	<center>
	<p>你正在做的事情是：人力资源-->薪酬管理-->添加薪酬项目<p>
	<s:form action="addItem">
		<s:textfield name="pay.item" label="薪酬项目名称" />
		<s:submit theme="ajax" value="添加" targets="show"></s:submit>
	</s:form>
	<div id="show"></div>
	</center>
</body>
</html>
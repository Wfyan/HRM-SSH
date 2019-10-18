<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<s:head theme="ajax" />
<head>
<meta http-equiv="Content-Type" content="text/html;charset=utf-8">
<title>添加职业分类</title>
</head>
<body vLink="#006666" link="#003366" bgColor="#E0F0F8">
	<center>
	<p>你正在做的事情是：人力资源-->职位管理-->职位添加<p>
	<s:form action="addPosition">
		<s:textfield name="p.kindId" label="职业ID" />
		<s:textfield name="p.kindName" label="职业名称" />
		<select name="p.thirdO.oId">
			<s:action name="showThirdO_all" executeResult="true"></s:action>
		</select>
		<select name="p.cat.kindId">
			<s:action name="showCategory_options" executeResult="true"></s:action>
		</select>
		<s:submit theme="ajax" value="添加" targets="show"></s:submit>
	</s:form>
	<div id="show">
		<select>
		
		</select>
	</div>
	</center>
</body>
</html>
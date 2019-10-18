<%@ page language="java" contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>Info</title>
</head>
<body vLink="#006666" link="#003366" bgColor="#E0F0F8">
<center>
	<% int id = (Integer)session.getAttribute("role"); %>
	<h3>职位薪酬标准信息</h3>
	<table>
		<s:iterator value="List" id="msg">
		<tr>
			<td><s:property value="#msg.posiId"/></td>
			<td><s:property value="#msg.positionName"/></td>
			<td>
				<s:a href="showPayRatio.action?Id=%{#msg.posiId}">查看薪酬标准</s:a>
				<% if(id==4){ %>
					<s:a href="toSetPay.action?Id=%{#msg.posiId}">设置薪酬标准</s:a>
				<% } %>
			</td>
		</tr>
		</s:iterator>
	</table>
</center>
</body>
</html>
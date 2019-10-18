<%@ page language="java" contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>Info</title>
		<style type="text/css">
	        td { 
	        	width:250px;
	         }
    	</style>
	</head>
	<body vLink="#006666" link="#003366" bgColor="#E0F0F8">
		<div style="overflow:hidden;">
		<% int id = (Integer)session.getAttribute("role"); %>
		</div>
		<center>
		<table bgcolor="" align="center" border="1" bordercolor="">
			
			<tr>
				<th>序号</th>
				<th>薪酬项目名称</th>
				<th>金额</th>
			</tr>
			<s:iterator value="List" id="msg">
				<tr>
					<td align="center"><s:property value="#msg.id" /></td>
					<td align="center"><s:property value="#msg.pItem.item" /></td>
					<td align="center"><s:property value="#msg.value" /></td>
				</tr>	
			</s:iterator>
		</table>
		</center>
	</body>
</html>
<%@ page language="java" contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>Info</title>
		<style type="text/css">
	        td { 
	        	width:150px;
	         }
    	</style>
	</head>
	<body vLink="#006666" link="#003366" bgColor="#E0F0F8">
		<div style="overflow:hidden;">
			<p style="float:left;"><b>你正在做的事情是：人力资源-->人力资源档案管理-->人力资源档案登记复核</b></p>
			<p style="float:left;">符合条件的人力资源档案总数: ${count}例</p>
		</div>
		<center>
		<table bgcolor="" align="center" border="1" bordercolor="">
			<tr>
				<th>档案编号</th>
				<th>姓名</th>
				<th>性别</th>
				<th>一级机构</th>
				<th>二级机构</th>
				<th>三级机构</th>
				<th>职位名称</th>
				<th>复核</th>
			</tr>
			<s:iterator value="List" id="msg">
				<tr>
					<td align="center"><s:property value="#msg.id" /></td>
					<td align="center"><s:property value="#msg.pname" /></td>
					<td align="center"><s:property value="#msg.sex" /></td>
					<td align="center"><s:property value="#msg.thirdO.secondO.firstO.organizename" /></td>
					<td align="center"><s:property value="#msg.thirdO.secondO.organizename" /></td>
					<td align="center"><s:property value="#msg.thirdO.organizename" /></td>
					<td align="center"><s:property value="#msg.pos.positionName" /></td>
					<td align="center">
						<s:a href="toPeopleInfo_checkToUpdate.action?people.id=%{#msg.id}">复核</s:a>						
					</td>
					<s:hidden name="fir" value="#msg.thirdO.secondO.firstO.oId"></s:hidden><s:hidden name="sec" value=""></s:hidden>
				</tr>	
			</s:iterator>
		</table>
		</center>
	</body>
</html>
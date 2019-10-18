<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<s:head theme="ajax" />
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<title>search</title>
	<style type="text/css">
        select { width:153px; }
        th { width:100px; }
        td { width:153px; }
        s:textfeild{ size:60; }
    </style>
</head>
<body vLink="#006666" link="#003366" bgColor="#E0F0F8">
	<% int id = (Integer)session.getAttribute("role");%>
	<p>你正在做的事情是：人力资源-->人力资源档案管理-->人力资源档案查询<p>
	<center>
	<s:form action="searchPeople">
		<div style="overflow:hidden;">
			<p style="float:left;"><input type=radio name="flag" value=2 checked />查询所有</p>
			<p style="float:left;"><input type=radio name="flag" value=0 />查询未审核</p>
			<p style="float:left;"><input type=radio name="flag" value=1 />查询已审核</p>
			<% if(id==2){ %>
				<p style="float:left;"><input type=radio name="flag" value=3 />查询已删除</p>
			<% } %>
		</div>
		<table bgcolor="" align="center" border="1" bordercolor="">
			<tr>
				<th>I级机构</th>
				<td><select name="fir" onchange="change(this.value,'showSecondO.action',showSecond);">
						<s:action name="showFirstO" executeResult="true"></s:action>
					</select>
				</td>
			</tr>
			<tr>
				<th>II级机构</th>
				<td><select name="sec" onchange="change(this.value,'showThirdO.action',showThird);" id="second">
					</select>
				</td>
			</tr>
			<tr>
				<th>III级机构</th>
				<td colspan=2><select name="thirdId" id="third">
					</select>
				</td>
			</tr>
			<tr>
				<th>职业类型</th>
				<td><select onchange="change(this.value,'showPosition_options.action',showPosition);">
						<s:action name="showCategory_options" executeResult="true"></s:action>
					</select>
				</td>
			</tr>
			<tr>
				<th>职业名称</th>
				<td><select name="pId" id="ppp">
					</select>
				</td>
			</tr>
			<tr>
				<th>建档时间</th>
				<td>
					<s:textfield name="mintime" theme="simple" size="10"></s:textfield>
					至<s:textfield name="maxtime" theme="simple" size="10"></s:textfield>
				</td>
			</tr>
		</table><br />
		<div style="width:43px; margin:0 auto;">
			<s:submit value="查找" theme="ajax" targets="show"></s:submit>
			<input type="reset" value="重置" /> 
		</div>
	</s:form>
	<div id="show"></div>
	</center>
	<script type="text/javascript" src="js/My.js"></script>
</body>
</html>
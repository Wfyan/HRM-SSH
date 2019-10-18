<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<s:head theme="ajax" />
<head>
<meta http-equiv="Content-Type" content="text/html;charset=utf-8">
<title>人力资源系统</title>
<style type="text/css">
a{text-decoration: none;color:black;}
a:hover{color:blue;}
.content{
	width: inherit;
	overflow: hidden;
	clear: both;
	border-top: 2px solid #00adef;
}
li{list-style:none;}
.content ul{
	width: inherit;
	margin: 0 auto;
	overflow: hidden;
}
.tab_item{
	float: left;
	width: 120px;
	border: 2px solid #e5e5e5;
	padding: 4px 5px;
	margin: 10px 8px 8px 25px;
}
.content .active{
	box-shadow: 2px 1px 10px 0px rgba(51, 51, 51, 0.5);
}
</style>
</head>
<body vLink="#006666" link="#003366" bgColor="#E0F0F8">
	<center>
	<p>欢迎您，${user.username}</p>
	<% int id = (Integer)session.getAttribute("role");%>
	<%=id %>
	
	<div class="content">
		<ul>
			<s:iterator value="powerList" id="msg">
				<li class="tab_item" onmouseover="this.className='tab_item active'" onmouseout="this.className='tab_item'"><a href="${msg.ahref}">${msg.powername}</a></li>
			</s:iterator>
		</ul>
	</div>
	</center>
</body>
</html>
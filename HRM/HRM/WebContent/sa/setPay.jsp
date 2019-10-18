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
	<p>你正在做的事情是：人力资源-->薪酬管理-->设置薪酬标准<p>
	<s:form action="addPayRatio">
		<s:hidden name="pay.pos.posiId" value="%{Id}"></s:hidden>
		<s:optiontransferselect     
            label="薪酬标准设定"
            rightTitle="未选择项目"            
            leftTitle="已选择项目"
                        
            name="LeftSide"             
            list="aList"
            listKey="itemId"
            listValue="item"
            headerKey="headerKey"
            headerValue="--- Please Select ---"
            emptyOption="true"
            multiple="true"            

            doubleName="list"
            doubleList="olist"
            doubleListKey="itemId"
            doubleListValue="item"            
            doubleHeaderKey="doubleHeaderKey"
            doubleHeaderValue="--- Please Select ---" 
            doubleEmptyOption="true"
            doubleMultiple="true" >
		<s:submit value="添加"></s:submit>
	</s:optiontransferselect>
	<table>
		<tr>
			<%	java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("yyyy-MM-dd");  
   			java.util.Date currentTime = new java.util.Date();  
   			String time = simpleDateFormat.format(currentTime).toString();
   			out.println("当前时间为：<span name='pay.registDate'>"+time+"</span>");
    	%>
		</tr>
		<tr>
			<th>基本工资：</th>
			<td><s:textfield name="pay.value"></s:textfield></td>
		</tr>
		<tr>
			<th>制定人：</th>
			<td><s:textfield name="pay.assigner"></s:textfield></td>
		</tr>
	</table>

    	

    </s:form>
	</center>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<s:head theme="ajax" />
<head>
	<meta http-equiv="Content-Type" content="text/html;charset=utf-8">
	<title>添加人员信息</title>
	<style type="text/css">
        select { width:153px; }
        th { width:100px; }
        td { width:153px; }
        s:textfeild{ size:60; }
    </style>
</head>
<body vLink="#006666" link="#003366" bgColor="#E0F0F8">
	<p>你正在做的事情是：人力资源-->人力资源档案管理-->人力资源档案查询-->人力资源档案查看<p>
	<center>
	<s:form>
		<table bgcolor="" align="center" border="1">
			<tr>
				<th>档案编号</th>
				<td> 
					<s:property value="people.id" />
				</td>
			</tr>
			<tr>
				<th>I级机构</th>
				<td>
					<s:property value="people.thirdO.secondO.firstO.organizename"/>
				</td>
				<th>II级机构</th>
				<td>
					<s:property value="people.thirdO.secondO.organizename"/>
				</td>
				<th>III级机构</th>
				<td colspan=2>
					<s:property value="people.thirdO.organizename"/>
				</td>
				<td rowspan=6></td>
			</tr>
			<tr>
				<th>职业分类</th>
				<td>
					<s:property value="people.pos.cat.kindName"/>
				</td>
				<th>职业名称</th>
				<td>
					<s:property value="people.pos.positionName"/>
				</td>
				<th>职称</th>
				<td colspan=2><select name="lecturer" style="width:259px;"></select></td>
			</tr>
			<tr>
				<th>姓名</th>
				<td><s:property value="people.pname"/></td>
				<th>性别</th>
				<td>
					<s:property value="people.sex"/>
				</td>
				<th>EMAIL</th>
				<td colspan=2><s:property value="people.email"/></td>
			</tr>
			<tr>
				<th>生日</th>
				<td><s:property value=".birthday" /></td>
				<th>民族</th>
				<td><s:property value="people.nation" /></td>
				<th>手机</th>
				<td colspan=2><s:property value="people.phone" /></td>
			</tr>
			<tr>
				<th>住址</th>
				<td colspan=3><s:property value=".address" /></td>
				<th>身份证号</th>
				<td><s:property value="people.identity" /></td>
			</tr>
			<tr>
				<th>年龄</th>
				<td><s:property value="people.age" /></td>
				<th>学历</th>
				<td>
					<s:property value="people.education" />
				</td>
				<th>学历专业</th>
				<td><s:property value="people.major" /></td>
			</tr>
			<tr>
				<th>薪酬标准</th>
				<td>
					<s:property value="people." />
				</td>
				<th>开户行</th>
				<td><s:property value=".openingline" /></td>
				<th>账号</th>
				<td><s:property value="people.idCart" /></td>
				<th>政治面貌</th>
				<td>
					<s:property value="people.major" />
				</td>
			</tr>
			<tr>
				<th>登记人</th>
				<td><s:property value="registervalue" /></td>
				<th>建档时间</th>
				<td><s:property value="people.registime" /></td>
				<th>特长</th>
				<td><s:property value="speciality" /></td>
				<th>工资</th>
				<td><s:property value="people.salary" /></td>
			</tr>  
			<tr>
				<th>个人履历</th>
				<td colspan=7><textarea style="height:100px;" ></textarea></td>
			</tr>
			<tr>
				<th>家庭关系</th>
				<td colspan=7><textarea style="height:100px;"></textarea></td>
			</tr>
			<tr>
				<th>备注</th>
				<td colspan=7><textarea style="height:100px;"></textarea></td>
			</tr>
		</table>
	</s:form>
	</center>
	<script type="text/javascript" src="js/My.js"></script>
	</body>
</html>
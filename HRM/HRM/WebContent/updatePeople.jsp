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
	<p>你正在做的事情是：人力资源-->人力资源档案管理-->人力资源档案更更改<p>
	<center>
	<s:form action="updatePeople">
		<table bgcolor="" align="center" border="1">
			<tr>
				<th>档案编号</th>
				<td>
					<s:hidden name="people.id"></s:hidden>
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
					<s:hidden name="people.thirdO.oId"></s:hidden>
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
					<s:hidden name="people.pos.posiId"></s:hidden>
					<s:property value="people.pos.positionName"/>
				</td>
				<th>职称</th>
				<td colspan=2><select name="lecturer" style="width:259px;"></select></td>
			</tr>
			<tr>
				<th>姓名</th>
				<td><s:textfield name="people.pname" value="%{people.pname}" theme="simple"/></td>
				<th>性别</th>
				<td>
					<select name="people.sex" id="sex">
						<option value="男">男</option>
						<option value="女">女</option>
					</select>
				</td>
				<th>EMAIL</th>
				<td colspan=2><s:textfield name="people.email" value="%{people.email}" size="38" theme="simple"/></td>
			</tr>
			<tr>
				<th>生日</th>
				<td><s:textfield name="people.birthday" theme="simple"/></td>
				<th>民族</th>
				<td><s:textfield name="people.nation" theme="simple"/></td>
				<th>手机</th>
				<td colspan=2><s:textfield name="people.phone" size="38" theme="simple"/></td>
			</tr>
			<tr>
				<th>住址</th>
				<td colspan=3><s:textfield name="people.address" size="65" theme="simple"/></td>
				<th>身份证号</th>
				<td colspan=2><s:textfield name="people.identity" size="38" theme="simple"/></td>
			</tr>
			<tr>
				<th>年龄</th>
				<td><s:textfield name="people.age" theme="simple"/></td>
				<th>学历</th>
				<td><select name="people.education">
						<option value="本科">本科</option>
						<option value="专科">专科</option>
						<option value="高中">高中</option>
						<option value="初中">初中</option>
						<option value="小学">小学</option>
						<option value="无">无</option>
					</select>
				</td>
				<th>学历专业</th>
				<td><s:textfield name="people.major" theme="simple"/></td>
			</tr>
			<tr>
				<th>薪酬标准</th>
				<td><select name="people.salary">
					<option value="0">未定义/0</option>
						<s:action name="showStandard" executeResult="true"></s:action>
					</select>
				</td>
				<th>开户行</th>
				<td><s:textfield name="people.bank" theme="simple"/></td>
				<th>账号</th>
				<td><s:textfield name="people.idCart" theme="simple"/></td>
				<th>政治面貌</th>
				<td><select name="people.political">
						<option value="群众">群众</option>
						<option value="共青团员">共青团员</option>
						<option value="共产党员">共产党员</option>
						<option value="其他">其他</option>
					</select>
				</td>
			</tr>
			<tr>
				<th>登记人</th>
				<td><s:textfield name="people.register" theme="simple"/></td>
				<th>建档时间</th>
				<td><s:datetimepicker name="people.registime" displayFormat="yyyy-MM-dd" theme="simple" /></td>
				<th>特长</th>
				<td><s:textfield name="people.speciality" theme="simple"/></td>
			</tr>  
			<tr>
				<th>个人履历</th>
				<td colspan=7><textarea name="people.resume" style="height:100px; width:942px;" ></textarea></td>
			</tr>
			<tr>
				<th>家庭关系</th>
				<td colspan=7><textarea name="people.family" style="height:100px; width:942px;"></textarea></td>
			</tr>
			<tr>
				<th>备注</th>
				<td colspan=7><textarea name="people.other" style="height:100px; width:942px;"></textarea></td>
			</tr>
		</table>
		<s:hidden name="people.state"></s:hidden>
		<input type="submit" value="提交"/>
		<s:reset value="清除" theme="simple"></s:reset>
		<s:a href="deletePeople.action?people.id=%{people.id}">删除</s:a>
	</s:form>
	</center>
	<script type="text/javascript" src="js/My.js"></script>
	<script type="text/javascript">
	window.onload=function(){
		var sex = document.getElementById('sex'),
			education = document.getElementById('education');
		sex.value="${people.sex}";
		education.value="${people.education}";
	}
	</script>
	</body>
</html>
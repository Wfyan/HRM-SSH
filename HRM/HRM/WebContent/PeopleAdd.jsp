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
	<p>你正在做的事情是：人力资源-->人力资源档案管理-->人力资源档案登记<p>
	<% int id = (Integer)session.getAttribute("role");%>
	<center>
	<s:form action="addPeople">
		<table bgcolor="" align="center" border="1">
			<tr>
				<th>I级机构</th>
				<td><select name="fir" onchange="change(this.value,'showSecondO.action',showSecond);">
						<s:action name="showFirstO" executeResult="true"></s:action>
					</select>
				</td>
				<th>II级机构</th>
				<td><select name="sec" onchange="change(this.value,'showThirdO.action',showThird);" id="second">
					</select>
				</td>
				<th>III级机构</th>
				<td colspan=2><select name="people.thirdO.oId" style="width:259px;" id="third">
					</select>
				</td>
				<td rowspan=6>
					
				</td>
			</tr>
			<tr>
				<th>职业分类</th>
				<td><select onchange="change(this.value,'showPosition_options.action',showPosition);">
						<s:action name="showCategory_options" executeResult="true"></s:action>
					</select>
				</td>
				<th>职业名称</th>
				<td><select name="people.pos.posiId" id="ppp">
					</select>
				</td>
				<th>职称</th>
				<td colspan=2><select name="people.lecturer" style="width:259px;"></select></td>
			</tr>
			<tr>
				<th>姓名</th>
				<td><s:textfield name="people.pname" theme="simple"/></td>
				<th>性别</th>
				<td>
					<input type="radio" name="people.sex" value="男" checked />男
					<input type="radio" name="people.sex" value="女"/>女
				</td>
				<th>EMAIL</th>
				<td colspan=2><s:textfield name="people.email" size="38" theme="simple"/></td>
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
		<s:hidden name="people.state" value="0"></s:hidden>
		<input type="submit" value="提交"/>
		<s:reset value="清除" theme="simple"></s:reset>
	</s:form>
	</center>
	<script type="text/javascript" src="js/My.js"></script>
	</body>
</html>
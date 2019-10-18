package cn.myMethod;

import cn.people.O.People;

public class MyMethod {
	//接收一个List或数组对象拼接为一个字符串
	public String toS(People p,String fir,String sec){
		String s = new String();
		s = "'"+p.getPname()+"','"+p.getAge()+"','"+p.getSex()+"','"+
				p.getIdentity()+"','"+p.getPhone()+"','"+p.getEmail()+"','"+
				p.getRegistime()+"','"+p.getNation()+"','"+p.getEducation()+"','"+
				fir+"','"+sec+"','"+p.getThirdO().getoId()+"','"+p.getPos().getPosiId()+"','"+
				p.getMajor()+"','"+p.getIdCart()+"','"+p.getSalary()+"','"+p.getState()+"','"+
				p.getRegister()+"','"+p.getAddress()+"','"+p.getBank()+"','"+p.getBirthday()+"','"+
				p.getPolitical()+"','"+p.getSpeciality()+"'";
		return s;
	}
	//为查询相应的人员信息写的方法：a数组是查询条件的集合，n是第几种条件，st代表的是状态
	public String compose(String []a,int n,int st){
		String s1="from People where ";
		String[] as={"state='0'","state='1'","state!='2'","state='2'"};//默认查询未审核的
		String[] s={"from People where "+as[st],
					s1+a[0]+" and "+as[st],
					s1+a[1]+" and "+as[st],
					s1+a[0]+" and "+a[1]+" and "+as[st],
					s1+a[2]+" and "+as[st],
					s1+a[2]+" and "+a[0]+" and "+as[st],
					s1+a[2]+" and "+a[1]+" and "+as[st],
					s1+a[2]+" and "+a[1]+" and "+a[0]+" and "+as[st],
					s1+a[3]+" and "+as[st],
					s1+a[3]+" and "+a[0]+" and "+as[st],
					s1+a[3]+" and "+a[1]+" and "+as[st],
					s1+a[3]+" and "+a[1]+" and "+a[0]+" and "+as[st],
					s1+a[3]+" and "+a[2]+" and "+as[st],
					s1+a[3]+" and "+a[2]+" and "+a[0]+" and "+as[st],
					s1+a[3]+" and "+a[2]+" and "+a[1]+" and "+as[st],
					s1+a[3]+" and "+a[2]+" and "+a[1]+" and "+a[0]+" and "+as[st]};
		return s[n];
	}
}

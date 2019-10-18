package cn.dao;

import java.util.List;

import org.hibernate.Session;

import cn.hibserv.HibernateServiceProvider;
import cn.people.O.RolePower;
import cn.people.O.User;

public class UserDaoImp {
	private User user;
	private HibernateServiceProvider hsp = new HibernateServiceProvider();
	
	//登录检查
	public User check(String username,String password){
		try{
			Session session = hsp.getSession();
			String HQL = "from User where username=? and password=?";
			List<User> result= (List<User>)session.createQuery(HQL).setString(0, username).setString(1, password).list();
			if(result.size()>0){//这里可能会发生数组越界
				User p = result.get(0);
				return p;
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			hsp.closeSession();
		}
		return null;
	}
	//获取权限信息
	public List<RolePower> getPower(String roleId){
		try{
			Session session = hsp.getSession();
			String HQL = "from RolePower where roleId=?";
			List<RolePower> result= (List<RolePower>)session.createQuery(HQL).setString(0, roleId).list();
			if(result.size()>0){//这里可能会发生数组越界
				return result;
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			hsp.closeSession();
		}
		return null;
	}
	
}

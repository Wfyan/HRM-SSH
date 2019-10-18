package cn.dao;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;

import cn.hibserv.HibernateServiceProvider;
import cn.people.O.People;

public class PeopleDaoImp implements PeopleDaoInt{
	private People people;
	private HibernateServiceProvider hsp = new HibernateServiceProvider();
	//添加人员信息
	public int addPeople(String s){
		int result = 0;
		Transaction t = null;
		    try {
		    	Session session = hsp.getSession();
		    	String SQL = "Call to_people("+s+");";
		    	SQLQuery query = session.createSQLQuery(SQL);
		    	t = session.beginTransaction();
				result =query.executeUpdate();
				t.commit();
				System.out.println(result);
		     } catch (Exception e) {
		         e.printStackTrace();
		     }finally{
		 		hsp.closeSession();
			}
		return result;
	}
	//更改、删除人员信息
	public boolean updatePeople(People people){
		boolean flag = true;
		Transaction t = null;
		try{
			Session session = hsp.getSession();
			t = session.beginTransaction();
			session.update(people);
			t.commit();
		}catch(Exception e){
			if(t!=null) t.rollback();
			e.printStackTrace();
			flag = false;
		}finally{
			hsp.closeSession();
		}
		return flag;
	}
	//依据id查找指定人员信息
	public People findById(String id){
		try{
			Session session = hsp.getSession();
			String HQL = "from People where id=?";
			List<People> result= (List<People>)session.createQuery(HQL).setString(0, id).list();
			if(result.size()>0){//这里可能会发生数组越界
				People p = result.get(0);
				return p;
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			hsp.closeSession();
		}
		return null;
	}
	//依据查询条件查找人员信息
	public List<People> findByThirdId(String s){
		try{
			Session session = hsp.getSession();
			List<People> result= (List<People>)session.createQuery(s).list();
			if(result!=null){
				return result;
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			hsp.closeSession();
		}
		return null;
	}
	//依据档案状态查找人员信息
	public List<People> findByState(String n){
		try{
			Session session = hsp.getSession();
			String HQL = "from People where state=?";
			List<People> result= (List<People>)session.createQuery(HQL).setString(0, n).list();
			if(result!=null){
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

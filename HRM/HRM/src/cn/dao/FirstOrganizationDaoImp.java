package cn.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import cn.hibserv.HibernateServiceProvider;
import cn.organization.O.FirstOrganization;

public class FirstOrganizationDaoImp{
	private HibernateServiceProvider hsp = new HibernateServiceProvider();
	//查找所有一级机构
	public List<FirstOrganization> findAll(){
		try{
			Session session = hsp.getSession();
			String HQL = "from FirstOrganization";
			List<FirstOrganization> result= (List<FirstOrganization>)session.createQuery(HQL).list();
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
	//添加一级机构
	public String addFirstOrganization(FirstOrganization o){
		String result = null;
		Transaction t = null;
		    try {
		    	Session session = hsp.getSession();
		    	t = session.beginTransaction();
		    	result = (String)session.save(o);
				t.commit();
		     } catch (Exception e) {
		    	 if(t!=null)t.rollback();
		         e.printStackTrace();
		     }finally{
		 		hsp.closeSession();
			}
		return result;
	}
}

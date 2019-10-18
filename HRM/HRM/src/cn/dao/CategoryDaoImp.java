package cn.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import cn.hibserv.HibernateServiceProvider;
import cn.organization.O.Category;

public class CategoryDaoImp{
	private Category cat;
	private HibernateServiceProvider hsp = new HibernateServiceProvider();
	//添加职位分类
	public String addKind(Category c){
		String result = null;
		Transaction t = null;
		    try {
		    	Session session = hsp.getSession();
		    	t = session.beginTransaction();
		    	result = (String)session.save(c);
				t.commit();
		     } catch (Exception e) {
		    	 if(t!=null)t.rollback();
		         e.printStackTrace();
		     }finally{
		 		hsp.closeSession();
			}
		return result;
	}
	//查找所有
	public List<Category> findAll(){
		Session session = hsp.getSession();
		String HQL = "from Category";
		Query query = session.createQuery(HQL);
		List<Category> result = (List<Category>)query.list();
		if(result!=null){
			hsp.closeSession();
			return result;
		}
		hsp.closeSession();
		return null;
	}
}

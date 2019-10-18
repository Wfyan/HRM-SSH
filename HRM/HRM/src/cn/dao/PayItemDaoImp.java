package cn.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import cn.hibserv.HibernateServiceProvider;
import cn.payPosition.O.PayItem;
import cn.payPosition.O.PayRatio;
import cn.payPosition.O.StandardV;

public class PayItemDaoImp{
	private PayItem pay;
	private HibernateServiceProvider hsp = new HibernateServiceProvider();
	//添加项目
	public int addPayItem(PayItem p){
		int result = 0;
		Transaction t = null;
		    try {
		    	Session session = hsp.getSession();
		    	t = session.beginTransaction();
		    	result = (int)session.save(p);
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
	public List<PayItem> findAll(){
		Session session = hsp.getSession();
		String HQL = "from PayItem";
		Query query = session.createQuery(HQL);
		List<PayItem> result = (List<PayItem>)query.list();
		if(result!=null){
			hsp.closeSession();
			return result;
		}
		hsp.closeSession();
		return null;
	}
	//查询薪酬标准视图
	public List<StandardV> findAllStandard(){
	    try {
	    	Session session = hsp.getSession();
			String HQL = "from StandardV";
			List<StandardV> result = (List<StandardV>)session.createQuery(HQL).list();
			if(result!=null){
				return result;
			}
	     } catch (Exception e) {
	         e.printStackTrace();
	     }finally{
	 		hsp.closeSession();
		}
		return null;
	}
	//根据查找指定薪酬项目
	public PayItem findById(int id){
		Session session = hsp.getSession();
		String HQL = "from PayItem where itemId=?";
		List<PayItem> result = (List<PayItem>)session.createQuery(HQL).setString(0, Integer.toString(id)).list();
		if(result.size()>0){
			hsp.closeSession();
			PayItem p = result.get(0);
			return p;
		}
		hsp.closeSession();
		return null;
	}
	//根据职业id查询与之关联的项目
	public List<PayRatio> findByPosId(String id){
		Session session = hsp.getSession();
		String HQL = "from PayRatio where positionId=?";
		List<PayRatio> result = (List<PayRatio>)session.createQuery(HQL).setString(0, id).list();
		if(result!=null){
			hsp.closeSession();
			return result;
		}
		hsp.closeSession();
		return null;
	}		
	//删除某一职业id关联的项目
	public int deleteByPosId(String id){
		Session session = hsp.getSession();
		String HQL = "delete from PayRatio where positionId=?";
		int result = session.createSQLQuery(HQL).setString(0, id).executeUpdate();
		hsp.closeSession();
		return result;
	}	
	//登记职业薪酬标准
	public int addPayRaio(PayRatio p){
		int result = 0;
		Transaction t = null;
		    try {
		    	Session session = hsp.getSession();
		    	t = session.beginTransaction();
		    	result = (int)session.save(p);
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

package cn.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import cn.hibserv.HibernateServiceProvider;
import cn.organization.O.Position;

public class PositionDaoImp{
	private Position pay;
	private HibernateServiceProvider hsp = new HibernateServiceProvider();
	//添加职位
	public String addPosition(Position p){
		String result = null;
		Transaction t = null;
		    try {
		    	Session session = hsp.getSession();
		    	t = session.beginTransaction();
		    	result = (String)session.save(p);
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
	public List<Position> findAll(){
		Session session = hsp.getSession();
		String HQL = "from Position";
		Query query = session.createQuery(HQL);
		List<Position> result = (List<Position>)query.list();
		if(result!=null){
			hsp.closeSession();
			return result;
		}
		hsp.closeSession();
		return null;
	}
	//查找一分类下的所有职位
	public List<Position> findById(String id){
		Session session = hsp.getSession();
		String HQL = "from Position where kindId=?";
		Query query = session.createQuery(HQL).setString(0, id);
		List<Position> result = (List<Position>)query.list();
		if(result!=null){
			hsp.closeSession();
			return result;
		}
		hsp.closeSession();
		return null;
	}
	//根据Id查找某一职位
	public Position findByPosId(String id){
		Session session = hsp.getSession();
		String HQL = "from Position where positionId=?";
		Query query = session.createQuery(HQL).setString(0, id);
		List<Position> result = (List<Position>)query.list();
		if(result.size()>0){
			hsp.closeSession();
			Position p = result.get(0);
			return p;
		}
		hsp.closeSession();
		return null;
	}
}

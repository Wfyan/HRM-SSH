package cn.dao;

import java.util.List;

import org.hibernate.Session;

import cn.hibserv.HibernateServiceProvider;
import cn.organization.O.ThirdOrganization;

public class ThirdOrganizationDaoImp{
	private HibernateServiceProvider hsp = new HibernateServiceProvider();
	//查找所有三级机构
	public List<ThirdOrganization> findAll(){
		try{
			Session session = hsp.getSession();
			String HQL = "from ThirdOrganization";
			List<ThirdOrganization> result= (List<ThirdOrganization>)session.createQuery(HQL).list();
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
	//依据二级ID查询旗下三级机构
	public List<ThirdOrganization> findThirdById(String id){
		try{
			Session session = hsp.getSession();
			String HQL = "from ThirdOrganization where orIdII=?";
			List<ThirdOrganization> result= (List<ThirdOrganization>)session.createQuery(HQL).setString(0, id).list();
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

package cn.dao;

import java.util.List;

import org.hibernate.Session;

import cn.hibserv.HibernateServiceProvider;
import cn.organization.O.SecondOrganization;

public class SecondOrganizationDaoImp{
	private HibernateServiceProvider hsp = new HibernateServiceProvider();
	//查找所有二级机构
	public List<SecondOrganization> findAll(){
		try{
			Session session = hsp.getSession();
			String HQL = "from SecondOrganization";
			List<SecondOrganization> result= (List<SecondOrganization>)session.createQuery(HQL).list();
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
	//通过一级ID查找旗下二级机构
	public List<SecondOrganization> findSecondById(String id){
		try{
			Session session = hsp.getSession();
			String HQL = "from SecondOrganization where orIdI =?";
			List<SecondOrganization> result= (List<SecondOrganization>)session.createQuery(HQL).setString(0, id).list();
			for(int i=0;i<result.size();i++){
				System.out.println(result.get(i).getManager());
			}
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

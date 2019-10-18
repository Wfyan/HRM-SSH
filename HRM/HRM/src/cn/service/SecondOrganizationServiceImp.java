package cn.service;

import java.util.List;

import cn.dao.SecondOrganizationDaoImp;
import cn.organization.O.SecondOrganization;

public class SecondOrganizationServiceImp{
	private SecondOrganizationDaoImp sDao;
	//查找所有
	public List<SecondOrganization> findAll(){
		sDao = new SecondOrganizationDaoImp();
		List<SecondOrganization> rs = sDao.findAll();
		return rs;
	}
	//依据一级ID查询
	public List<SecondOrganization> findSecondById(String id){
		sDao = new SecondOrganizationDaoImp();
		List<SecondOrganization> rs = sDao.findSecondById(id);
		return rs;
	}
}

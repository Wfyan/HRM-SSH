package cn.service;

import java.util.List;

import cn.dao.ThirdOrganizationDaoImp;
import cn.organization.O.ThirdOrganization;

public class ThirdOrganizationServiceImp{
	private ThirdOrganizationDaoImp tDao;
	//查找所有
	public List<ThirdOrganization> findAll(){
		tDao = new ThirdOrganizationDaoImp();
		List<ThirdOrganization> rs = tDao.findAll();
		return rs;
	}
	//依据二级ID查询
	public List<ThirdOrganization> findThirdById(String id){
		tDao = new ThirdOrganizationDaoImp();
		List<ThirdOrganization> rs = tDao.findThirdById(id);
		return rs;
	}
}

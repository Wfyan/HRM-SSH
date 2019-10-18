package cn.service;

import java.util.List;

import cn.dao.FirstOrganizationDaoImp;
import cn.organization.O.FirstOrganization;

public class FirstOrganizationServiceImp{
	private FirstOrganizationDaoImp fDao;
	//查找所有
	public List<FirstOrganization> findAll(){
		fDao = new FirstOrganizationDaoImp();
		List<FirstOrganization> rs = fDao.findAll();
		return rs;
	}
	//保存一个一级机构
	public boolean save(FirstOrganization o){
		fDao = new FirstOrganizationDaoImp();
		boolean flag =true;
		try{
			if((fDao.addFirstOrganization(o))==null){
				flag=false;
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return flag;
	}
}

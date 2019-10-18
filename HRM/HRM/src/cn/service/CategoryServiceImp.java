package cn.service;

import java.util.List;

import cn.dao.CategoryDaoImp;
import cn.organization.O.Category;

public class CategoryServiceImp{
	private Category cat;
	private CategoryDaoImp dao;
	//保存一个分类
	public boolean save(Category c){
		dao = new CategoryDaoImp();
		boolean flag =true;
		try{
			if((dao.addKind(c))==null){
				flag=false;
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return flag;
	}
	//依据id查找人员信息
	public List<Category> findAll(){
		dao = new CategoryDaoImp();
		List<Category> p = dao.findAll();
		return p;
	}
}

package cn.organization.action;

import java.util.List;

import cn.organization.O.Category;
import cn.service.CategoryServiceImp;

public class ShowCategoryAction{
	private List<Category> List;
	private CategoryServiceImp Service = new CategoryServiceImp();
	public List<Category> getList() {
		return List;
	}
	public void setList(List<Category> list) {
		List = list;
	}
	public String list(){//会默认调用第一个方法
		List = (List<Category>)Service.findAll();
		if(List!=null)return "list";
		return "input";
	}
	public String options(){
		List = (List<Category>)Service.findAll();
		if(List!=null)return "options";
		return "input";
	}
}

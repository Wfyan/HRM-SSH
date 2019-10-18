package cn.organization.action;

import com.opensymphony.xwork2.ActionSupport;

import cn.organization.O.Category;
import cn.service.CategoryServiceImp;

public class AddCategoryAction extends ActionSupport {
	private Category cat;
	private CategoryServiceImp service;
	public Category getCat() {
		return cat;
	}
	public void setCat(Category cat) {
		this.cat = cat;
	}
	public String execute(){
		service = new CategoryServiceImp();
		if(service.save(cat)){
			return "success";
		}
		return "input";
	}
}

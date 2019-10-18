package cn.people.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import cn.people.O.RolePower;
import cn.people.O.User;
import cn.service.UserServiceImp;

public class ShowPowerAction extends ActionSupport {
	private User user;
	private UserServiceImp Service;

	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String execute(){//查看信息页面，不能修改的
		Service = new UserServiceImp();
		List<RolePower> p = Service.getPower(Integer.toString(user.getRoleId()));
		for(int i=0;i<p.size();i++){
			System.out.println(p.get(i).getPowername());
		}
		if(p!=null)return "success";
		return "input";
	}
}

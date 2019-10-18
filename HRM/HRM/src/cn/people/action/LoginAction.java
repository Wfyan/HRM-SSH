	package cn.people.action;
	
	import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import cn.people.O.RolePower;
import cn.people.O.User;
import cn.service.UserServiceImp;
	
	public class LoginAction extends ActionSupport{
		private User user;
		private List<RolePower> powerList;
		private UserServiceImp Service;
	
		public User getUser() {
			return user;
		}
		public void setUser(User user) {
			this.user = user;
		}
		public List<RolePower> getPowerList() {
			return powerList;
		}
		public void setPowerList(List<RolePower> powerList) {
			this.powerList = powerList;
		}
		public String execute(){
			Service = new UserServiceImp();
			user = Service.check(user.getUsername(), user.getPassword());
			if(user!=null){
				HttpSession session = ServletActionContext.getRequest().getSession();
				session.setAttribute("role",user.getRoleId());
				powerList = Service.getPower(Integer.toString(user.getRoleId()));
				return "success";
			}
			return "input";
		}
	}

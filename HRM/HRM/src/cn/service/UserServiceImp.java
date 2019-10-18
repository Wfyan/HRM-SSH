package cn.service;

import java.util.List;

import cn.dao.UserDaoImp;
import cn.people.O.RolePower;
import cn.people.O.User;

public class UserServiceImp{
	private User user;
	private UserDaoImp dao;

	//依据id查找人员信息
	public User check(String username,String password){
		dao = new UserDaoImp();
		User p = dao.check(username,password);
		return p;
	}
	//获取权限信息
	public List<RolePower> getPower(String roleId){
		dao = new UserDaoImp();
		List<RolePower> p = dao.getPower(roleId);
		return p;
	}
}

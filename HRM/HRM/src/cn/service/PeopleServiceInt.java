package cn.service;

import java.util.List;

import cn.people.O.People;

public interface PeopleServiceInt {
	public boolean save(People people,String fir,String sec);//保存一个人员信息
	public boolean update(People people);//更改、删除人员信息
	public People findById(String id);//依据id查找人员信息
	public List<People> findByThirdId(String s);//模糊查询条件查找人员信息
	public List<People> findByState(String s);//依据档案状态查找人员信息
}

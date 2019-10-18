package cn.dao;

import java.util.List;

import cn.people.O.People;

public interface PeopleDaoInt {
	public int addPeople(String s);//添加人员信息
	public boolean updatePeople(People people);//更改、删除人员信息
	public People findById(String id);//依据id查找指定人员信息
	public List<People> findByThirdId(String s);//依据查询条件查找人员信息
	public List<People> findByState(String n);//依据档案状态查找人员信息
}

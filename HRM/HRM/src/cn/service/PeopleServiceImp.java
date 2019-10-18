package cn.service;

import java.util.List;

import cn.dao.PeopleDaoImp;
import cn.dao.PeopleDaoInt;
import cn.myMethod.MyMethod;
import cn.people.O.People;

public class PeopleServiceImp implements PeopleServiceInt {
	private People people;
	private PeopleDaoInt peopleDao;
	//保存一个人员信息
	public boolean save(People people,String fir,String sec){
		peopleDao = new PeopleDaoImp();
		String s = new MyMethod().toS(people, fir, sec);
		boolean flag =true;
		try{
			if((peopleDao.addPeople(s))==0){
				flag=false;
				/*for(int i=0;i<rs.size();i++){
					if((int)rs.get(i)==0){
						System.out.println("数据格式有误！");
						flag = false;
					}
				}*/
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return flag;
	}
	//更改、删除人员信息
	public boolean update(People people){
		peopleDao = new PeopleDaoImp();
		boolean flag = false;
		if(peopleDao.updatePeople(people)){
			flag = true;
		}
		return flag;
	}
	//依据id查找人员信息
	public People findById(String id){
		peopleDao = new PeopleDaoImp();
		People p = peopleDao.findById(id);
		return p;
	}
	//模糊查询条件查找人员信息
	public List<People> findByThirdId(String s){
		peopleDao = new PeopleDaoImp();
		List<People> p = peopleDao.findByThirdId(s);
		return p;
	}
	//依据档案状态查找人员信息
	public List<People> findByState(String s){
		peopleDao = new PeopleDaoImp();
		List<People> p = peopleDao.findByState(s);
		return p;
	}
	//模糊查询
	/*public List<People> findByThirdId(People people) {
		peopleDao = new PeopleDaoImp();
		List<People> p = peopleDao.findByThirdId(people);
		return p;
	}*/
}

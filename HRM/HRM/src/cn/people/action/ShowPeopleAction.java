package cn.people.action;

import com.opensymphony.xwork2.ActionSupport;

import cn.people.O.People;
import cn.service.PeopleServiceImp;
import cn.service.PeopleServiceInt;

public class ShowPeopleAction extends ActionSupport {
	private People people;
	private PeopleServiceInt peopleService;
	public People getPeople() {
		return people;
	}
	public void setPeople(People people) {
		this.people = people;
	}
	public String execute(){//查看信息页面，不能修改的
		peopleService = new PeopleServiceImp();
		if(peopleService.findById(people.getId())!=null){
			people = peopleService.findById(people.getId());
			return "success";
		}
		return "input";
	}
	public String toUpdate(){//修改信息页面，部分修改，置位状态为未复核
		peopleService = new PeopleServiceImp();
		if(peopleService.findById(people.getId())!=null){
			people = peopleService.findById(people.getId());
			people.setState("0");//更改后的档案状态应为0
			return "update";
		}
		return "input";
	}
	public String checkToUpdate(){//修改信息页面，部分修改
		peopleService = new PeopleServiceImp();
		if(peopleService.findById(people.getId())!=null){
			people = peopleService.findById(people.getId());
			people.setState("1");//审核后的档案状态应为1
			return "update";
		}
		return "input";
	}
}

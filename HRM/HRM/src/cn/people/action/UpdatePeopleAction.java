package cn.people.action;

import com.opensymphony.xwork2.ActionSupport;

import cn.people.O.People;
import cn.service.PeopleServiceImp;
import cn.service.PeopleServiceInt;

@SuppressWarnings("serial")
public class UpdatePeopleAction extends ActionSupport {
	private People people;
	private PeopleServiceInt peopleService;
	public People getPeople() {
		return people;
	}
	public void setPeople(People people) {
		this.people = people;
	}
	public String execute(){//调用更改人员信息功能
		System.out.println(people.getState());
		peopleService = new PeopleServiceImp();
		if(peopleService.update(people)){
			return "success";
		}
		return "input";
	}
	public String recover(){//修改信息页面，部分修改，置位状态为未正常
		peopleService = new PeopleServiceImp();
		people = peopleService.findById(people.getId());
		if(people!=null){
			people.setState("1");//恢复后的档案状态应为1
			if(peopleService.update(people)){
				return "recover";
			}	
		}
		return "input";
	}
}

package cn.people.action;

import com.opensymphony.xwork2.ActionSupport;

import cn.people.O.People;
import cn.service.PeopleServiceImp;
import cn.service.PeopleServiceInt;

@SuppressWarnings("serial")
public class DeletePeopleAction extends ActionSupport {
	private People people;
	private PeopleServiceInt peopleService;
	public People getPeople() {
		return people;
	}
	public void setPeople(People people) {
		this.people = people;
	}
	public String execute(){
		peopleService = new PeopleServiceImp();
		if(peopleService.findById(people.getId())!=null){
			people = peopleService.findById(people.getId());
			people.setState("2");//删除后的档案状态应为2
			peopleService.update(people);
			return "success";
		}
		return "input";
	}
}

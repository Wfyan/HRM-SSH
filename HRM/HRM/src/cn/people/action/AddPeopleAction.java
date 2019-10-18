package cn.people.action;

import com.opensymphony.xwork2.ActionSupport;

import cn.people.O.People;
import cn.service.PeopleServiceImp;
import cn.service.PeopleServiceInt;

@SuppressWarnings("serial")
public class AddPeopleAction extends ActionSupport {
	private People people;
	private String fir;//获取一级机构
	private String sec;//获取二级机构
	private PeopleServiceInt peopleService;
	public People getPeople() {
		return people;
	}
	public void setPeople(People people) {
		this.people = people;
	}
	public String getFir() {
		return fir;
	}
	public void setFir(String fir) {
		this.fir = fir;
	}
	public String getSec() {
		return sec;
	}
	public void setSec(String sec) {
		this.sec = sec;
	}
	public String execute(){
		peopleService = new PeopleServiceImp();
		if(peopleService.save(people, fir, sec)){
			return "success";
		}
		return "input";
	}
}

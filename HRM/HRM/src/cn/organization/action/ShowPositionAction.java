package cn.organization.action;

import java.util.List;

import cn.organization.O.Position;
import cn.service.PositionServiceImp;

public class ShowPositionAction{
	private String Id;
	private List<Position> List;
	private PositionServiceImp Service = new PositionServiceImp();
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public List<Position> getList() {
		return List;
	}
	public void setList(List<Position> list) {
		List = list;
	}
	public String list(){
		List = (List<Position>)Service.findAll();
		if(List!=null)return "list";
		return "input";
	}
	public String options(){
		List = (List<Position>)Service.findById(Id);
		if(List!=null)return "options";
		return "input";
	}
}

package cn.organization.action;

import com.opensymphony.xwork2.ActionSupport;

import cn.organization.O.Position;
import cn.service.PositionServiceImp;

public class AddPositionAction extends ActionSupport {
	private Position p;
	private PositionServiceImp service;
	public Position getP() {
		return p;
	}
	public void setP(Position p) {
		this.p = p;
	}
	public String execute(){
		service = new PositionServiceImp();
		if(service.save(p)){
			return "success";
		}
		return "input";
	}
}

package cn.pay.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import cn.payPosition.O.PayItem;
import cn.payPosition.O.StandardV;
import cn.service.PayItemServiceImp;

public class ShowStandardAction extends ActionSupport{
	private List<StandardV> List;
	private PayItemServiceImp Service = new PayItemServiceImp();

	public List<StandardV> getList() {
		return List;
	}
	public void setList(List<StandardV> list) {
		List = list;
	}

	public String execute(){
		List = (List<StandardV>)Service.findAllStandard();
		
		if(List!=null){
			return "success";
		}
		return "input";
	}
}

package cn.pay.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import cn.payPosition.O.PayItem;
import cn.service.PayItemServiceImp;

public class ShowPayItemAction extends ActionSupport{
	private List<PayItem> List;
	private PayItemServiceImp Service = new PayItemServiceImp();
	public List<PayItem> getList() {
		return List;
	}
	public void setList(List<PayItem> list) {
		List = list;
	}
	public String execute(){
		List = (List<PayItem>)Service.findAll();
		if(List!=null)return "success";
		return "input";
	}
}

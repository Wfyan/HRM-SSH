package cn.pay.action;

import com.opensymphony.xwork2.ActionSupport;

import cn.payPosition.O.PayItem;
import cn.service.PayItemServiceImp;

public class AddItemAction extends ActionSupport {
	private PayItem pay;
	private PayItemServiceImp service;
	public PayItem getPay() {
		return pay;
	}
	public void setPay(PayItem pay) {
		this.pay = pay;
	}
	public String execute(){
		service = new PayItemServiceImp();
		if(service.save(pay)){
			return "success";
		}
		return "input";
	}
}

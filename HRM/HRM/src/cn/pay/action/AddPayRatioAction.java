package cn.pay.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import cn.organization.O.Position;
import cn.payPosition.O.PayItem;
import cn.payPosition.O.PayRatio;
import cn.service.PayItemServiceImp;
import cn.service.PositionServiceImp;

public class AddPayRatioAction extends ActionSupport {
	private PayRatio pay;
	private List<String> list;
	private PayItemServiceImp service;
	private PositionServiceImp pservice;
	public PayRatio getPay() {
		return pay;
	}
	public void setPay(PayRatio pay) {
		this.pay = pay;
	}
	public List<String> getList() {
		return list;
	}
	public void setList(List<String> list) {
		this.list = list;
	}
	public String execute(){
		service = new PayItemServiceImp();
		pservice = new PositionServiceImp();
		String s = "success";
		service.deleteByPosId(pay.getPos().getPosiId());
		if(list!=null){
			for(int i=0;i<list.size();i++){
				PayItem pt = new PayItem();//传值的jsp页面没有相应的属性，需要自行实例化
				pt.setItemId(Integer.parseInt(list.get(i)));
				pay.setpItem(pt);
				Position p = pservice.findByPosId(pay.getPos().getPosiId());
				pay.setPos(p);
				if(!service.addPayRaio(pay)){
					s= "inpnt";
				}
			}
		}
		return s;
	}
}

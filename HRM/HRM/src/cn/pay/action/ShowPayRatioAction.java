package cn.pay.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import cn.payPosition.O.PayItem;
import cn.payPosition.O.PayRatio;
import cn.service.PayItemServiceImp;

public class ShowPayRatioAction extends ActionSupport{
	private List<PayRatio> List;
	private String Id;
	private PayItemServiceImp Service = new PayItemServiceImp();
	public List<PayRatio> getList() {
		return List;
	}
	public void setList(List<PayRatio> list) {
		List = list;
	}
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String execute(){
		List = (List<PayRatio>)Service.findByPosId(Id);//通过职位去找
		if(List!=null){
			for(int i=0;i<List.size();i++){
				PayItem p = Service.findById(List.get(i).getpItem().getItemId());
				List.get(i).setpItem(p);
			}
			return "success";
		}
		return "input";
	}
}

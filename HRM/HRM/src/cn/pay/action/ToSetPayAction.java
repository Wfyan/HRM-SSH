package cn.pay.action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import cn.payPosition.O.PayItem;
import cn.payPosition.O.PayRatio;
import cn.service.PayItemServiceImp;

public class ToSetPayAction extends ActionSupport{
	private String Id;//职位ID
	private List<PayItem> aList;
	private List<PayItem> olist;
	private PayItemServiceImp Service = new PayItemServiceImp();
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public List<PayItem> getaList() {
		return aList;
	}
	public void setaList(List<PayItem> aList) {
		this.aList = aList;
	}
	public List<PayItem> getOlist() {
		return olist;
	}
	public void setOlist(List<PayItem> olist) {
		this.olist = olist;
	}
	public String execute(){
		aList = (List<PayItem>)Service.findAll();
		List<PayRatio> t = (List<PayRatio>)Service.findByPosId(Id);
		olist = new ArrayList();
		for(int i=0;i<t.size();i++){
			olist.add(Service.findById(t.get(i).getpItem().getItemId()));
			for(int j=0;j<aList.size();j++){
				if(olist.get(i).getItemId()==aList.get(j).getItemId()){
					aList.remove(j);
					break;
				}
			}
		}
		if(aList!=null)return "success";
		return "input";
	}
}

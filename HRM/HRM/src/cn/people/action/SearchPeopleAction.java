package cn.people.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import cn.myMethod.MyMethod;
import cn.people.O.People;
import cn.service.PeopleServiceImp;
import cn.service.PeopleServiceInt;

@SuppressWarnings("serial")
public class SearchPeopleAction extends ActionSupport {
	private int flag;//档案状态
	private int count;//统计查询的例数
	private String thirdId;
	private String pId;
	private String mintime;
	private String maxtime;
	private List<People> List;
	private PeopleServiceInt peopleService;
	
	public int getFlag() {
		return flag;
	}
	public void setFlag(int flag) {
		this.flag = flag;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public String getThirdId() {
		return thirdId;
	}
	public void setThirdId(String thirdId) {
		this.thirdId = thirdId;
	}
	public String getpId() {
		return pId;
	}
	public void setpId(String pId) {
		this.pId = pId;
	}
	public String getMintime() {
		return mintime;
	}
	public void setMintime(String mintime) {
		this.mintime = mintime;
	}
	public String getMaxtime() {
		return maxtime;
	}
	public void setMaxtime(String maxtime) {
		this.maxtime = maxtime;
	}
	public List<People> getList() {
		return List;
	}
	public void setList(List<People> list) {
		List = list;
	}
	public String execute(){//查询人员信息，并导向showPeople页面
		peopleService = new PeopleServiceImp();
		//定义查询条件
		String[] as= new String[4];
		as[0]="organizeId='"+thirdId+"'";
		as[1]="positionId='"+pId+"'";
		as[2]="registime >= '"+mintime+"'";
		as[3]="registime <= '"+maxtime+"'";
		//通过二进制转十进制实现查询条件的识别
		String a,b,c,d="";
		a=(!thirdId.equals("")) ? "1" : "0";
		b=(!pId.equals("")) ? "1" : "0";
		c=(!mintime.equals("")) ? "1" : "0";
		d=(!maxtime.equals("")) ? "1" : "0";
				
		int n = Integer.parseInt((d+c+b+a), 2);
		//开始查询
		String s= new MyMethod().compose(as,n,flag);
		/*System.out.println(n);
		switch(n){
		case 0:
			s="";
			break;
		case 1:
			s="from People where organizeId="+thirdId+" and state!='2'";
			break;
		case 2:
			s="from People where positionId="+pId+" and state!='2'";
			break;
		case 3:
			s="from People where organizeId="+thirdId+" and positionId="+pId+" and state!='2'";
			break;
		case 4:
			s="from People where registime >= '"+mintime+"' AND registime <= '"+maxtime+"'"+" and state!='2'";
			break;
		case 5:
			s="from People where organizeId='"+thirdId+"' AND registime >= '"+mintime+"' AND registime <= '"+maxtime+"'"+" and state!='2'";
			break;
		case 6:
			s="from People where positionId='"+pId+"' and registime >= '"+mintime+"' AND registime <= '"+maxtime+"'"+" and state!='2'";
			break;
		case 7:
			s="from People where organizeId='"+thirdId+"' and positionId='"+pId+"'and registime >= '"+mintime+"' AND registime <= '"+maxtime+"'"+" and state!='2'";
			break;
		}
		if(s.equals("")){
			System.out.println("Nothing");
			return "input";
		}*/
		System.out.println(s);
		List=peopleService.findByThirdId(s);
		count = List.size();
		/*for(int i=0;i<List.size();i++){
			System.out.println(List.get(i).getId());
		}*/
		if(List!=null){
			return "success";
		}
		return "input";
	}
	public String toCheck(){//查询未审核的人员信息
		peopleService = new PeopleServiceImp();
		List = peopleService.findByState("0");
		count = List.size();
		if(List!=null){
			return "check";
		}
		return "input";
	}
}

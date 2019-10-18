package cn.organization.action;

import java.util.List;

import cn.organization.O.SecondOrganization;
import cn.service.SecondOrganizationServiceImp;

public class ShowSecondOrganization {
	private String Id;
	private List<SecondOrganization> OList;
	private SecondOrganizationServiceImp OService = new SecondOrganizationServiceImp();
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public List<SecondOrganization> getOList() {
		return OList;
	}
	public void setOList(List<SecondOrganization> oList) {
		OList = oList;
	}
	public String execute(){
		OList = (List<SecondOrganization>)OService.findSecondById(Id);
		if(OList!=null)return "success";
		return "input";
	}
	public String all(){
		OList = (List<SecondOrganization>)OService.findAll();
		if(OList!=null)return "all";
		return "input";
	}
}

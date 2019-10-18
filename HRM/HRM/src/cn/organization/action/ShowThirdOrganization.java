package cn.organization.action;

import java.util.List;

import cn.organization.O.ThirdOrganization;
import cn.service.ThirdOrganizationServiceImp;

public class ShowThirdOrganization {
	private String id;
	private List<ThirdOrganization> OList;
	private ThirdOrganizationServiceImp OService = new ThirdOrganizationServiceImp();
	public List<ThirdOrganization> getOList() {
		return OList;
	}
	public void setOList(List<ThirdOrganization> oList) {
		OList = oList;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String execute(){
		OList = (List<ThirdOrganization>)OService.findThirdById(id);
		if(OList!=null)return "success";
		return "input";
	}
	public String all(){
		OList = (List<ThirdOrganization>)OService.findAll();
		if(OList!=null)return "success";
		return "input";
	}
}

package cn.organization.action;

import java.util.List;

import cn.organization.O.FirstOrganization;
import cn.service.FirstOrganizationServiceImp;

public class ShowFirstOrganization {
	private List<FirstOrganization> OList;
	private FirstOrganizationServiceImp firstOService = new FirstOrganizationServiceImp();
	public List<FirstOrganization> getOList() {
		return OList;
	}
	public void setOList(List<FirstOrganization> oList) {
		OList = oList;
	}
	public String execute(){
		OList = (List<FirstOrganization>)firstOService.findAll();

		if(OList!=null)return "success";
		return "input";
	}
}

package cn.organization.O;

public class SecondOrganization {
	private String oId;
	private String organizename;
	private String manager;
	private FirstOrganization firstO;//与一级机构的主键映射
	public String getoId() {
		return oId;
	}
	public void setoId(String oId) {
		this.oId = oId;
	}
	public String getOrganizename() {
		return organizename;
	}
	public void setOrganizename(String organizename) {
		this.organizename = organizename;
	}
	public String getManager() {
		return manager;
	}
	public void setManager(String manager) {
		this.manager = manager;
	}
	public FirstOrganization getFirstO() {
		return firstO;
	}
	public void setFirstO(FirstOrganization firstO) {
		this.firstO = firstO;
	}
}

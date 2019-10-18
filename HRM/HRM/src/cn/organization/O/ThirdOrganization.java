package cn.organization.O;

public class ThirdOrganization {
	private String oId;
	private String organizename;
	private String manager;
	private SecondOrganization secondO;//与二级机构的主键映射
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
	public SecondOrganization getSecondO() {
		return secondO;
	}
	public void setSecondO(SecondOrganization secondO) {
		this.secondO = secondO;
	}
}

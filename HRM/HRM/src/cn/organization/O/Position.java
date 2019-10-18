package cn.organization.O;

import java.util.Set;

import cn.payPosition.O.PayRatio;

public class Position {
	private String posiId;
	private String positionName;
	private ThirdOrganization thirdO;
	private Category cat;
	private Set<PayRatio> ratio;
	public String getPosiId() {
		return posiId;
	}
	public void setPosiId(String posiId) {
		this.posiId = posiId;
	}
	public String getPositionName() {
		return positionName;
	}
	public void setPositionName(String positionName) {
		this.positionName = positionName;
	}
	public Category getCat() {
		return cat;
	}
	public void setCat(Category cat) {
		this.cat = cat;
	}
	public ThirdOrganization getThirdO() {
		return thirdO;
	}
	public void setThirdO(ThirdOrganization thirdO) {
		this.thirdO = thirdO;
	}
	public Set<PayRatio> getRatio() {
		return ratio;
	}
	public void setRatio(Set<PayRatio> ratio) {
		this.ratio = ratio;
	}
}

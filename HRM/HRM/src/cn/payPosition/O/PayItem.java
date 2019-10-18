package cn.payPosition.O;

import java.util.Set;

public class PayItem {
	private int itemId;
	private String item;
	private Set<PayRatio> ratio;
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public Set<PayRatio> getRatio() {
		return ratio;
	}
	public void setRatio(Set<PayRatio> ratio) {
		this.ratio = ratio;
	}
}

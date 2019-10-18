package cn.payPosition.O;

import java.sql.Date;

import cn.organization.O.Position;

public class PayRatio {
	private int id;
	private Position pos;
	private PayItem pItem;
	private String value;
	private String assigner;
	private Date registDate;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Position getPos() {
		return pos;
	}
	public void setPos(Position pos) {
		this.pos = pos;
	}
	public PayItem getpItem() {
		return pItem;
	}
	public void setpItem(PayItem pItem) {
		this.pItem = pItem;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getAssigner() {
		return assigner;
	}
	public void setAssigner(String assigner) {
		this.assigner = assigner;
	}
	public Date getRegistDate() {
		return registDate;
	}
	public void setRegistDate(Date registDate) {
		this.registDate = registDate;
	}
}

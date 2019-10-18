package cn.people.O;

public class RolePower {
	private int id;
	private int powerId;
	private String powername;
	private User user;
	private String ahref;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPowerId() {
		return powerId;
	}
	public void setPowerId(int powerId) {
		this.powerId = powerId;
	}
	public String getPowername() {
		return powername;
	}
	public void setPowername(String powername) {
		this.powername = powername;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getAhref() {
		return ahref;
	}
	public void setAhref(String ahref) {
		this.ahref = ahref;
	}
}

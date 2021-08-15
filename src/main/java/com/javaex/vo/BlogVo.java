package com.javaex.vo;

public class BlogVo {

	//field
	private int userNo;
	private String username;
	private String id;
	private String blogTitle;
	private String logoFile;
	
	public BlogVo() {
	}
	
	public BlogVo(int userNo, String username, String id, String blogTitle, String logoFile) {
		this.userNo = userNo;
		this.username = username;
		this.id = id;
		this.blogTitle = blogTitle;
		this.logoFile = logoFile;
	}

	public int getUserNo() {
		return userNo;
	}

	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getBlogTitle() {
		return blogTitle;
	}

	public void setBlogTitle(String blogTitle) {
		this.blogTitle = blogTitle;
	}

	public String getLogoFile() {
		return logoFile;
	}

	public void setLogoFile(String logoFile) {
		this.logoFile = logoFile;
	}

	@Override
	public String toString() {
		return "BlogVo [userNo=" + userNo + ", username=" + username + ", id=" + id + ", blogTitle=" + blogTitle
				+ ", logoFile=" + logoFile + "]";
	}
	
	
}

package com.javaex.vo;

public class CategoryVo {

	//field
	 private int cateNo;
	 private String id;
	 private String cateName;
	 private String description;
	 private String regDate;
	 private int count;
	 private int postNo;
	 private String postTitle;
	 private String postContent;
	
	//constructor
	public CategoryVo() {
	} 
	 
	 public CategoryVo(int cateNo, String id, String cateName, String description, String regDate, int count, int postNo,
			String postTitle, String postContent) {
		this.cateNo = cateNo;
		this.id = id;
		this.cateName = cateName;
		this.description = description;
		this.regDate = regDate;
		this.count = count;
		this.postNo = postNo;
		this.postTitle = postTitle;
		this.postContent = postContent;
	}

	//method-g/s
	public int getCateNo() {
		return cateNo;
	}

	public void setCateNo(int cateNo) {
		this.cateNo = cateNo;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCateName() {
		return cateName;
	}

	public void setCateName(String cateName) {
		this.cateName = cateName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getRegDate() {
		return regDate;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getPostNo() {
		return postNo;
	}

	public void setPostNo(int postNo) {
		this.postNo = postNo;
	}

	public String getPostTitle() {
		return postTitle;
	}

	public void setPostTitle(String postTitle) {
		this.postTitle = postTitle;
	}

	public String getPostContent() {
		return postContent;
	}

	public void setPostContent(String postContent) {
		this.postContent = postContent;
	}

	//method-generic

	@Override
	public String toString() {
		return "CategoryVo [cateNo=" + cateNo + ", id=" + id + ", cateName=" + cateName + ", description=" + description
				+ ", regDate=" + regDate + ", count=" + count + ", postNo=" + postNo + ", postTitle=" + postTitle
				+ ", postContent=" + postContent + "]";
	}
	 

}

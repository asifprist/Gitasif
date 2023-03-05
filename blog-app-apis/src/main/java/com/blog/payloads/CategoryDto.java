package com.blog.payloads;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class CategoryDto {
	
	private Integer categoryId;
	@NotBlank
	@Size(min=4,message="min size of category title is 4")
	private String categoryTitle;
	@NotBlank
	@Size(min=10,message="min size of category desc is 10")
	private String categortDescription;
	public CategoryDto(Integer categoryId, String categoryTitle, String categortDescription) {
		super();
		this.categoryId = categoryId;
		this.categoryTitle = categoryTitle;
		this.categortDescription = categortDescription;
	}
	public Integer getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategoryTitle() {
		return categoryTitle;
	}
	public void setCategoryTitle(String categoryTitle) {
		this.categoryTitle = categoryTitle;
	}
	public String getCategortDescription() {
		return categortDescription;
	}
	public void setCategortDescription(String categortDescription) {
		this.categortDescription = categortDescription;
	}
	@Override
	public String toString() {
		return "CategoryDto [categoryId=" + categoryId + ", categoryTitle=" + categoryTitle + ", categortDescription="
				+ categortDescription + "]";
	}
	public CategoryDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}

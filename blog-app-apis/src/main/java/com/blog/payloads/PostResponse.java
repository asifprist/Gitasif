package com.blog.payloads;

import java.util.List;

public class PostResponse {
	
	private List<PostDto> content;
	private int pageNumber;
	private int pageSize;
	private long pageElements;
	private int totalPages;
	private boolean lastPage;
	public PostResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "PostResponse [content=" + content + ", pageNumber=" + pageNumber + ", pageSize=" + pageSize
				+ ", pageElements=" + pageElements + ", totalPages=" + totalPages + ", lastPage=" + lastPage + "]";
	}
	public PostResponse(List<PostDto> content, int pageNumber, int pageSize, long pageElements, int totalPages,
			boolean lastPage) {
		super();
		this.content = content;
		this.pageNumber = pageNumber;
		this.pageSize = pageSize;
		this.pageElements = pageElements;
		this.totalPages = totalPages;
		this.lastPage = lastPage;
	}
	public List<PostDto> getContent() {
		return content;
	}
	public void setContent(List<PostDto> content) {
		this.content = content;
	}
	public int getPageNumber() {
		return pageNumber;
	}
	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public long getPageElements() {
		return pageElements;
	}
	public void setPageElements(long pageElements) {
		this.pageElements = pageElements;
	}
	public int getTotalPages() {
		return totalPages;
	}
	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}
	public boolean isLastPage() {
		return lastPage;
	}
	public void setLastPage(boolean lastPage) {
		this.lastPage = lastPage;
	}
	
	
	
	

}

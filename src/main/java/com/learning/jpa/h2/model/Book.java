package com.learning.jpa.h2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_BOOKS")
public class Book {

	@Id
	@Column(name = "id")
	private int id;

	@Column(name = "author_name")
	private String authorName;
	
	@Column(name = "book_title")
	private String bootTitle;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getBootTitle() {
		return bootTitle;
	}

	public void setBootTitle(String bootTitle) {
		this.bootTitle = bootTitle;
	}
	
}
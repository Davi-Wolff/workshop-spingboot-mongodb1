package com.daviwolff.workshopmongo.dto;

import java.io.Serializable;
import java.util.Date;

public class CommentDTO implements Serializable{

	
	private static final long serialVersionUID = 1L;
	
	private String text;
	private Date date;
	private AuthorDTO author;
	
	public CommentDTO() {}
	
	public CommentDTO(String id, Date date, AuthorDTO author) {
		super();
		this.setId(id);
		this.setDate(date);
		this.setAuthor(author);
	}


	public String getId() {
		return text;
	}

	public void setId(String text) {
		this.text = text;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public AuthorDTO getAuthor() {
		return author;
	}

	public void setAuthor(AuthorDTO author) {
		this.author = author;
	}
	
}

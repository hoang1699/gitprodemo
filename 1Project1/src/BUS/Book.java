package BUS;

import java.util.*;

public class Book {
	private Integer Id;
	private String title;
	private String author;
	private String code;
	
	public Book(Integer ID,String title1, String author1, String code1) {
		this.Id = ID;
		this.title = title1;
		this.author = author1;
		this.code = code1;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}	
	
}

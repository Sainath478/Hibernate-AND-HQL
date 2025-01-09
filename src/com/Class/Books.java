package com.Class;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Books {

	private String book_name;
	private String book_author;
	@Id
	private int book_price;

	public Books() {
	}

	@Override
	public String toString() {
		return "Books [book_name=" + book_name + ", book_author=" + book_author + ", book_price=" + book_price + "]";
	}

	public String getBook_name() {
		return book_name;
	}

	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}

	public String getBook_author() {
		return book_author;
	}

	public void setBook_author(String book_author) {
		this.book_author = book_author;
	}

	public int getBook_price() {
		return book_price;
	}

	public void setBook_price(int book_price) {
		this.book_price = book_price;
	}

	public Books(String book_name, String book_author, int book_price) {
		super();
		this.book_name = book_name;
		this.book_author = book_author;
		this.book_price = book_price;
	}

}

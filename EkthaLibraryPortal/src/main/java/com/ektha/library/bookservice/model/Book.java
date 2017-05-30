package com.ektha.library.bookservice.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Book")
@Entity
public class Book implements Serializable {

	public static final long serialVersionUID = 837;
	
	@Id
	/*@GeneratedValue(strategy = GenerationType.AUTO)*/
	private int id;
	private String name;
	private String author;
	private String category;
	private String yearOfPublish;
	private String isbn;
	private double price;
	
	public Book(){
		
	}

	public Book(int id, String name, String author, String category, String yearOfPublish, String isbn, double price) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.category = category;
		this.yearOfPublish = yearOfPublish;
		this.isbn = isbn;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getYearOfPublish() {
		return yearOfPublish;
	}

	public void setYearOfPublish(String yearOfPublish) {
		this.yearOfPublish = yearOfPublish;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", author=" + author + ", category=" + category
				+ ", yearOfPublish=" + yearOfPublish + ", isbn=" + isbn + ", price=" + price + "]";
	}
	
	
	
	
}

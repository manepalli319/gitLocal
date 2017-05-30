package com.ektha.library.bookservice.dao;


import java.util.List;
import com.ektha.library.bookservice.model.Book;

public interface BookDAO {

	
	public String addBook(Book book);
	

	public List<Book> getBookByAuthor(String author);
	

	public List<Book> getBookByCategory(String category);
	
	
}

package com.ektha.library.bookservice.service;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import com.ektha.library.bookservice.dao.BookDAO;
import com.ektha.library.bookservice.dao.BookDAOImpl;
import com.ektha.library.bookservice.model.Book;


@WebService(serviceName = "BookService", endpointInterface = "com.ektha.library.bookservice.service.BookService")
public class BookServiceImpl implements BookService {

	BookDAO bookDao = new BookDAOImpl();
	
	@WebMethod
	public String addBook(@WebParam(name = "book") Book book) {
		
		return bookDao.addBook(book);
	}

	@WebMethod
	public List<Book> getBookByAuthor(String author) {
		
		
		
		return bookDao.getBookByAuthor(author);
	}

	@WebMethod
	public List<Book> getBookByCategory(String category) {
		
		return null;
	}
	

}

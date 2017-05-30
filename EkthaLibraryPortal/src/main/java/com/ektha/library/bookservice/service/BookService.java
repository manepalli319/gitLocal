package com.ektha.library.bookservice.service;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

import com.ektha.library.bookservice.model.Book;

@WebService(name = "BookService")
@SOAPBinding(style = Style.DOCUMENT, use = Use.LITERAL)
public interface BookService {
    
	@WebMethod
	public String addBook(@WebParam(name = "Book")Book book);
	
	@WebMethod
	public List<Book> getBookByAuthor(String author);
	
	@WebMethod
	public List<Book> getBookByCategory(String category);
	
}

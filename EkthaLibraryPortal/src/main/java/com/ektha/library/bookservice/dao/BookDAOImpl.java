package com.ektha.library.bookservice.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.ektha.library.bookservice.model.Book;
import com.ektha.library.bookservice.util.HibernateUtil;


public class BookDAOImpl implements BookDAO {

	private SessionFactory sessionFactory;

	public String addBook(Book book) {

		sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.getCurrentSession();

		Transaction tx = session.beginTransaction();

		
		session.persist(book);
		tx.commit();
		

		return "Book added successfully";
	}

	public List<Book> getBookByAuthor(String author) {

		sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.getCurrentSession();

		Transaction tx = session.beginTransaction();
		
		Query query = session.createQuery("from Book where name =:name");
		query.setParameter("name", author);
		
		ArrayList<Book> books = (ArrayList<Book>) query.list();
		
		tx.commit();
		
		return books;
	}

	public List<Book> getBookByCategory(String category) {

		return null;
	}

}

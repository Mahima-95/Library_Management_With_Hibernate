package com.hibernate.library.dao.impl;

import java.util.List;

import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.validator.constraints.Email;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;

import com.hibernate.library.dao.LibraryDao;
import com.hibernate.library.entity.Library;

@Repository
public class LibraryDaoImpl implements LibraryDao {

	private Transaction transaction;
	private Session session;

	@Autowired
	private SessionFactory sessionFactory;

	public LibraryDaoImpl() {
		super();
	}

	@Override
	public String addBook(Library library) {
		if (StringUtils.isEmpty(session) || !session.isOpen()) {
			session = getSession();
		}
		System.out.println(transaction);
		session.save(library);
		transaction.commit();
		session.close();
		return "Successfully added..!!!";
	}

	@Override
	public String updateBook(Library library) {
		String response = null;
		if (StringUtils.isEmpty(session) || !session.isOpen()) {
			session = getSession();
		}
		if (library.getBookId() > 0) {
			Library lib = session.get(Library.class, library.getBookId());
			if (!StringUtils.isEmpty(lib)) {
				if (!StringUtils.isEmpty(library.getBookId())) {
					lib.setBookId(library.getBookId());
				}
				if (!StringUtils.isEmpty(library.getBookName())) {
					lib.setBookName(library.getBookName());
				}
				if (!StringUtils.isEmpty(library.getBookAuthor())) {
					lib.setBookAuthor(library.getBookAuthor());
				}
				try {
					session.update(lib);
					transaction.commit();
					response = "Successfully Updated...!!!";
				} catch (Exception e) {
					response = "Exception generated...";
					e.printStackTrace();
				} finally {
					session.close();
				}
			}
		} else {
			response = "please try again later";
		}

		return response;
	}

	@Override
	public String deleteBook(int bId) {
		if (StringUtils.isEmpty(session) || !session.isOpen()) {
			session = getSession();
		}
		Library library = session.get(Library.class, bId);
//		Library library = (Library) session.get(Library.class, bookId);
		System.out.println(library);
		session.delete(library);
		transaction.commit();
		session.close();
		return "Deleted..!!!";
	}

	@Override
	public List<Library> getBook() {
		if (StringUtils.isEmpty(session) || !session.isOpen()) {
			session = getSession();
		}
		 Criteria c = session.createCriteria(Library.class);  
//		 c.setFirstResult(4);  // it hides first 4 columns data using this query 
//		 c.setMaxResults(6);
		 c.add(Restrictions.gt("bookName","hh"));//bookName is the propertyname  //it gives grater than data from this word "hh"
		// c.addOrder(Order.asc("bookName"));  // it prints data in ascending order for bookName column only 
		 List list=c.list();
		return list;
		 //return session.createCriteria(Library.class).list();
//		return (List<Library>) session.createCriteria(Library.class).list();
	}

	private Session getSession() {
		Session session = sessionFactory.getCurrentSession();
		transaction = session.beginTransaction();
		return session;

	}

}

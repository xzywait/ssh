package dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import vo.Book;
import dao.BookDao;

public class BookDaoImpl implements BookDao {

	// HibernateSessionFactory hibernateSessionFactory;

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {

		this.sessionFactory = sessionFactory;
	}

	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	public void add(Book book) {

		getSession().save(book);

	}

	public void deleteById(int id) {

		Book book = (Book) getSession().get(Book.class, id);
		getSession().delete(book);

	}

	public Book findByName(String name) {
		Book book = null;
		String hql = "from Book b where b.name =:name";
		Query query = getSession().createQuery(hql);
		query.setString("name", name);
		book = (Book) query.list().get(0);

		return book;
	}

	
	public List<Book> getAll() {
		List<Book> books;
		// Session session = hibernateSessionFactory.getSession();

		String hql = "from Book b";
		Query query = getSession().createQuery(hql);
		books =query.list();

		return books;
	}

	public void update(Book book) {
		Session session = getSession();

		session.update(book);

	}
}

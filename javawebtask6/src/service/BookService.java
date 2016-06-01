package service;

import java.util.List;

import vo.Book;
import dao.BookDao;

public class BookService {
	private BookDao bookDao;

	public void setBookDao(BookDao bookDao) {
		this.bookDao = bookDao;
	}
	
	
	public void add(Book book){
		bookDao.add(book);
	}
	
	public Book findByName(String name){
		return bookDao.findByName(name);
	}
	
	public void update(Book book){
		bookDao.update(book);
	}
	
	public List<Book> getAll(){
		return bookDao.getAll();
	}
	
	public void deleteById(int id){
		bookDao.deleteById(id);
	}
}

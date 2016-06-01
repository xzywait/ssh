package action;

import java.util.List;

import service.BookService;
import vo.Book;

public class BookListAction {
	
	private List<Book> books; 
	
	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}
	private BookService bookService;
	
	public void setBookService(BookService bookService) {
		this.bookService = bookService;
	}
	public String list(){
		
		 books=bookService.getAll();
		return "list-success";
	}
}

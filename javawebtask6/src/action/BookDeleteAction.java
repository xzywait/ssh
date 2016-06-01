package action;

import service.BookService;

public class BookDeleteAction {
	private String bid;

	public String getBid() {
		return bid;
	}

	public void setBid(String bid) {
		this.bid = bid;
	}
	private BookService bookService;

	public void setBookService(BookService bookService) {
		this.bookService = bookService;
	}
	public String delete() {
		
		System.out.println(bid);
		int id=Integer.parseInt(bid);
		bookService.deleteById(id);
		return "delete-success";
	}
}

package test;



import java.util.List;

import org.apache.commons.dbcp.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.BookService;
import vo.Book;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
//		BasicDataSource basicDataSource = (BasicDataSource) ctx.getBean("dataSource");
//		SessionFactory sessionFactory =  (SessionFactory) ctx.getBean("sessionFactory");
		BookService bookService =  (BookService) ctx.getBean("bookService");
			
			List<Book> books = bookService.getAll();
			System.out.println(books);
	}

}

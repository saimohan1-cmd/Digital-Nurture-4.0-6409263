package com.library;
import com.library.service.BookService;
import com.library.repository.BookRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class LibraryManagement {

	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		BookService bookService = (BookService) appContext.getBean("bookService");
        BookRepository bookRepository = (BookRepository) appContext.getBean("bookRepository");
        bookService.addBook();
        bookRepository.save();
	}

}

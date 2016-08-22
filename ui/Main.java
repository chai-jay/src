package ui;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

import models.Book;
import models.BookCatalog;

public class Main {

	public static void main(String[] args) {
		Date today = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MMM-dd");
		GregorianCalendar gcal = new GregorianCalendar(2007, 0, 1);
		gcal.add(GregorianCalendar.DAY_OF_MONTH, 67);
		today = gcal.getTime();
		
		System.out.println(sdf.format(today));
		
//		Book book1 = new Book(1, "Introduction to Java", "Matt Greencroft", "12345");
//		Book book2 = new Book(2, "Better Java", "Joe Le Blanc", "23456");
//		
//		BookCatalog bookCatalog = new BookCatalog();
//		
//		bookCatalog.addBook(book1);
//		bookCatalog.addBook(book2);
//		
//		
//		UI ui = new UI();
//		
//		ui.printHeader();
//		ui.printBookCatalog(bookCatalog.getBookArray());
//		
//		Book foundBook = bookCatalog.findBook("better Java");
//		if (foundBook != null) {
//			ui.printBook(foundBook);
//		}
		
	}

}

package ui;
import java.math.BigDecimal;
import java.text.NumberFormat;

import models.Book;
import models.BookCatalog;
import models.Customer;
import models.DVD;
import utilities.GenderType;

public class Main {

	public static void main(String[] args) {
		
		double d = 1;
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(5);
		nf.setMaximumFractionDigits(5);
		
		System.out.println(nf.format(d));
		
		for (int i = 0; i < 10; i++) {
			d+= 0.1;
			System.out.println(d);
		}
		
		BigDecimal price = new BigDecimal("0.1"); // Can use double inside constructor but it loses precision.
		BigDecimal addValue = new BigDecimal("0.1");
		for (int i = 0; i < 10; i++) {
			price = price.add(addValue);
			System.out.println(price);
		}
		
		
		
		Book book1 = new Book(1, "Introduction to Java", "Matt Greencroft", "12345", "Anytown branch", 400);
		Book book2 = new Book(2, "Better Java", "Joe Le Blanc", "23456", "Anytown branch", 150);
		DVD dvd1 = new DVD(3, "An Epic Film About Java", "Anytown Branch", "Steven Spielberg", "99887", 120);
		
		System.out.println(dvd1.getTitle());
		book1.relocate("myCity branch");
		
		BookCatalog bookCatalog = new BookCatalog();
		
		bookCatalog.addBook(book1);
		bookCatalog.addBook(book2);
		
		
		UI ui = new UI();
		
		ui.printHeader();
		ui.printBookCatalog(bookCatalog.getBookArray());
		
		Book foundBook = bookCatalog.findBook("better Java");
		if (foundBook != null) {
			ui.printBook(foundBook);
		}
		
		Customer customer = new Customer("Mr", "Michael", "Smith", "1 High Street", "1234", "a@b.com", 1, GenderType.MALE);
		System.out.println(customer.getExpiryDate());
		System.out.println(customer.getMailingName());
		
		System.out.println(dvd1.lend(customer));

	}

}

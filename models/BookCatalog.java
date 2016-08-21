package models;
public class BookCatalog {
	private Book[] bookArray = new Book[100];
	private int nextPosition = 0;
	
	public Book[] getBookArray() {
		return bookArray;
	}
	
	public void addBook(Book book) {
		bookArray[nextPosition] = book;
		nextPosition++;
	}
	
	public Book findBook(String title) {
		for (int i = 0; i < nextPosition; i++) {
			Book currBook = bookArray[i];
			if (currBook.getTitle().equalsIgnoreCase(title)) {
				return currBook;
			}
		}
		return null;
	}
}

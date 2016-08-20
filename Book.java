
public class Book {
	private int bookID;
	private String title;
	private String author;
	private String isbn;
	
	public Book(int bookID, String title, String author, String isbn) {
		this.bookID = bookID;
		this.title = title;
		this.author = author;
		this.isbn = isbn;
	}
	
	public int getBookID() {
		return this.bookID;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public String getAuthor() {
		return this.author;
	}
	
	public String getIsbn() {
		return this.isbn;
	}
}

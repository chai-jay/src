package models;

public class Book extends Material {
	private String author;
	private String isbn;
	private int noOfPages;
	
	public Book(int id, String title, String author, String isbn, String branch, int noOfPages) {
		super(id, title, branch);
		this.author = author;
		this.isbn = isbn;
		this.noOfPages = noOfPages;
	}
	
	public String getAuthor() {
		return this.author;
	}
	
	public String getIsbn() {
		return this.isbn;
	}
	
	public void sendForRepair() {
		System.out.println("Book has been sent for repair.");
	}
}

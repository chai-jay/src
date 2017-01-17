package models;

import java.util.Calendar;
import java.util.Date;

import utilities.LoanStatus;

public class Loan {
	private int id;
	private Customer customer;
	private Book book;
	private Date startDate;
	private Date dueDate;
	private Date returnDate;
	private LoanStatus status;
	
	public Loan(int id, Customer customer, Book book) {
		this.id = id;
		this.customer = customer;
		this.book = book;
		this.startDate = new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(this.startDate);
		calendar.add(Calendar.DAY_OF_YEAR, 14);
		this.dueDate = calendar.getTime();
		this.status = LoanStatus.CURRENT;
		this.returnDate = null;
	}
	
	public int getId() {
		return this.id;
	}
	
	@Override
	public String toString() {
		return "Loan: ID = " + this.id + ", book = " + this.book.getTitle() + ", customer = " + this.customer.getMailingName();
	}
	
	@Override
	public boolean equals(Object object) {
		Loan otherLoan = (Loan) object;
		return this.id == otherLoan.getId();
	}
	
	public Customer getCustomer() {
		return this.customer;
	}
	
	public Book getBook() {
		return this.book;
	}
	
	public Date getDueDate() {
		return this.dueDate;
	}
	
	public void endLoan() {
		this.returnDate = new Date();
		this.status = LoanStatus.HISTORIC;
	}
	
	public LoanStatus getStatus() {
		return this.status;
	}
}

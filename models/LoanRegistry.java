package models;

import utilities.LoanStatus;

public class LoanRegistry {
	private Loan[] registry;
	int pointer;
	
	public LoanRegistry() {
		this.registry = new Loan[10];
		this.pointer = 0;
	}
	
	public void addLoan(Loan loan) throws LoanAlreadyAddedException{
		for (int i = 0; i < this.pointer; i++) {
			if (registry[i].equals(loan)) {
				throw new LoanAlreadyAddedException();
			}
		}
		
		this.registry[this.pointer] = loan;
		this.pointer++;
	}
	
	public Loan findLoan(int bookId) throws LoanNotFoundException {
		for (int i = 0; i < this.pointer; i++) {
			Loan loan = registry[i];
			Book book = loan.getBook();
			if (loan.getStatus() == LoanStatus.CURRENT && book.getId() == bookId) {
				return loan;
			}
		}
		
		// If it gets here, no match found
		throw new LoanNotFoundException();
	}
	
	public boolean isBookOnLoan(Book book) {
//		for (int i = 0; i < this.pointer; i++) {
//			Loan loan = registry[i];
//			if (loan.getStatus() == LoanStatus.CURRENT && loan.getBook().equals(book)) {
//				return true;
//			}
//		}
//		
//		// If it gets here, book is not on loan
//		return false;
		
		try {
			findLoan(book.getId());
			return true;
		} catch (LoanNotFoundException e) {
			return false;
		}
	}
}

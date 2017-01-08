package models;

public abstract class Material {
	private int id;
	private String title;
	private String branch;
	private Customer borrower;
	
	public Material(int id, String title, String branch) {
		this.id = id;
		this.title = title;
		this.branch = branch;
	}

	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}
	
	public void relocate(String newBranchName) {
		this.branch = newBranchName;
	}
	
	public boolean lend(Customer customer) {
		if (borrower == null) {
			borrower = customer;
			return true;
		} else {
			return false;
		}
	}
	
	// must be overridden
	public abstract int getLoanPeriod();
}

package models;

public class DVD extends Material {
	private String director;
	private String catalogNo;
	private int runningTime;
	private boolean licensed;
	
	public DVD(int id, String title, String branch, String director, String catalogNo, int runningTime) {
		super(id, title, branch);
		this.director = director;
		this.catalogNo = catalogNo;
		this.runningTime = runningTime;
		this.licensed = false;
	}
	
	public boolean isLicensed() {
		return this.licensed;
	}
}

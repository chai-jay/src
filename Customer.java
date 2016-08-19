
public class Customer {
	private String title;
	private String firstName;
	private String surname;
	private String address;
	private String phoneNumber;
	private String email;
	private int customerNumber;
	private GenderType gender;
	private boolean isvalid;
	
	public Customer(String title, String firstName, String surname, String address, String phoneNumber, String email, int customerNumber, GenderType gender) {
		this.setName(title, firstName, surname);
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.customerNumber = customerNumber;
		this.gender = gender;
		this.isvalid = true;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public String getSurname() {
		return surname;
	}
	
	public String getMailingName() {
		String mailingName;
		mailingName = this.title + " " + this.firstName.substring(0, 1) + " " + this.surname;
		return mailingName;
	}
	
	public void setName(String title, String firstName, String surname) {
		this.title = title; // need to use `this.` to reference the private member `title` 
		this.firstName = firstName; 
		this.surname = surname;
	}
	
	public GenderType getGender() {
		return this.gender;
	}
}

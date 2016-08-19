
public class Main {

	public static void main(String[] args) {
		Customer simon = new Customer("Mr", "Simon", "Pieman", "1, the High Street", "0000000000", "simon@pieman.com", 1, GenderType.MALE);
		
		String simonMailingName = simon.getMailingName();
		System.out.println(simonMailingName);
		System.out.println(simon.getGender());
		
		if (simon.getGender() == GenderType.MALE) {
			System.out.println("He is male.");
		} else if (simon.getGender() == GenderType.FEMALE) {
			System.out.println("She is female.");
		} else {
			System.out.println("Gender is unknown.");
		}
	}

}

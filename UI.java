
public class UI {
	public void printHeader() {
		System.out.println("BookID  Title                 Author");
	}
	
	public void printBook(Book book) {
		System.out.println(fixLengthString(book.getBookID(), 6) + "  " + fixLengthString(book.getTitle(), 20) + "  " + fixLengthString(book.getAuthor(), 20));
	}
	
	private String fixLengthString(String start, int length) {
		// TODO: Fix string padding problem
		if (start.length() > length) {
			return start.substring(0, length);
		} else {
			while (start.length() < length) {
				start += " ";
			}
			return start; 
		}
	}
	
	private String fixLengthString(int start, int length) {
		String startString = String.valueOf(start);
		return fixLengthString(startString, length);
	}
}

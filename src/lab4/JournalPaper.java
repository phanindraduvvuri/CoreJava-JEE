package lab4;

public class JournalPaper extends WrittenItem {

	private String publishedYear;

	public JournalPaper() {
		super();
	}

	public JournalPaper(int idNo, String title, int noOfCopies, String authorName, String publishedYear) {
		super(idNo, title, noOfCopies, authorName);
		this.publishedYear = publishedYear;
	}

	public String getPublishedYear() {
		return publishedYear;
	}

	public void setPublishedYear(String publishedYear) {
		this.publishedYear = publishedYear;
	}

}

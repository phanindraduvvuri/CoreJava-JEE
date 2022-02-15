package lab4;

public abstract class WrittenItem extends Item {
	private String authorName;

	public WrittenItem() {
		super();

	}

	public WrittenItem(int idNo, String title, int noOfCopies, String authorName) {
		super(idNo, title, noOfCopies);
		this.authorName = authorName;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

}

package lab4;

import java.util.ArrayList;
import java.util.Objects;

public abstract class Item {
	private int idNo;
	private String title;
	private int noOfCopies;
	private static ArrayList<String> checkedOutBy;

	// Constructors
	public Item() {
		super();
	}

	public Item(int idNo, String title, int noOfCopies) {
		super();
		this.idNo = idNo;
		this.title = title;
		this.noOfCopies = noOfCopies;
		checkedOutBy = new ArrayList<String>();
	}

	// Getters and Setters
	public int getIdNo() {
		return idNo;
	}

	public void setIdNo(int idNo) {
		this.idNo = idNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getNoOfCopies() {
		return noOfCopies;
	}

	public void setNoOfCopies(int noOfCopies) {
		this.noOfCopies = noOfCopies;
	}

	// Overriding Object class's methods
	@Override
	public String toString() {
		return "Item [idNo=" + idNo + ", title=" + title + ", noOfCopies=" + noOfCopies + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(idNo, noOfCopies, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		return idNo == other.idNo && noOfCopies == other.noOfCopies && Objects.equals(title, other.title);
	}

	public void checkIn(Item item, String name) {
		checkedOutBy.remove(name);
	}

	public void checkOut(Item item, String name) {
		if (!checkedOutBy.contains(name)) {
			checkedOutBy.add(name);
		} else {
			System.out.println("You already checked out this book");
		}
	}

}

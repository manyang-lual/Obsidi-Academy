package jUnitExercise;

public class Textbook extends Book{
	private int editionNumber;
	
	public Textbook(String title, double price,int edition) {
		super(title,price);
		this.editionNumber = edition;
	}
	@Override
	public String getBookInfo() {
		return super.getBookInfo()+ "-" + editionNumber;
	}
	public int getEdition() {
		return editionNumber;
	}
	public boolean canSubstituteFor(Textbook other) {
		return this.editionNumber >= other.getEdition() && this.getTitle().equals(other.getTitle());
	}
}

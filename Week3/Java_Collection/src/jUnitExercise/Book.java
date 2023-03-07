package jUnitExercise;

public class Book {
	
	private String bookTitle;
	private double bookPrice;
	
	//constructor
	public Book(String title, double price) {
		bookTitle = title;
		bookPrice = price;
	}
	public String getTitle() {
		return bookTitle;
	}
	public String getBookInfo() {
		return bookTitle + "-" + bookPrice;
	}
}

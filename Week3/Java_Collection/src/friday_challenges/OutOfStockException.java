package friday_challenges;

public class OutOfStockException extends Exception {
    // Custom exception class for when a product is out of stock
    // Call the superclass constructor to pass the error message to the parent class
	public OutOfStockException(String message) {
		super(message);
	}
	
}
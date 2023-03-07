package generics;

public class Printer <T> {
	private T value;
	
	public Printer(T value) {
		this.value = value;
	}
	public void printValue() {
		 System.out.println("You enetered "+this.value);
	}
}

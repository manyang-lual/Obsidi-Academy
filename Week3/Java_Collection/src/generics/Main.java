package generics;

public class Main {
	
	public static void main(String[] args) {
		Printer<Integer>IntegerPrinter = new Printer<>(23);
		IntegerPrinter.printValue();
		
		Printer <Double> DoublePrinter = new Printer<>(23.4546);
		DoublePrinter.printValue();
		
		Printer <String> StringPrinter = new Printer<>("Lual");
		StringPrinter.printValue();
		
		//calling generic method
		shout("Manyang");
		shout(1234);
	}
	//we can also have geberic methods
	public static <T> void shout(T thingToShout) {
		System.out.println(thingToShout+"!!!!");
	}

}

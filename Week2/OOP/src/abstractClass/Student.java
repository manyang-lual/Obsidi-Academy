package abstractClass;

import java.util.Scanner;

public class Student {
	private String name;
	private int ID;
	private Scanner scanner = new Scanner(System.in);
	public Student() {
		System.out.println("Enter the Student name");
		this.name=scanner.nextLine();
		
		System.out.println("Enter the Student ID");
		this.ID = Integer.parseInt(scanner.nextLine());
	}
	public String getName() {
		return this.name;
	}
	public static void main(String[] args) {
		Student student1 = new Student();
		System.out.println("The name of student is "+student1.getName());
	}
}

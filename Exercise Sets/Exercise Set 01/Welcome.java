import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		
		System.out.println("Welcome to CS 211: Object-oriented Programming");
		
		System.out.print("Enter your name:");
		String name = myObj.nextLine();
	
		System.out.println("This course will be fun," + name + "!");
		
	}
}
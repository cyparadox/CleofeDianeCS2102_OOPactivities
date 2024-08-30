import java.util.Scanner;
public class Tempconvert {
	public static void main(String[] args) {
		
		Scanner myObj = new Scanner(System.in);
		System.out.print("Enter a Celsius value:");
		double cel = myObj.nextDouble();
		double fahren = (cel * 9/5) + 32;
		
		System.out.println(cel + " Celsius is " + fahren + " Fahrenheit");
	}
}
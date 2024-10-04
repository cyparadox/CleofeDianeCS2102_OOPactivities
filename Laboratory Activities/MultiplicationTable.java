import java.util.Scanner;

public class MultiplicationTable {
  public static void main(String[] args) {
    try (Scanner multi = new Scanner(System.in)) {
        System.out.print("Enter the size of the multiplication table: ");
        int maxSize = multi.nextInt();

        System.out.println("Multiplication Table:");

        for (int i = 1; i <= maxSize; i++) {
          for (int j = 1; j <= maxSize; j++) {
            System.out.printf("%4d", i * j);
          }
          System.out.println(); 
        }
    }
  }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
      if (n > 0) {
            System.out.println("The number is Positive");
        } else if (n < 0) {
            System.out.println("The number is Negative");
        } 
          System.out.println("Numbers from 1 to " + n + ":");
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }
}

import java.util.Scanner;

class Calculator {
    int a, b;
    Calculator(int x, int y) {
        a = x;
        b = y;
    }

    void add() {
        System.out.println("Sum = " + (a + b));
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int x = sc.nextInt();

        System.out.print("Enter second number: ");
        int y = sc.nextInt();

        Calculator obj = new Calculator(x, y); 
        obj.add();
    }
}

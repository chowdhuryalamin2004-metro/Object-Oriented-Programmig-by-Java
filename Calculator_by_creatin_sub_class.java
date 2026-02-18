import java.util.Scanner;

class Calculator {

    void calculate(int a, int b) {
        System.out.println("Add = " + (a + b));
        System.out.println("Subtract = " + (a - b));
        System.out.println("Mult = " + (a * b));
        System.out.println("Div = " + (a / b));
    }
}

public class MainClass {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int x = sc.nextInt();

        System.out.print("Enter second number: ");
        int y = sc.nextInt();

        Calculator obj = new Calculator();
        obj.calculate(x, y);
    }
}

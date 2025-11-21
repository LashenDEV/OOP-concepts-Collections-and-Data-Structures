import java.util.Scanner;

public class DivideException {
    public void doDivide(int first, int second) {
        try {
            float result = first / second;
            System.out.println("Divide result of first: " + first + " / " + second);
        } catch (ArithmeticException e) {
            System.out.println("Exception occurred" + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the first number(numerator): ");
        int numerator = scanner.nextInt();
        System.out.println("Please enter the second number(denominator: ");
        int denominator = scanner.nextInt();

        DivideException d = new DivideException();
        d.doDivide(numerator, denominator);

    }
}

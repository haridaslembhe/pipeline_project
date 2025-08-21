import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        // Read input from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        double num1 = sc.nextDouble();
        System.out.println("Enter the second number:");
        double num2 = sc.nextDouble();

        System.out.println("Enter an operator (+, -, *, /):");
        char op = sc.next().charAt(0);

        double result = 0;

        // Perform the calculation based on the operator
        switch (op) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Error! Division by zero is not allowed.");
                    sc.close();
                    return;
                }
                result = num1 / num2;
                break;
            default:
                System.out.println("Error! Invalid operator.");
                sc.close();
                return;
        }

        // Display the result
        System.out.printf("Result: %.2f %c %.2f = %.2f\n", num1, op, num2, result);
        sc.close();
    }
}

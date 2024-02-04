import java.util.Scanner;



public class MainClass {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
        double num1, num2, result;
        char operator;

        System.out.print("Miss Poojitha enter your first numbers: ");
        num1 = input.nextDouble();

        System.out.print("Enter an operators (+, -, *, /): ");
        operator = input.next().charAt(0);

        System.out.print("Miss Poojitha enter your second numbers: ");
        num2 = input.nextDouble();

        if (operator == '+') {
            result = num1 + num2;
        } else if (operator == '-') {
            result = num1 - num2;
        } else if (operator == '*') {
            result = num1 * num2;
        } else if (operator == '/') {
            if (num2 != 0) {
                result = num1 / num2;
            } else {
                System.out.println("Error: Division by zero is not allowed to.");
                return;
            }
        } else {
            System.out.println("Error: Invalid operator.");
            return;
        }

        System.out.println("Result: " + result);
		
	}

}

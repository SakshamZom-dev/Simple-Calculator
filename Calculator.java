public class Calculator {

    public static void main(String[] args) {
        System.out.println("Hello, Zom! Welcome to your Simple Calculator.");
        System.out.println("This program will perform basic operations on two numbers.");

        int number1 = 20;
        int number2 = 5;

        System.out.println("\nNumbers to operate on: " + number1 + " and " + number2);

        int sum = add(number1, number2);
        System.out.println("Addition (" + number1 + " + " + number2 + "): " + sum);

        int difference = subtract(number1, number2);
        System.out.println("Subtraction (" + number1 + " - " + number2 + "): " + difference);

        int product = multiply(number1, number2);
        System.out.println("Multiplication (" + number1 + " * " + number2 + "): " + product);

        if (number2 != 0) {
            double quotient = divide(number1, number2);
            System.out.println("Division (" + number1 + " / " + number2 + "): " + quotient);
        } else {
            System.out.println("Division by zero is not allowed.");
        }

        System.out.println("\nCalculator operations complete.");
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }


    public static int multiply(int a, int b) {
        return a * b;
    }


    public static double divide(int a, int b) {
        return (double) a / b;
    }
}

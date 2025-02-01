import java.util.Scanner;

public class UserInput {
    private Scanner scanner;

    public UserInput(Scanner scanner) {
        this.scanner = scanner;
    }

    public void handleChoice(int choice, Calculator calculator) {
        if (choice >= 1 && choice <= 4) {
            handleBasicOperations(choice, calculator);
        } else if (choice == 5) {
            handleFibonacci(calculator);
        } else if (choice >= 6 && choice <= 9) {
            handleArrayOperations(choice, calculator);
        } else {
            System.out.println("Invalid choice!");
        }
    }

    private void handleBasicOperations(int choice, Calculator calculator) {
        System.out.println("Enter two numbers: ");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        performBasicOperation(choice, num1, num2, calculator);
    }

    private void performBasicOperation(int choice, double a, double b, Calculator calculator) {
        switch (choice) {
            case 1: System.out.println("Result: " + calculator.add(a, b)); break;
            case 2: System.out.println("Result: " + calculator.subtract(a, b)); break;
            case 3: System.out.println("Result: " + calculator.multiply(a, b)); break;
            case 4: System.out.println("Result: " + calculator.divide(a, b)); break;
        }
    }

    private void handleFibonacci(Calculator calculator) {
        System.out.println("Enter Fibonacci index: ");
        int n = scanner.nextInt();
        System.out.println("Fibonacci(" + n + ") = " + calculator.fibonacci(n));
    }

    private void handleArrayOperations(int choice, Calculator calculator) {
        System.out.println("Enter array size: ");
        int size = scanner.nextInt();
        double[] array = new double[size];
        System.out.println("Enter elements: ");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextDouble();
        }
        performArrayOperation(choice, array, calculator);
    }

    private void performArrayOperation(int choice, double[] array, Calculator calculator) {
        switch (choice) {
            case 6: System.out.println("Sum: " + calculator.sumArray(array)); break;
            case 7: System.out.println("Mean: " + calculator.mean(array)); break;
            case 8: System.out.println("Variance: " + calculator.variance(array)); break;
            case 9: System.out.println("Standard Deviation: " + calculator.standardDeviation(array)); break;
        }
    }
}

//Userinput
import java.util.Scanner;

public class UserInput {
    private Scanner scanner;

    public UserInput(Scanner scanner) {
        this.scanner = scanner;
    }
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


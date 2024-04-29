import java.util.Scanner;

public class ATMApp {
    // Initialize balance to $100.
    private static int balance = 100;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Welcome to Romeo's ATM.");
            System.out.println("1. Check your Balance");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Deposit Money");
            System.out.println("4. Exit");

            System.out.print("Please choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    checkBalance(scanner);
                    break;
                case 2:
                    withdrawMoney(scanner);
                    break;
                case 3:
                    depositMoney(scanner);
                    break;
                case 4:
                    System.out.println("Thank you for using Romeo's ATM.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    // Method to check balance
    private static void checkBalance(Scanner scanner) {
        System.out.println("Your balance is $" + balance);
    }

    // Method to withdraw money
    private static void withdrawMoney(Scanner scanner) {
        System.out.print("Enter the amount you would like to withdraw: ");
        if(scanner.hasNextInt()) {
            int amount = scanner.nextInt();

            if (amount > balance) {
                System.out.println("Insufficient funds.");
            } else {
                balance -= amount;
                System.out.println("Withdrawal successful. Your new balance is $" + balance);
            }
        } else {
            System.out.println("Invalid input. Please enter a number.");
            scanner.next(); // clear the input buffer
        }
    }

    // Method to deposit money
    private static void depositMoney(Scanner scanner) {
        System.out.print("Enter the amount you would like to deposit: ");
        if(scanner.hasNextInt()) {
            int amount = scanner.nextInt();

            balance += amount;
            System.out.println("Deposit successful. Your new balance is $" + balance);
        } else {
            System.out.println("Invalid input. Please enter a number.");
            scanner.next(); // clear the input buffer
        }
    }
}

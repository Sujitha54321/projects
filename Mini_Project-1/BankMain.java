package miniproject1;

import java.util.Scanner;

public class BankMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankApp bankApp = new BankApp();
        BankOptions bankOptions = new BankOptions(bankApp, sc);

        System.out.println("==================================================================================================");
        System.out.println("Welcome to the Simple Banking Application");
        System.out.println("==================================================================================================");
        String choice;

        do {
            System.out.println("1. View Account");
            System.out.println("2. Create Account");
            System.out.println("3. Check Balance");
            System.out.println("4. Deposit");
            System.out.println("5. Withdraw");
            System.out.println("6. Update Account");
            System.out.println("7. Delete Account");
            System.out.println("8. Exit");

            System.out.print("Enter your choice: ");
            int option = sc.nextInt();

            switch (option) {
                case 1:
                    bankOptions.viewAllBankInfo();
                    break;
                case 2:
                    bankOptions.createAccount();
                    break;
                case 3:
                    bankOptions.checkBalance();
                    break;
                case 4:
                    bankOptions.deposit();
                    break;
                case 5:
                    bankOptions.withdraw();
                    break;
                case 6:
                    bankOptions.updateAccount();
                    break;
                case 7:
                    bankOptions.deleteAccount();
                    break;
                case 8:
                    System.out.println("Exiting the Banking Application.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    break;
            }

            System.out.print("Do you want to continue (Y/N)? ");
            choice = sc.next();
        } while (choice.equalsIgnoreCase("Y"));

        sc.close();
    }
}

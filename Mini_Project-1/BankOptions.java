package miniproject1;

import java.util.Scanner;

public class BankOptions {
    private BankApp bankApp;
    private Scanner scanner;

    public BankOptions(BankApp bankApp, Scanner scanner) {
        this.bankApp = bankApp;
        this.scanner = scanner;
    }

    public void viewAllBankInfo() {
        bankApp.viewAllBankInfo();
    }

    public void createAccount() {
        System.out.print("Enter Account Number: ");
        int accountNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Account Holder Name: ");
        String accountHolder = scanner.nextLine();
        System.out.print("Enter Address: ");
        String address = scanner.nextLine();
        System.out.print("Enter Phone Number: ");
        long phoneNumber = scanner.nextLong();
        int result = bankApp.createAccount(accountNumber, accountHolder, address, phoneNumber);
        if (result == 1) {
            System.out.println("Account created successfully.");
        } else {
            System.out.println("Failed to create an account.");
        }
    }

    public void checkBalance() {
        System.out.print("Enter Account Number: ");
        int accountNumber = scanner.nextInt();
        double balance = bankApp.checkBalance(accountNumber);
        if (balance == -1.0) {
            System.out.println("Account not found.");
        } else {
            System.out.println("Balance: $" + balance);
        }
    }

    public void deposit() {
        System.out.print("Enter Account Number: ");
        int accountNumber = scanner.nextInt();
        System.out.print("Enter Amount to Deposit: $");
        double depositAmount = scanner.nextDouble();
        int depositResult = bankApp.deposit(accountNumber, depositAmount);
        if (depositResult == 1) {
            System.out.println("Deposit successful.");
        } else {
            System.out.println("Account not found or insufficient balance.");
        }
    }

    public void withdraw() {
        System.out.print("Enter Account Number: ");
        int accountNumber = scanner.nextInt();
        System.out.print("Enter Amount to Withdraw: $");
        double withdrawAmount = scanner.nextDouble();
        int withdrawResult = bankApp.withdraw(accountNumber, withdrawAmount);
        if (withdrawResult == 1) {
            System.out.println("Withdrawal successful.");
        } else if (withdrawResult == -1) {
            System.out.println("Account not found.");
        } else {
            System.out.println("Invalid withdraw amount or insufficient balance.");
        }
    }

    public void updateAccount() {
        System.out.print("Enter Account Number: ");
        int accountNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Updated Address: ");
        String updatedAddress = scanner.nextLine();
        System.out.print("Enter Updated Phone Number: ");
        long updatedPhoneNumber = scanner.nextLong();
        int updateResult = bankApp.updateAccount(accountNumber, updatedAddress, updatedPhoneNumber);
        if (updateResult == 1) {
            System.out.println("Account updated successfully.");
        } else {
            System.out.println("Account not found.");
        }
    }

    public void deleteAccount() {
        System.out.print("Enter Account Number: ");
        int accountNumber = scanner.nextInt();
        int deleteResult = bankApp.deleteAccount(accountNumber);
        if (deleteResult == 1) {
            System.out.println("Account deleted successfully.");
        } else {
            System.out.println("Account not found.");
        }
    }
}

package miniproject1;

import java.util.ArrayList;

import miniprojectcollection.Student;

public class BankApp {
    private ArrayList<Bank> accounts = new ArrayList<>();
    public BankApp() {
        accounts.add(new Bank(101101,"sujitha","chennai",955001234));
        accounts.add(new Bank(102102,"shalini","pondy",98555678));
        accounts.add(new Bank(103103,"madhu","Mumbai",93559876));
    }
    public void viewAllBankInfo() 
    {
        if (accounts.isEmpty()) 
        {
            System.out.println("No bank accounts found!!");
        } 
        else 
        {
            for (Bank account : accounts) {
                System.out.println("Account Number: " + account.getAccountNumber() +
                        "\t Account Holder: " + account.getAccountHolder() +
                        "\t Address: " + account.getAddress() +
                        "\t Phone Number: " + account.getPhoneNumber() +
                        "\t Balance: $" + account.getBalance());
            }
        }
        
    }
    public int createAccount(int accountNumber, String accountHolder, String address, long phoneNumber) {
        Bank account = new Bank(accountNumber, accountHolder, address, phoneNumber);
        accounts.add(account);
        return 1; 
    }

    public double checkBalance(long accountNumber) {
        for (Bank account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                return account.getBalance();
            }
        }
        return -1.0; 
    }

    public int deposit(long accountNumber, double amount) {
        for (Bank account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                return account.deposit(amount);
            }
        }
        return -1; 
    }

    public int withdraw(long accountNumber, double amount) {
        for (Bank account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                return account.withdraw(amount);
            }
        }
        return -1; 
    }

    public int updateAccount(long accountNumber, String address, long phoneNumber) {
        for (Bank account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                account.setAddress(address);
                account.setPhoneNumber(phoneNumber);
                return 1;
            }
        }
        return -1; 
    }

    public int deleteAccount(long accountNumber) {
        for (Bank account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                accounts.remove(account);
                return 1; 
            }
        }
        return -1; 
    }
}

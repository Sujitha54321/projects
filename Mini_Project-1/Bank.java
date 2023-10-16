package miniproject1;
import java.util.ArrayList;
import java.util.Scanner;


public class Bank 
{
    private int accountNumber;
    private String accountHolder;
    private double balance;
    private String address;
    private long phoneNumber;

    public Bank(int accountNumber, String accountHolder, String address, long phoneNumber) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = 0.0;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    // Getters and setters
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int deposit(double amount) {
        if (amount > 0) 
        {
            balance += amount;
            return 1; 
        } else 
        {
            return 0; 
        }
    }

    public int withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            return 1; // Success
        } else if (amount <= 0) 
        {
            return -1;
        } else 
        {
            return -2; 
        }
    }

    @Override
    public String toString() {
        return "Bank [accountNumber=" + accountNumber + ", accountHolder=" + accountHolder +
               ", balance=" + balance + ", address=" + address + ", phoneNumber=" + phoneNumber + "]";
    }
}



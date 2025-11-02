package FinalProjectJavaCore2.model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Account {
    private String accountNumber;
    private int balance;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public static boolean isValidAccountNumber(String accountNumber) {
        return accountNumber.matches("\\d{5}[-]\\d{5}");
    }
}

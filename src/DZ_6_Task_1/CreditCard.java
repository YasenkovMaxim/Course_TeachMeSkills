package DZ_6_Task_1;

import java.util.Random;

public class CreditCard {
    String accountNumber;
    double balance;

    public CreditCard(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void replenishment(double replenishmentMoney) {
        balance = balance + replenishmentMoney;
    }

    void withdrawing(double withdrawingMoney) {
        balance = balance - withdrawingMoney;
    }

    void information() {
        System.out.println("Номер карты: " + accountNumber + " Остаток на счете: " + balance);
    }
}


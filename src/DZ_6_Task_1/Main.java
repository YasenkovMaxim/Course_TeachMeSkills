package DZ_6_Task_1;

public class Main {
    public static void main(String[] args) {
        CreditCard visa = new CreditCard("1234 5678 9012 3456", 298.56);
        CreditCard masterCard = new CreditCard("9683 8888 9999 2222", 3923.75);
        CreditCard world = new CreditCard("1111 2222 3333 4444", 56.90);
        visa.replenishment(500);
        masterCard.replenishment(200);
        world.withdrawing(40);
        visa.information();
        masterCard.information();
        world.information();


    }
}

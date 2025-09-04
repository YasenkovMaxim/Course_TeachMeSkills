package DZ_6_taskHard;

public class atm {
    /**
     * Задача *:
     * Создать класс, описывающий банкомат. Набор купюр, находящихся в банкомате, должен
     * задаваться тремя свойствами: количеством купюр номиналом 20, 50 и 100. Сделать
     * метод для добавления денег в банкомат. Сделать функцию, снимающую деньги, которая
     * принимает сумму денег, а возвращает булевое значение - успешность выполнения
     * операции. При снятии денег, функция должна распечатывать каким количеством купюр
     * какого номинала выдаётся сумма. Создать конструктор с тремя параметрами -
     * количеством купюр каждого номинала.
     */

    int twenty;
    int fifty;
    int oneHundred;

    public atm(int twenty, int fifty, int oneHundred) {
        this.twenty = twenty;
        this.fifty = fifty;
        this.oneHundred = oneHundred;
    }

    void addMoneyInAtm() {                    //  пополнение банкомата.
        if (twenty == 0) {
            twenty = twenty + 10;
        }
        if (fifty == 0) {
            fifty = fifty + 10;
        }
        if (oneHundred == 0) {
            oneHundred = oneHundred + 10;
        }
    }

    boolean lostMoneyfromAtm(double amounttowithdraw) {    // снятие денег из банкомата
        if ((twenty * 20) + (fifty * 50) + (oneHundred * 100) >= amounttowithdraw) {
            return true;
        } else {
            return false;
        }
    }
}



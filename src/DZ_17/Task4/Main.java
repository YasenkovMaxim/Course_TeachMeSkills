package DZ_17.Task4;

import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        //  Используя Consumer реализовать лямбду, которая будет принимать в себя строку в
        //  формате “*сумма* BYN”(через пробел, вместо *сумма* вставить любое значение), а
        //  выводить сумму, переведенную сразу в доллары

        String moneyBYN = "500 BYN";
        String money = moneyBYN.substring(0, moneyBYN.length() - 4);
        Consumer<String> result = s -> {
            double res = Double.parseDouble(s) / 3;
            System.out.println(res);
        };
        result.accept(money);
    }
}

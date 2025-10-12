package DZ_17.Task3;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        //  Задача 3:
        //  Используя Function реализовать лямбду, которая будет принимать в себя строку в
        //  формате “*сумма* BYN”(через пробел, вместо *сумма* вставить любое значение), а
        //  возвращать сумму, переведенную сразу в доллары.
        String moneyBYN = "450 BYN";
        String money = moneyBYN.substring(0, moneyBYN.length() - 4);
        Function<String, Double> conversion = s -> Double.parseDouble(s) / 3.00;
        double result = conversion.apply(money);
        System.out.println(result);
    }
}

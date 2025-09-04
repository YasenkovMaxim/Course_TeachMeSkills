package Calculator;

public class Result {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(15, 13.99f, "blue");
        System.out.println("Цвет: " + calculator.color + ". Стоимость: " + calculator.cost + ". Вес: " + calculator.weight);
        System.out.println("Сумма чисел = " + calculator.sum1());
        System.out.println("Разность чисел = " + calculator.difference());
        System.out.println("Деление чисел = " + calculator.division());
        System.out.println("Умножение чисел = " + calculator.multiplication());
    }
}

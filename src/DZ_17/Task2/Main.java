package DZ_17.Task2;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        // Задача 2:
        // Используя Predicate среди массива чисел вывести только те, которые являются
        // положительными
        Integer[] numbers = new Integer[]{2, -1, -45, 87, 5, 6, -4, -6};
        Predicate<Integer> isPositive = x -> x > 0;
        for (int num : numbers) {
            if (isPositive.test(num)) {
                System.out.print(num + " ");
            }
        }
    }
}

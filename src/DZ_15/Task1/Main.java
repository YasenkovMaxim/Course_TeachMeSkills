package DZ_15.Task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Пользователь вводит набор чисел в виде одной строки с клавиатуры. Например: "1, 2, 3,
        // 4, 4, 5". Избавиться от повторяющихся элементов в строке. Вывести результат на экран.
        // При решении использовать коллекции.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите набор чисел через запятую: ");
        String numbersString = scanner.nextLine();
        String[] elements = numbersString.split(",\\s");
        HashSet<String> numbers = new HashSet<>();
        for (String element : elements) {
            numbers.add(element);
        }
        System.out.println(numbers);
    }
}


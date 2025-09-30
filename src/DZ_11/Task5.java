package DZ_11;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        // Вывести на консоль новую строку, которой задублирована каждая буква из
        // начальной строки. Например, "Hello" -> "HHeelllloo".
        String word = "Hello";
        StringBuilder result = new StringBuilder();
        for (char c : word.toCharArray()) {
            result.append(c).append(c);
        }
        System.out.println(result);
    }
}


package DZ_11;

import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        // Ввести 3 строки с консоли. Найти слово, состоящее только из различных символов.
        // Если таких слов несколько, найти первое из них.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первую строку: ");
        String line1 = scanner.nextLine();
        System.out.println("Введите вторую строку: ");
        String line2 = scanner.nextLine();
        System.out.println("Введите третью строку: ");
        String line3 = scanner.nextLine();
        scanner.close();
        String all = line1.concat(" " + line2).concat(" " + line3);
        String[] words = all.split(" ");
        for (int i = 0; i < words.length; i++) {
            int f = 0;
            String word = words[i];
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);
            for (int j = 1; j < charArray.length; j++) {
                if (charArray[j] == charArray[j - 1]) {
                    f++;
                    break;
                }
            }
            if (f == 0) {
                System.out.println("Слово без повторяющихся элементов: " + word);
                break;
            }
        }
    }
}

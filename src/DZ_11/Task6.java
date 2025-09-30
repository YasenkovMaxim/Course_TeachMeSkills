package DZ_11;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        // Задача *:
        // Дана строка произвольной длины с произвольными словами. Написать программу для
        // проверки является ли любое выбранное слово в строке палиндромом.
        // Например, есть строка, вводится число 3, значит необходимо проверить является ли 3-е
        // слово в этой строке палиндромом.
        // Предусмотреть предупреждающие сообщения на случаи ошибочных ситуаций: например
        // в строке 5 слов, а на вход программе передали число 500.
        String line = "Hello I am Maxim. I love dogs and noon";
        String newline = line.replaceAll("\\.", "");
        String[] wordsArray = newline.split("\\s+");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер слова которое хотите проверить: ");
        int search = scanner.nextInt();
        if (search > wordsArray.length) {
            System.out.println("В строке " + wordsArray.length + " слов, а на вход передали " + search);
        }
        StringBuilder reversedWord = new StringBuilder(wordsArray[search - 1]).reverse();
        boolean result = wordsArray[search - 1].equals(reversedWord.toString());
        if (result == true) {
            System.out.println("Слово " + wordsArray[search - 1] + " является палиндромом");
        } else {
            System.out.println("Слово " + wordsArray[search - 1] + " не является палиндромом");
        }
    }
}


package DZ_11;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        // 1. Ввести 3 строки с консоли, найти самую короткую и самую длинную строки. Вывести
        // найденные строки и их длину
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первую строку: ");
        String line1 = scanner.nextLine();
        System.out.println("Введите вторую строку: ");
        String line2 = scanner.nextLine();
        System.out.println("Введите третью строку: ");
        String line3 = scanner.nextLine();
        String longest = line1;
        String shortest = line1;
        if (line2.length() > longest.length()) {
            longest = line2;
        }
        if (line2.length() < shortest.length()) {
            shortest = line2;
        }
        if (line3.length() > longest.length()) {
            longest = line3;
        }
        if (line3.length() < shortest.length()) {
            shortest = line3;
        }
        System.out.println("Самая длинная строка: " + longest + ". ее длина равна: " + longest.length());
        System.out.println("Самая короткая строка: " + shortest + ". ее длина равна: " + shortest.length());
        scanner.close();
    }
}

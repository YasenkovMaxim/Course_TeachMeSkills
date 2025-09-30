package DZ_11;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        // 2. Ввести 3 строки с консоли. Упорядочить и вывести строки в порядке возрастания
        // значений их длины
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первую строку: ");
        String line1 = scanner.nextLine();
        System.out.println("Введите вторую строку: ");
        String line2 = scanner.nextLine();
        System.out.println("Введите третью строку: ");
        String line3 = scanner.nextLine();
        String longest = line1;
        String shortest = line1;
        String medium = "";
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
        if (line1.length() > shortest.length() && line1.length() < longest.length()) {
            medium = line1;
        }
        if (line2.length() > shortest.length() && line2.length() < longest.length()) {
            medium = line1;
        }
        if (line3.length() > shortest.length() && line3.length() < longest.length()) {
            medium = line1;
        }
        System.out.println("Строки по возрастанию: \n" + shortest + "\n" + medium + "\n" + longest);
        scanner.close();
    }
}

package DZ_17.Task1;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дату рождения (гггг-мм-дд): ");
        String input = scanner.nextLine();
        LocalDate birthDate = LocalDate.parse(input);
        LocalDate hundredYearsLater = birthDate.plusYears(100);
        System.out.println("День, когда исполнится 100 лет: " + hundredYearsLater);
        scanner.close();
    }
}

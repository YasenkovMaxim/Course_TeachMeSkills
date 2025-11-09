package FinalProjectJavaCore;

import FinalProjectJavaCore.Develop.Method;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:\n1 - вызов операции парсинга файлов перевода из input \n" +
                "2 - вызов операции вывода списка всех переводов из" +
                " файла-отчета.");
        int choice = scanner.nextInt();
        switch (choice){
            case 1 -> Method.one();
            case 2 -> {
                Method.one();
                Method.two();
            }
            default -> System.out.println("Введено неверное число");
        }
    }
}

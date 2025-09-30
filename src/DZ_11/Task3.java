package DZ_11;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        //Ввести 3 строки с консоли. Вывести на консоль те строки, длина которых меньше
        //средней, а также их длину
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первую строку: ");
        String line1 = scanner.nextLine();
        System.out.println("Введите вторую строку: ");
        String line2 = scanner.nextLine();
        System.out.println("Введите третью строку: ");
        String line3 = scanner.nextLine();
        double medium = (line1.length() + line2.length() + line3.length()) / 3.0;
        System.out.println("Строки у которых длина меньше средней: ");
        if (line1.length() < medium){
            System.out.println(line1);
        }
        if (line2.length() < medium){
            System.out.println(line2);
        }
        if (line3.length() < medium){
            System.out.println(line3);
        }
        scanner.close();
    }
}

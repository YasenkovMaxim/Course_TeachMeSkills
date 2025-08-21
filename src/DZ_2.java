import java.util.Scanner;

public class DZ_2 {
    public static void main(String[] args) {

        //Задача 1:
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println("Четное число");
        } else {
            System.out.println("Не четное число");
        }

        //Задача 2:
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Введите температуру на улице: ");
        int t = scanner2.nextInt();
        if (t > -5) {
            System.out.println("Warm");
        } else if (t <= -5 && t > -20) {
            System.out.println("Normal");
        } else {
            System.out.println("Cold");
        }

        //Задача 3
        for (int i = 10; i <= 20; i++) {
            System.out.print(i * i + " ");
        }
        // задача решена!

        //Задача 4
        System.out.println(" ");
        int num = 7;
        while (num <= 98) {
            System.out.print(num + " ");
            num += 7;
        }

        // Задача*
        Scanner scanner3 = new Scanner(System.in);
        int wholeNamber = 0;
        System.out.print("\nВведите положительное целое число: ");
        if (scanner.hasNextInt()) {
            wholeNamber = scanner.nextInt();
            if (wholeNamber > 0) {
                int sum = 0;
                for (int i = 1; i <= wholeNamber; i++) {
                    sum += i;
                }
                System.out.println("Сумма чисел от 1 до " + wholeNamber + " равна " + sum);
            } else {
                System.out.println("Введено не положительное число");
            }
        } else {
            System.out.println("Введено не целое число");
        }
        scanner.close();
    }
}

package Calculator;

import java.util.Scanner;

public class Calculator {
    int weight;
    float cost;
    String color;

    public Calculator(int weight, float cost, String color) {
        this.weight = weight;
        this.cost = cost;
        this.color = color;
    }

    Scanner scanner = new Scanner(System.in);

    int sum1() {
        System.out.println("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int b = scanner.nextInt();
        return a + b;
    }
    int difference() {
        System.out.println("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int b = scanner.nextInt();
        return a - b;
    }
    int division() {
        System.out.println("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int b = scanner.nextInt();
        return a / b;
    }
    int multiplication() {
        System.out.println("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int b = scanner.nextInt();
        return a * b;
    }
}

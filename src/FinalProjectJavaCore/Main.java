package FinalProjectJavaCore;

import FinalProjectJavaCore.Develop.Method;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        if (choice == 1) {
            Method.one();
        } else {
            System.out.println("Введено неверное число");
        }
        if (choice == 2) {
            Method.one();
            Method.two();
        }
    }
}

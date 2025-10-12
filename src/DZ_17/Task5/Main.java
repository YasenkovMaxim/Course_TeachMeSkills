package DZ_17.Task5;

import java.util.Scanner;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        //  Используя Supplier написать метод, который будет возвращать введенную с консоли
        //  строку задом наперед.
        Supplier<String> result = () -> {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите строку: ");
            String input = scanner.nextLine();
            StringBuilder reversed = new StringBuilder(input);
            scanner.close();
            return reversed.reverse().toString();
        };
        System.out.println(result.get());

    }
}

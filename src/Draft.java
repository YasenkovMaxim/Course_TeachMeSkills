import java.util.Arrays;
import java.util.Scanner;

public class Draft {
    public static void main(String[] args) {
        //Задача *:
        //Даны числа n и m. Создайте массив A[n][m] и заполните его змейкой (см. пример).
        //        Формат входных данных:
        //Программа получает на вход два числа n и m.
        //        Формат выходных данных:
        //Программа должна вывести полученный массив, отводя на вывод каждого числа ровно 3
        //символа.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество элементов двумерного массива: ");
        int oneIndex = scanner.nextInt();
        int twoIndex = scanner.nextInt();
        int[][] snake = new int[oneIndex][twoIndex];
        int zero1 = 1;
        for (int i = 0; i < snake.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < snake[i].length; j++) {
                    snake[i][j] = zero1;
                    zero1++;
                }
            }
            if (i % 2 != 0) {
                for (int j = snake[i].length -1; j >= 0; j--) {
                    snake[i][j] = zero1;
                    zero1++;
                }
            }
            System.out.println(Arrays.toString(snake[i]));
        }
    }
}
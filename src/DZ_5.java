import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class DZ_5 {
    public static void main(String[] args) {

        //Задача 1:
        Random random = new Random();
        int[][] deeparray = new int[3][4];
        for (int i = 0; i < deeparray.length; i++) {
            for (int j = 0; j < deeparray[i].length; j++) {
                deeparray[i][j] = random.nextInt(1, 20);
            }
        }
        System.out.println("Массив: " + Arrays.deepToString(deeparray));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число, которые прибавится к каждому элементу массива: ");
        int num = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < deeparray.length; i++) {
            for (int j = 0; j < deeparray[i].length; j++) {
                deeparray[i][j] = deeparray[i][j] + num;
                sum = deeparray[i][j] + sum;

            }
        }
        System.out.println("Сумма всех чисел: " + sum);

        //Задача 2:
        String[][] chess = new String[8][8];
        String B = "B";
        String W = "W";
        for (int i = 0; i < chess.length; i++) {
            for (int j = 0; j < chess[i].length; j++) {
                chess[i][j] = B;
                if (j % 2 == 0 && i % 2 != 0) {
                    chess[i][j] = W;
                }
                if (j % 2 != 0 && i % 2 == 0) {
                    chess[i][j] = W;
                }
            }
            System.out.println();
            System.out.print(Arrays.toString(chess[i]));
        }

        //Задача *:
        System.out.println("\nВведите количество элементов двумерного массива: ");
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
            } else {
                for (int j = snake[i].length - 1; j >= 0; j--) {
                    snake[i][j] = zero1;
                    zero1++;
                }
            }
        }
        for (int i = 0; i < snake.length; i++) {
            for (int j = 0; j < snake[i].length; j++) {
                System.out.printf("%3d", snake[i][j]);
            }
            System.out.println();
        }
        scanner.close();
    }
}

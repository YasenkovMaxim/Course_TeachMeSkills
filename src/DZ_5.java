import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class DZ_5 {
    public static void main(String[] args) {

        //Задача 1:
        //1.1 Создать двумерный массив, заполнить его случайными числами.
        //1.2 Добавить к каждому значению число, которое пользователь будет вводить с консоли.
        //1.3 Найти сумму всех получившихся элементов и вывести в консоль.
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
        //Создать программу для раскраски шахматной доски с помощью цикла. Создать
        //двумерный массив String 8х8. С помощью циклов задать элементам массива значения
        //B(Black) или W(White). При выводе результат работы программы должен быть
        //teachmeskills.by
        //следующим:
        //W B W B W B W B
        //B W B W B W B W
        //W B W B W B W B
        //B W B W B W B W
        //W B W B W B W B
        //B W B W B W B W
        //W B W B W B W B
        //B W B W B W B W
        String[][] chess = new String[8][8];
        String B = "B";
        String W = "W";
        for (int i = 0; i < chess.length; i++) {
            for (int j = 0; j < chess[i].length; j++) {
                chess[i][j] = B;
                if (j % 2 == 0 && i % 2 != 0){
                    chess[i][j] = W;
                }
                if  (j % 2 != 0 && i % 2 == 0){
                    chess[i][j] = W;
                }
            }
            System.out.println(" ");
            System.out.print(Arrays.toString(chess[i]));
        }

        //Задача *:
        //Даны числа n и m. Создайте массив A[n][m] и заполните его змейкой (см. пример).
        //        Формат входных данных:
        //Программа получает на вход два числа n и m.
        //        Формат выходных данных:
        //Программа должна вывести полученный массив, отводя на вывод каждого числа ровно 3
        //символа.
    }
}

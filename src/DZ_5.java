import java.util.Scanner;

public class DZ_5 {
    public static void DZ_5(String[] args) {

        //Задача 1:
        //1.1 Создать двумерный массив, заполнить его случайными числами.
        //1.2 Добавить к каждому значению число, которое пользователь будет вводить с консоли.
        //1.3 Найти сумму всех получившихся элементов и вывести в консоль.

        int[][] deeparray = {{2, 5, 9}, {23, 5, 11}, {31, 9, 10}};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число, которые прибавится к каждому элементу массива");
        int num = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < deeparray.length; i++) {
            for (int j = 0; j < deeparray[i].length; j++) {
                deeparray[i][j] = deeparray[i][j] + num;
                        sum = deeparray[i][j];
            }
        }
        System.out.println("Сумма всех чисел: " + sum);
    }
}

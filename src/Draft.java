import java.util.Arrays;
import java.util.Random;

public class Draft {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] array = new int[5][5];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(1, 30);
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%3d", array[i][j]);
            }
            System.out.println();
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    sum = array[i][j] + sum;
                }
            }
        }
        int sum1 = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = array[i].length - 1; j >= 0; j--) {
                if (i + j == array.length - 1)
                    sum1 = array[i][j] + sum1;
            }
        }
        System.out.println("Сумма элементов по диагонали: " + sum);
        System.out.println("Сумма элементов по обратной диагонали: " + sum1);
    }
}

import java.util.Arrays;

public class DZ_4 {
    public static void main(String[] args) {

        // Задача 1
        int[] array = {1, 3, 4, 5, 7, 9};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i]);
        }
        System.out.println("\n");

        // Задача 2
        int[] array2 = {5, 7, 89, 43, 1, 94, 13};
        int min = array2[0];
        int max = array2[0];
        for (int i = 0; i < array2.length; i++) {
            min = Math.min(array2[i], min);
            max = Math.max(array2[i], max);
        }
        System.out.println("Минимальное число: " + min);
        System.out.println("Максимальное число: " + max);

        // Задача 3
        int[] array3 = {12, 3, 34, 84, 98, 5, 66, 11};
        int maxIndex = 0;
        int minIndex = 0;
        for (int i = 0; i < array3.length; i++) {
            if (array3[i] < array3[minIndex]) {
                minIndex = i;
            }
            if (array3[i] > array3[maxIndex]) {
                maxIndex = i;
            }
        }
        System.out.println("Индекс минимального числа: [" + minIndex + "]");
        System.out.println("Индекс максимального числа: [" + maxIndex + "]");

        //Задача 4
    }
}

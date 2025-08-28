import java.util.Arrays;

public class DZ_4 {
    public static void main(String[] args) {

        // Задача 1
        //Пройти по массиву, вывести все элементы в прямом и в обратном порядке.
        int[] array = {1, 3, 4, 5, 7, 9};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i]);
        }
        System.out.println("\n");

        // Задача 2
        //Найти минимальный-максимальный элементы и вывести в консоль.
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
        //Найти индексы минимального и максимального элементов и вывести в консоль.
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
        //Найти и вывести количество нулевых элементов. Если нулевых элементов нет - вывести
        //сообщение, что их нет.
        int[] array4 = {0, 66, 4, 0, 0, 12, 0};
        int zero = 0;
        for (int i = 0; i < array4.length; i++) {
            if (array4[i] == 0) {
                zero++;
            }
        }
        if (zero == 0) {
            System.out.println("В этом массиве нет нулей");
        } else if (zero == array4.length) {
            System.out.println("Массив состоит только из нулей");
        } else {
            System.out.println("Количество нулевый элементов в массиве: " + zero);
        }

        //Задача 5
        //Пройти по массиву и поменять местами элементы первый и последний, второй и
        //предпоследний и т.д.
        int[] array5 = {3, 56, 6, 88, 999, 74, 3, 45, 98};
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array5[i];
            array5[i] = array5[array5.length - 1 - i];
            array5[array5.length - 1 - i] = temp;
        }
        System.out.println("Массив в поменяными числами: " + Arrays.toString(array5));

    }
}

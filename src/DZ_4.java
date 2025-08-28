import java.util.Arrays;

public class DZ_4 {
    public static void main(String[] args) {

        // Задача 1
        //Пройти по массиву, вывести все элементы в прямом и в обратном порядке.
        int[] array = {1, 3, 4, 5, 7, 9};
        System.out.print("Прямая последовательность: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
        System.out.print("\nОбратная последовательность: ");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i]);
        }

        // Задача 2
        //Найти минимальный-максимальный элементы и вывести в консоль.
        int[] array2 = {5, 7, 89, 43, 1, 94, 13};
        int min = array2[0];
        int max = array2[0];
        for (int i = 0; i < array2.length; i++) {
            min = Math.min(array2[i], min);
            max = Math.max(array2[i], max);
        }
        System.out.println("\nМинимальное число: " + min);
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
            System.out.println("Количество нулевых элементов в массиве: " + zero);
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
        System.out.println("Измененный массив по условиям задачи: " + Arrays.toString(array5));

        //Задача 6
        //Проверить, является ли массив возрастающей последовательностью (каждое следующее
        //число больше предыдущего).
        int[] array6 = {1, 3, 4, 5, 7, 11, 15};
        int num = 0;
        for (int i = 0; i < array6.length - 1; i++) {
            int Index = array6[i + 1];
            if (array6[i] < Index) {
                num++;
            }
        }
        if (num == array6.length - 1) {
            System.out.println("Массив является возрастающей последовательностью.");
        } else {
            System.out.println("Массив не является возрастающей последовательностью.");
        }

        //Имеется массив из неотрицательных чисел(любой). Представьте что массив
        //представляет целое число (Например массив {1,2,3} -> 123, {9,9,9} -> 999). Задача
        //добавить единицу к этому “числу” и на выходе получить исправленный массив. Массив не
        //содержит нуля в начале, кроме самого числа 0.
        //Пример:
        //Input: [1,4,0,5,6,3]
        //Output: [1,4,0,5,6,4]
        //Input: [9,9,9]
        //Output: [1,0,0,0]

        int[] array7 = {8, 9, 9, 9};
        int sum = 0;
        for (int i = 0; i < array7.length; i++) {
            if (array7[i] == 9) {
                sum++;
            }
        }
        if (sum == array7.length) {                        // проверка если массив состоит только из девяток
            int[] array7new = new int[array7.length + 1];  // создание нового массива
            Arrays.fill(array7new, 0);
            array7new[0] = 1;
            System.out.println(Arrays.toString(array7new));
            return;                                        // выход чтобы не читал остальные строки кода
        }

        if (array7[array7.length - 1] != 9) {              // проверка если последнее число массива не девятка
            array7[array7.length - 1] = array7[array7.length - 1] + 1; // просто добавляем единицу к последнему числу
        } else {
            for (int i = array7.length - 1; i >= 0; i--) { // решение если несколько девяток в конце
                if (array7[i] == 9) {
                    array7[i] = 0;
                    if (array7[i - 1] != 9) {
                        array7[i - 1] = array7[i - 1] + 1;
                        break;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(array7));
    }
}

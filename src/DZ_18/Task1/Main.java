package DZ_18.Task1;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        /* Задача №1:
   Создать коллекцию класса ArrayList наполнить ee элементами типа Integer.
   С помощью Stream'oв:
   - Удалить дубликаты
   - Оставить только четные элементы
   - Вывести сумму оставшихся элементов в стриме. */
        ArrayList<Integer> collection = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            collection.add(random.nextInt(0, 10));
        }
        System.out.println("Исходная коллекция: " + collection);

        int sum = collection.stream()
                .distinct()
                .filter(i -> i % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Сумма четных уникальных элементов: " + sum);
    }
}

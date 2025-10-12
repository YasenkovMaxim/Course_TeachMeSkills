package DZ_18.Task2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
//   Задача №2*:
//   Создать набор данных в формате id-name, сохраненный в Мар. Необходимо отобрать из
//   этого набора только те данные, id которых попадает в числовой диапазон 1/2/5/8/9/13.
//   Среди отобранных значений отобрать только те, которые имеют нечетное количество
//   букв в имени. После чего вернуть список List имен, записанных буквами задом наперед.
        HashMap<Integer, String> data = new HashMap<>();
        data.put(1, "Алексей");
        data.put(2, "Мария");
        data.put(3, "Иван");
        data.put(5, "Ольга");
        data.put(8, "Петр");
        data.put(9, "Лена");
        data.put(10, "Сергей");
        data.put(13, "Николай");

        HashSet<Integer> Ids = new HashSet<>(Arrays.asList(1, 2, 5, 8, 9, 13));

        List<String> result = data.entrySet().stream()
                .filter(entry -> Ids.contains(entry.getKey()))
                .filter(entry -> (entry.getValue().length() % 2) == 1)
                .map(entry -> new StringBuilder(entry.getValue()).reverse().toString())
                .toList();
        result.forEach(System.out::println);
    }
}


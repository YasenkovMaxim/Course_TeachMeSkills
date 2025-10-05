package DZ_16.Task2;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        //На вход поступает массив не пустых строк, создайте и верните Map<String, String> следующим образом:
        //для каждой строки добавьте ее первый символ в качестве ключа, последний в качестве значения. Пример:
        //pairs(["code","bug"])->{"c":"e", "b":"g"}
        //pairs(["man","moon","main"])->{"m":"n"}
        String[] strings = new String[]{"code", "bug", "family", "apple"};
        HashMap<String, String> mapLetters = new HashMap<>();
        for (String word : strings) {
            String key = word.substring(0, 1);
            String value = word.substring(word.length() - 1);
            mapLetters.put(key, value);
        }
        System.out.println(mapLetters);
    }
}

package DZ_16.Task1;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        //На вход поступает массив строк, верните Map<String, Boolean> где каждая отдельная строка является ключом,
        //а ее значение равно true если эта строка встречается в массиве 2 или более раз. Пример:
        //wordMultiple(["a","b","a","c","b"])->{"a":true, "b"true, "c":false}
        String[] strings = new String[]{"a", "b", "c", "a", "b", "d"};
        HashMap<String, Boolean> wordMultiple = new HashMap<>();
        for (String word : strings) {
            if (wordMultiple.containsKey(word)) {
                wordMultiple.put(word, true);
            } else {
                wordMultiple.put(word, false);
            }
        }
        System.out.println(wordMultiple);
    }
}

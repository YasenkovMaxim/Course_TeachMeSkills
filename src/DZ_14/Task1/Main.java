package DZ_14.Task1;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // В задании приложен файл Ромео и Джульетта на английском, вычитать его в приложении.
        // Проанализировать и записать в другой файл самое длинное слово.
        StringBuilder sb = new StringBuilder();
        try (FileReader fileReader = new FileReader("C:\\Games\\romeo-and-juliet.txt")) {
            int i = 0;
            while ((i = fileReader.read()) != -1) {
                sb.append((char) i);
            }
        } catch (IOException e) {
            System.out.println("Exception: " + e);
        }
        String text = sb.toString().replaceAll("[^a-zA-Z\\s]", " ");
        String[] newSb = text.split("\\s+");
        String longestWord = "";
        for (String word : newSb) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        System.out.println("Самое длинное слово: " + longestWord);

        try (FileWriter fileWriter = new FileWriter("C:\\Games\\longestWord.txt")) {
            fileWriter.write(longestWord);
        } catch (IOException e) {
            System.out.println("Exception: " + e);
        }
    }
}

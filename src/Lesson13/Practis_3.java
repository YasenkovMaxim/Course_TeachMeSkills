package Lesson13;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Practis_3 {
    public static void main(String[] args) {
        // Используя FileReader и FileWriter сначала записать в файл tms2.txt фразу на латыни "Cognosce te ipsum"
        // а затем считать ее и вывести в консоль первую букву.
        String text = "Cognosce te ipsum";
        try (FileWriter fileWriter = new FileWriter("C:\\Games\\tms2.txt")) {
            fileWriter.write(text);
        } catch (IOException e) {
            System.out.println("Exception: " + e);
        }
        StringBuilder sb = new StringBuilder();
        try (FileReader fileReader = new FileReader("C:\\Games\\tms2.txt")) {
            int i = 0;
            while ((i = fileReader.read()) != -1) {
                sb.append((char) i);
            }
        } catch (IOException e) {
            System.out.println("Exception: " + e);
        }
        String firstLetter =sb.toString();
        System.out.println(firstLetter.charAt(0));
    }
}

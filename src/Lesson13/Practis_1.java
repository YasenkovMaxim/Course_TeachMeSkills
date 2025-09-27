package Lesson13;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Practis_1 {
    public static void main(String[] args) {
        // Используя FileOutputStream и FileInputStream записать в файл tms.txt строку, введенную пользователем
        // с консоли. Считать строку из файла tms.txt и вывести в консоль, заменив все пробелы на знак нижнего
        // подчеркивания.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку, которую хотите добавить в файл: ");
        String inputLine = scanner.nextLine();
        File file = new File("C:\\Games\\tms.txt");
        try (FileOutputStream fos = new FileOutputStream(file)) {
            byte[] bytes = inputLine.getBytes();
            fos.write(bytes);
        } catch (IOException e) {
            System.out.println("Exception: " + e);
        }
        StringBuilder sb = new StringBuilder();
        try (FileInputStream fis = new FileInputStream(file)) {
            int i = 0;
            while ((i = fis.read()) != -1) {
                sb.append((char) i);
            }
        } catch (IOException e) {
            System.out.println("Exception: " + e);
        }
       String result = sb.toString().replace(' ','_');
        System.out.println(result);
    }
}

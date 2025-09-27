package Lesson13;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Practis_2 {
    public static void main(String[] args) {
        /** Написать программу, которая:
         запрашивает у пользователя ввод фразы или текста;
         сохраняет введённый текст в файл (например, C:\Data\input.txt);
         после этого читает содержимое этого файла;
         подсчитывает и выводит на экран количество символов, слов и строк в этом файле;
         заменяет все гласные буквы (a, e, i, o, u, а также русские гласные) в содержимом на символ *;
         сохраняет изменённый текст обратно в тот же файл;
         выводит обновлённое содержимое файла на экран.*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст");
        String inputLine = scanner.nextLine();
        File file = new File("C:\\Games\\tmstwo.txt");
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
        Pattern pattern = Pattern.compile("\\.{1}");
        Matcher matcher = pattern.matcher(sb);
        int chars = 0;
        while (matcher.find()) {
            chars++;
        }
        System.out.println("Количество символов: " + chars);
        Pattern pattern2 = Pattern.compile("[a-zA-Z]+");
        Matcher matcher2 = pattern2.matcher(sb);
        int words = 0;
        while (matcher2.find()) {
            words++;
        }
        System.out.println("Количество слов: " + words);
        String newSb = sb.toString().replaceAll("[aeiouAEIOU]{1}", "*");
        System.out.println(newSb);
    }
}


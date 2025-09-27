package DZ_14.Task2;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /** Допустим есть txt файл с номерами документов. Номером документа является строка, состоящая из
         * букв и цифр(без служебных символов). Пусть этот файл содержит каждый номер документа с новой строки
         * и в строке никакой другой информации, только номер документа. Валидный номер документа должен
         * иметь длину 15 символов и начинаться с последовательности цифр docnum(далее любая последовательность
         * букв/цифр) или contract(далее любая последовательность букв/цифр). Написать программу для чтения информации
         * из входного файла - путь к входному файлу должен
         * задаваться через консоль. Программа должна проверять номера документов на валидность. Валидные номера
         * документов следует записать в один файл-отчет. Невалидные номера документов следует записать в другой
         * файл-отчет, но после номеров документов следует добавить информацию о том, почему этот документ не валиден
         * */ //C:\\Games\\documents.txt
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        try (FileReader fileReader = new FileReader(scanner.nextLine())) {
            int i = 0;
            while ((i = fileReader.read()) != -1) {
                sb.append((char) i);
            }
        } catch (IOException e) {
            System.out.println("Exception: " + e);
        }
        String[] numbersDocuments = sb.toString().split("\\n");

        StringBuilder valid = new StringBuilder();
        StringBuilder noValid = new StringBuilder();
        for (String doc : numbersDocuments) {
            doc = doc.trim();
            int length = doc.length();
            if (length > 15) {
                noValid.append(doc).append(" - Номер документа должен содержать не более 15 символов \n");
                continue;
            }
            if (length < 15) {
                noValid.append(doc).append(" - Номер документа должен содержать не менее 15 символов \n");
                continue;
            }
            if (doc.matches("docnum\\w{9}|contract\\w{7}")) {
                valid.append(doc).append("\n");
            } else if (doc.matches("\\w+")) {
                noValid.append(doc).append(" - Номер документа не содержит docnum или contract \n");
            } else {
            }
        }
        try (FileWriter validWriter = new FileWriter("C:\\Games\\docright.txt");
             FileWriter noValidWriter = new FileWriter("C:\\Games\\docfalse.txt")) {
            validWriter.write(valid.toString());
            noValidWriter.write(noValid.toString());
        } catch (IOException e) {
            System.out.println("Exception" + e);
        }
    }
}


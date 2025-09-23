package DZ_12;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        /** Задача 1:
         Вывести в консоль из строки которую пользователь вводит с клавиатуры все
         аббревиатуры. Аббревиатурой будем считать слово от 2 до 6 символов, состоящее
         только из прописных букв, без чисел. */
        Scanner scanner = new Scanner(System.in);
       /* String text = scanner.nextLine();
        Pattern pattern = Pattern.compile("[A-ZА-Я]{2,6}");
        Matcher m = pattern.matcher(text);
        while (m.find()) {
            System.out.println(m.group());
        }*/

        /** Задача *:
         Программа на вход получает произвольный текст. В этом тексте может быть номер
         документа(один или несколько), емейл и номер телефона. Номер документа в формате:
         xxxx-xxxx-xx, где x - это любая цифра; номер телефона в формате: +(xx)xxxxxxx. Документ
         может содержать не всю информацию, т.е. например, может не содержать номер
         телефона, или другое. Необходимо найти эту информацию и вывести в консоль в
         формате:
         "([\\w-.]+@[\\w-.]+\\.[\\w-.]+)?(\\d{4}-\\d{4}-\\d{2})(\\+\\(\\d{2}\\)\\d{7})?");
         email: teachmeskills@gmail.com
         document number: 1423-1512-51
         и т.д */
        String doc = scanner.nextLine();
        Pattern pattern2 = Pattern.compile("\\d{4}-\\d{4}-\\d{2}");
        Matcher m2 = pattern2.matcher(doc);
        while (m2.find()){
            System.out.println("document number: " + m2.group());
        }
    }
}

package Lesson12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        /**   1. Написать метод который сможет вернуть все цифры из строки:
         “Today my 17th lesson. I’m the best 1! Find me in inst: @teachmeskills”.
         2. Написать метод который сможет заменить КАЖДУЮ букву на знак & в строке из 1
         задания.
         3. Написать метод который сможет вернуть инсту в строке из 1 задания.
         4. Написать метод который возвращает true если строка имеет вид “null”.
         5. В строке “Hello \n world \n !!!” заменить \n на “” используя классы Pattern и Matcher.
         6. В строке “Всем привет!! Меня зовут Билл Гейтс и я мечтаю учиться в TeachMeSkills!”
         найти имя и фамилию человека и вывести на экран! */

        String one = "Today my 17th lesson. I’m the best 1! Find me in inst: @teachmeskills";
        Pattern pattern = Pattern.compile("\\d{1,2}");
        Matcher matcher = pattern.matcher(one);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }

        String onechange = null;
        onechange = one.replaceAll("[A-z]{1}", "&");
        System.out.println(onechange);

        String two = "Today my 17th lesson. I’m the best 1! Find me in inst: @teachmeskills";
        Pattern pattern2 = Pattern.compile("@\\w+"); // [@]{1}//D{13};
        Matcher matcher2 = pattern2.matcher(two);
        while (matcher2.find()) {
            System.out.println(matcher2.group());
        }

        String input = "Это     пример    текста";
        System.out.println(input.trim());
    }
}

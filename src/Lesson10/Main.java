package Lesson10;

public class Main {
    public static void main(String[] args) {
        String text = "Alohamora";
        for (int i = 1; i <= text.length(); i++) {
            String result = text.substring(0, i);
            System.out.println(result);
        }
        String text2 = "This is text new for my friend";
        String[] wordsArray = text2.split(" ");
        System.out.println(wordsArray.length);
    }
}

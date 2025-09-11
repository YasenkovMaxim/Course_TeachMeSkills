package DZ_7.Task_hard;

public class Main {
    public static void main(String[] args) {
        try {
            Apple apple = new Apple();
            java.lang.reflect.Field colorField = apple.getClass().getDeclaredField("color");
            colorField.setAccessible(true);
            colorField.set(apple, "Red");
            String newColor = (String) colorField.get(apple);
            System.out.println("После изменения: " + newColor);

        } catch (Exception e) {
        }
    }
}

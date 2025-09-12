package Lesson8.Task_3;

public class Main {
    public static void main(String[] args) {
        /** Задача 1:
         1.1 Создать классы Dog, Cat, Main и интерфейс Voice c методом doVoice().
         1.2 В Dog и Cat имплементировать данный интерфейс и реализовать метод doVoice().
         1.3 В классе Main создать объекты Dog, Cat и вызвать метод doVoice() */
        Dog dog = new Dog();
        Cat cat = new Cat();
        dog.doVoice();
        cat.doVoice();
    }
}

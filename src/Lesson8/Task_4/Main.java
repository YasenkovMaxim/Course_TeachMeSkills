package Lesson8.Task_4;

public class Main {
    public static void main(String[] args) {
        /** Задача 2:
        Создать абстрактный класс Computer и абстрактный метод getClassName(). Создать
        классы Hp и Mac и отнаследоваться от Computer. Переопределить метод getClassName()
        в классах-наследниках так, чтобы они выводили сообщения «I’m HP» или «I’m Mac». В
        методе main класса Main создать объекты классов Hp Mac и вызвать методы для каждого
        из этих объектов. */
        Hp hp = new Hp();
        Mac mac = new Mac();
        hp.getClassName();
        mac.getClassName();
    }
}

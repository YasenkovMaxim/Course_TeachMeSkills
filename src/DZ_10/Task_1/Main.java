package DZ_10.Task_1;

public class Main {
    public static void main(String[] args) {
        /**Задача 1:
         Создать класс для описания пользователя системы. Переопределить в классе методы
         toString,hashcode и equals. Создать несколько экземпляров класса с одним и тем же
         значением полей и сравнить с помощью метода equals.*/
UserTest Anna = new UserTest("Anna", 23, 'w');
UserTest Anna2 = new UserTest("Anna", 23, 'w');
        System.out.println(Anna.equals(Anna2));
    }
}

package DZ_10.Task_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        /**Задача *:
         Создать программу для реализации поверхностного и глубокого клонирования объекта
         класса User. Пусть на вход программе будет передаваться тип операции клонирования
         (поверхностное клонирование или глубокое), а также id юзера для клонирования.*/
        User alex = new User();
        alex.setCat(new Cat("catis", 3));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите id пользователя для клонирования: ");
        alex.setUserId(scanner.nextInt());
        System.out.println("Напишите 0 для поверхностного клонирования или напишите 1 для глубокого клонирования: ");
        int changeClone = scanner.nextInt();
        if (changeClone == 0) {
            User alex2 = (User) alex.shallowClone();
            System.out.println("Изначальный объект: " + alex);
            System.out.println("Клонированный объект: " + alex2);
        } else if (changeClone == 1) {
            User alex2 = (User) alex.deepClone();
            System.out.println("Изначальный объект: " + alex);
            System.out.println("Клонированный объект: " + alex2);
        } else {
            System.out.println("Вы указали неверную цифру");
        }

    }
}

package DZ_15.Task3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Задача 3:
        // Создать класс Student, содержащий следующие характеристики – имя, группа, курс,
        // оценки по предметам. Создать коллекцию, содержащую объекты класса Student.
        // Написать метод, который удаляет студентов со средним баллом <3. Если средний
        // балл>=3, студент переводится на следующий курс. Дополнительно написать метод
        // printStudents(List<Student> students, int course), который получает список студентов и
        // номер курса. А также печатает на консоль имена тех студентов из списка, которые
        // обучаются на данном курсе.
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Max", 10, 2, new int[]{5, 3, 3, 4, 2}));
        students.add(new Student("Alex", 13, 3, new int[]{4, 5, 5}));
        students.add(new Student("Bob", 6, 1, new int[]{5, 1, 4, 5, 4}));
        students.add(new Student("Ilia", 6, 3, new int[]{5, 3, 4, 3, 2}));
        students.add(new Student("Lina", 7, 2, new int[]{4, 4, 4, 5, 5}));
        students.add(new Student("Dasha", 8, 3, new int[]{5, 5, 5, 4}));

    }

}

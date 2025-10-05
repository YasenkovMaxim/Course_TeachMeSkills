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
        Student student = new Student("max", 10, 3, "3 6 4 8 8");
        System.out.println(student.averageScore());

    }

}

package DZ_15.Task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Main {
   // Задача 3:
   // Создать класс Student, содержащий следующие характеристики – имя, группа, курс,
   // оценки по предметам. Создать коллекцию, содержащую объекты класса Student.
   // Написать метод, который удаляет студентов со средним баллом <3. Если средний
   // балл>=3, студент переводится на следующий курс. Дополнительно написать метод
   // printStudents(List<Student> students, int course), который получает список студентов и
   // номер курса. А также печатает на консоль имена тех студентов из списка, которые
   // обучаются на данном курсе
    public static void removeStudentsWithLowAverage(List<Student> students) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getAverageGrade() < 3.0) {
                iterator.remove();
            } else {
                student.setCourse(student.getCourse() + 1);
            }
        }
    }
    public static void printStudents(List<Student> students, int course) {
        System.out.println("Студенты на курсе " + course + ":");
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Ivan", "1", 1, List.of(4.0, 3.5, 4.2)));
        students.add(new Student("Anna", "1", 1, List.of(2.0, 2.5, 3.0)));
        students.add(new Student("Max", "2", 2, List.of(3.5, 4.0, 3.8)));
        students.add(new Student("Olga", "2", 2, List.of(2.0, 2.5, 2.0)));
        removeStudentsWithLowAverage(students);
        printStudents(students, 2);
    }
}

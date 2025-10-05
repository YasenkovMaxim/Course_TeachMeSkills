package DZ_15.Task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Main {
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
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Ivan", "1", 1, List.of(4.0, 3.5, 4.2)));
        students.add(new Student("Anna", "1", 1, List.of(2.0, 2.5, 3.0)));
        students.add(new Student("Max", "2", 2, List.of(3.5, 4.0, 3.8)));
        students.add(new Student("Olga", "2", 2, List.of(2.0, 2.5, 2.0)));
        removeStudentsWithLowAverage(students);
        printStudents(students, 2);
    }
}

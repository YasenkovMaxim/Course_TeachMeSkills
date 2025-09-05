package Lesson7;

public class Main {
    public static void main(String[] args) {
        Parent parent = new Parent("Dima", 34, "doctor");
        parent.sayHello();
        Child child = new Child("Maxim", 6, 8);
        System.out.println(child.age + " " + child.name + " " + child.schoolGrade);
    }
}

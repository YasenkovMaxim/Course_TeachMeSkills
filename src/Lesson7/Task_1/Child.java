package Lesson7.Task_1;

public class Child extends Person {
    int schoolGrade;

    public Child(String name, int age, int schoolGrade) {
        super(name, age);
        this.schoolGrade = schoolGrade;
    }
}

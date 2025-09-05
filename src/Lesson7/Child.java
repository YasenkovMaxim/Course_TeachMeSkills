package Lesson7;

public class Child extends Person {
    int schoolGrade;

    public Child(String name, int age, int schoolGrade) {
        super(name, age);
        this.schoolGrade = schoolGrade;
    }
}

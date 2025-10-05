package DZ_15.Task3;


import DZ_13.Task1.Data;

public class Student {
    private String name;
    private int group;
    private int curse;
    private int[] grades;

    public Student(String name, int group, int curse, int[] grades) {
        this.name = name;
        this.group = group;
        this.curse = curse;
        this.grades = grades;
    }

    public double AverageGrade() {
        double sum = 0;
        for (int i = 0; i < grades.length; i++) {
            sum = sum + grades[i];
        }
        return sum / grades.length;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public int getCurse() {
        return curse;
    }

    public void setCurse(int curse) {
        this.curse = curse;
    }

    public int[] getGrades() {
        return grades;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }
}



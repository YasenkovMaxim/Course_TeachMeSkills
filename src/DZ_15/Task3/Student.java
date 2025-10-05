package DZ_15.Task3;

import java.util.ArrayList;

public class Student {
    private String name;
    private int group;
    private int curse;
    private String grades;
    private ArrayList<Integer> numbersGrades;

    public Student(String name, int group, int curse, String grades) {
        this.name = name;
        this.group = group;
        this.curse = curse;
        this.grades = grades;
        this.numbersGrades = new ArrayList<>();
        grades = grades.replaceAll("\\s", "");
        char[] numbers = grades.toCharArray();
        for (char number : numbers) {
            int num = number - '0';
            numbersGrades.add(num);
        }
    }

    public double averageScore() {
        double averageScore = 0;
        int summ = 0;
        for (int i = 0; i < numbersGrades.size(); i++) {
            summ = summ + numbersGrades.get(i);
        }
        averageScore = summ / numbersGrades.size();
        return averageScore;
    }
}

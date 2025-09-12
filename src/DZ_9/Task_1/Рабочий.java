package DZ_9.Task_1;

public class Рабочий implements jobTitleable{
    String jobTitle;

    public Рабочий(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    @Override
    public void printJobTitle() {
        System.out.println(jobTitle);
    }
}

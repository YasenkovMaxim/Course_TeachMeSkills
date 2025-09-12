package DZ_9.Task_1;

public class Бухгалтер implements jobTitleable {
    String jobTitle;

    public Бухгалтер(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    @Override
    public void printJobTitle() {
        System.out.println(jobTitle);
    }
}

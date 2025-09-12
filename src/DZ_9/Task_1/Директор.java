package DZ_9.Task_1;

public class Директор implements jobTitleable{
    String jobTitle;

    public Директор(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    @Override
    public void printJobTitle() {
        System.out.println(jobTitle);
    }
}

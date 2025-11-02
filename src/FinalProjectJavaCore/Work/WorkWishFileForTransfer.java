package FinalProjectJavaCore.Work;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WorkWishFileForTransfer {
    private String file;
    private String search;
    private String firstAccountNumber;
    private String secondAccountNumber;
    private Integer sum;


    public WorkWishFileForTransfer(String search) {
        this.search = search;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public void fileUpload() {
        StringBuilder sb = new StringBuilder();
        try (FileReader fileReader = new FileReader(search)) {
            int i = 0;
            while ((i = fileReader.read()) != -1) {
                sb.append((char) i);
            }
        } catch (IOException e) {
            System.out.println("Exception: " + e);
        }
        file = sb.toString();
    }

    public void deleteFile() {
        File file = new File(search);
        file.delete();
    }

    public String fromAccountNumber() {
        Pattern pattern = Pattern.compile("\\d{5}[-]\\d{5}");
        Matcher matcher = pattern.matcher(file);
        if (matcher.find()) {
            firstAccountNumber = matcher.group();
        }
        return firstAccountNumber;
    }

    public String inAccountNumber() {
        Pattern pattern = Pattern.compile("\\d{5}[-]\\d{5}");
        Matcher matcher = pattern.matcher(file);
        while (matcher.find()) {
            secondAccountNumber = matcher.group();
            if (secondAccountNumber.equals(firstAccountNumber)) {
                secondAccountNumber = null;
            }
        }
        return secondAccountNumber;
    }

    public Integer accountSum() {
        Pattern pattern = Pattern.compile("\\s(\\d+)\\s");
        Matcher matcher = pattern.matcher(file);
        while (matcher.find()) {
            String sumStr = matcher.group(1);
            sum = Integer.parseInt(sumStr);
        }
        return sum;
    }

    public void addFileInArchive() {
        try (FileWriter fileWriter = new FileWriter("archive\\one.txt")) {
            fileWriter.write(file);
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }
}

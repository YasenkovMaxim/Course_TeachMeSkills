package FinalProjectJavaCore.Work;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WorkWishDataBase {
    private String file;
    String search;

    public WorkWishDataBase(String search) {
        this.search = search;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
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

    public HashMap savingAccountNumbersAndSumsToCollection() {
        HashMap<String, Integer> accountNumberAndSum = new HashMap<>();
        Pattern pattern = Pattern.compile("(\\d{5}[-]\\d{5}).+\\s(\\d+)\\s");
        Matcher matcher = pattern.matcher(file);
        while (matcher.find()) {
            String accountNumber = matcher.group(1);
            String sumStr = matcher.group(2);
            Integer sum = Integer.parseInt(sumStr);
            accountNumberAndSum.put(accountNumber, sum);
        }
        for (String key : accountNumberAndSum.keySet()) {
            System.out.println("Счет: " + key + ", сумма: " + accountNumberAndSum.get(key));
        }
        return accountNumberAndSum;
    }

}

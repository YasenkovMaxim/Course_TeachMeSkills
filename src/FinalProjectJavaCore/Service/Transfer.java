package FinalProjectJavaCore.Service;

import java.util.ArrayList;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Transfer {

    public static ArrayList<String> accountToArrayList(String file) {
        Pattern pattern = Pattern.compile("\\d{5}-\\d{5}");
        Matcher matcher = pattern.matcher(file);
        ArrayList<String> accounts = new ArrayList<>();
        while (matcher.find()) {
            String account = matcher.group();
            accounts.add(account);
        }
        return accounts;
    }
}

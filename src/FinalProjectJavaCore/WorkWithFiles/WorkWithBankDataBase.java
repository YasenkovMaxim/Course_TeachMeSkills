package FinalProjectJavaCore.WorkWithFiles;

import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WorkWithBankDataBase {
    static Map<String, Integer> collectionAccountsAndAmount = new HashMap<>();

    public static Map<String, Integer> getCollectionAccountsAndAmount() {
        return collectionAccountsAndAmount;
    }

    public static void setCollectionAccountsAndAmount(Map<String, Integer> collectionAccountsAndAmount) {
        WorkWithBankDataBase.collectionAccountsAndAmount = collectionAccountsAndAmount;
    }

    public static void parseAccount() {
        StringBuilder sb = new StringBuilder();
        try (FileReader fr = new FileReader("BankDataBase.txt")) {
            int i = 0;
            while ((i = fr.read()) != -1) {
                sb.append((char) i);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        String accountAndAmount = sb.toString();
        Pattern pattern = Pattern.compile("(\\d{5}-\\d{5}).+сумма:\\s(\\d+)");
        Matcher matcher = pattern.matcher(accountAndAmount);
        while (matcher.find()) {
            String account = matcher.group(1);
            Integer amount = Integer.parseInt(matcher.group(2));
            collectionAccountsAndAmount.put(account, amount);
        }
        System.out.println(collectionAccountsAndAmount);
    }
}

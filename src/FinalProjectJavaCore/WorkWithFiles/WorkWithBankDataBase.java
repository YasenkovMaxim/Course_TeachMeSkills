package FinalProjectJavaCore.WorkWithFiles;

import FinalProjectJavaCore.ClassesForWork.Transfer;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WorkWithBankDataBase {
   private static Map<String, Integer> collectionAccountsAndAmount = new HashMap<>();

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

    public static void executionTranslation (Map<String, Integer> collectionAccountsAndAmount, List<Transfer> transfers) {
        for (Transfer transfer : transfers) {
            String fromAccount = transfer.getAccountFrom();
            String toAccount = transfer.getAccountTo();
            int amount = transfer.getAmount();

            if (!collectionAccountsAndAmount.containsKey(fromAccount)) {
                System.out.println("Счет не найден: " + fromAccount);
                continue;
            }
            if (!collectionAccountsAndAmount.containsKey(toAccount)) {
                System.out.println("Счет не найден: " + toAccount);
                continue;
            }

            int fromBalance = collectionAccountsAndAmount.get(fromAccount);
            int toBalance = collectionAccountsAndAmount.get(toAccount);
            if (fromBalance < amount) {
                System.out.println("Недостаточно средств на счете: " + fromAccount);
                continue;
            }
            collectionAccountsAndAmount.put(fromAccount, fromBalance - amount);
            collectionAccountsAndAmount.put(toAccount, toBalance + amount);
        }

        try (FileWriter fileWriter = new FileWriter("BankDataBase.txt")) {
            int count = 1;
            for (Map.Entry<String, Integer> entry : collectionAccountsAndAmount.entrySet()) {
                String account = entry.getKey();
                int balance = entry.getValue();
                fileWriter.write(String.format("%d) номер счета: %s. сумма: %d BYN.\n", count++, account, balance));
            }
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
        }
    }
}


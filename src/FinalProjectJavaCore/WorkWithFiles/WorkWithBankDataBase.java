package FinalProjectJavaCore.WorkWithFiles;

import FinalProjectJavaCore.ClassesForWork.ReportFile;
import FinalProjectJavaCore.ClassesForWork.Transfer;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WorkWithBankDataBase {
    private static Map<String, Integer> collectionAccountsAndAmount = new HashMap<>();
    private static String dataTransfer;

    public static String getDataTransfer() {
        return dataTransfer;
    }

    public static void setDataTransfer(String dataTransfer) {
        WorkWithBankDataBase.dataTransfer = dataTransfer;
    }

    public static Map<String, Integer> getCollectionAccountsAndAmount() {
        return collectionAccountsAndAmount;
    }

    public static void setCollectionAccountsAndAmount(Map<String, Integer> collectionAccountsAndAmount) {
        WorkWithBankDataBase.collectionAccountsAndAmount = collectionAccountsAndAmount;
    }

    public static void parseAccount() {
        StringBuilder sb = new StringBuilder();
        File file = new File("BankDataBase.txt");
        if (!file.exists()) {
            System.out.println("Файл не найден: ");
            return;
        }
        try (FileReader fr = new FileReader("BankDataBase.txt")) {
            int i = 0;
            while ((i = fr.read()) != -1) {
                sb.append((char) i);
            }
        } catch (Exception e) {
            System.out.println("Ошибка при чтении файла: " + e);
        }
        String accountAndAmount = sb.toString();
        if (accountAndAmount.isEmpty()) {
            System.out.println("Файл пуст");
            return;
        }
        Pattern pattern = Pattern.compile("(\\d{5}-\\d{5}).+сумма:\\s(\\d+)");
        Matcher matcher = pattern.matcher(accountAndAmount);
        while (matcher.find()) {
            String account = matcher.group(1);
            Integer amount = Integer.parseInt(matcher.group(2));
            collectionAccountsAndAmount.put(account, amount);
        }
    }

    public static void executionTranslation(Map<String, Integer> collectionAccountsAndAmount, List<Transfer> transfers) throws IOException {
        for (Transfer transfer : transfers) {
            String fromAccount = transfer.getAccountFrom();
            String toAccount = transfer.getAccountTo();
            int amount = transfer.getAmount();
            String status = transfer.getStatus();
            String faiureReason = transfer.getFailureReason();
            dataTransfer = LocalDateTime.now().toString();

            if (!collectionAccountsAndAmount.containsKey(fromAccount)) {
                faiureReason = "Не найден счет: " + fromAccount;
                status = "Ошибка";
                ReportFile.report(dataTransfer, WorkWithInputFile.getFileName(), fromAccount, toAccount, amount,
                        status, faiureReason);
                continue;
            }
            if (!collectionAccountsAndAmount.containsKey(toAccount)) {
                faiureReason = "Не найден счет: " + fromAccount;
                status = "Ошибка";
                ReportFile.report(dataTransfer, WorkWithInputFile.getFileName(), fromAccount, toAccount, amount,
                        status, faiureReason);
                continue;
            }
            int fromBalance = collectionAccountsAndAmount.get(fromAccount);
            int toBalance = collectionAccountsAndAmount.get(toAccount);
            if (fromBalance < amount) {
                faiureReason = "Недостаточно средств на счете: " + fromAccount;
                status = "Ошибка";
                ReportFile.report(dataTransfer, WorkWithInputFile.getFileName(), fromAccount, toAccount, amount,
                        status, faiureReason);
                continue;
            }
            if (amount <= 0) {
                faiureReason = "Отрицательная сумма не может быть переведена ";
                status = "Ошибка";
                ReportFile.report(dataTransfer, WorkWithInputFile.getFileName(), fromAccount, toAccount, amount,
                        status, faiureReason);
                continue;
            }
            collectionAccountsAndAmount.put(fromAccount, fromBalance - amount);
            collectionAccountsAndAmount.put(toAccount, toBalance + amount);

            faiureReason = " - ";
            status = "Успешно ";
            ReportFile.report(dataTransfer, WorkWithInputFile.getFileName(), fromAccount, toAccount, amount,
                    status, faiureReason);
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


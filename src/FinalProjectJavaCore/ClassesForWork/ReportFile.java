package FinalProjectJavaCore.ClassesForWork;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class ReportFile {
    public static void report(String dataTransfer, String fileName, List<Transfer> transfers) {
        for (Transfer transfer : transfers) {
            String fromAccount = transfer.getAccountFrom();
            String toAccount = transfer.getAccountTo();
            int amount = transfer.getAmount();
            String reportString = dataTransfer + " | " + fileName + " | перевод с " + fromAccount + " на " +
                    toAccount + " " + amount + "BYN успешно обработан";
            System.out.println(reportString);
            try (FileWriter fw = new FileWriter("reportFile.txt", true)) {
                fw.write(reportString + "\n");
            } catch (IOException e) {
                System.out.println("Ошибка при записи в файл отчета: " + e.getMessage());
            };
        }
    }
}

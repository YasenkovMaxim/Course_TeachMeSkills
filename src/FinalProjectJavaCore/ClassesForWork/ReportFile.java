package FinalProjectJavaCore.ClassesForWork;

import java.io.FileWriter;
import java.io.IOException;

public class ReportFile {
    public static void report(String dataTransfer, String fileName, String fromAccount, String toAccount, int amount,
                              String status, String failureReason) throws IOException {
            try (FileWriter fw = new FileWriter("reportFile.txt", true)) {
                    String reportString = "Дата и время операции: " + dataTransfer + "\n|"
                            + fileName + " | перевод с " + fromAccount + " на " +
                            toAccount + ". " + amount + " BYN" + "\n" + status + " Причина: " + failureReason;
                    System.out.println(reportString);
                    fw.write(reportString + "\n\n");
                }
            }
        }


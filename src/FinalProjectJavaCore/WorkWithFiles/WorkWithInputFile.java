package FinalProjectJavaCore.WorkWithFiles;

import FinalProjectJavaCore.ClassesForWork.Transfer;

import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WorkWithInputFile {
    private static List<Transfer> transfers = new ArrayList<>();
    private static String fileName;

    public static String getFileName() {
        return fileName;
    }

    public static void setFileName(String fileName) {
        WorkWithInputFile.fileName = fileName;
    }

    public static List<Transfer> getTransfers() {
        return transfers;
    }

    public static void setTransfers(List<Transfer> transfers) {
        WorkWithInputFile.transfers = transfers;
    }

    public static List<Transfer> parseFilesFromInput() {
        File inputFrom = new File("input");
        if (!inputFrom.exists()) {
            System.out.println("Папка пустая");
            return transfers;
        }
        File[] files = inputFrom.listFiles((dir, name) -> name.endsWith(".txt"));
        StringBuilder sb = new StringBuilder();
        for (File file : files) {
            fileName = file.getName();
            try (FileReader fr = new FileReader(file)) {
                int i = 0;
                while ((i = fr.read()) != -1) {
                    sb.append((char) i);
                }
            } catch (Exception e) {
                System.out.println("Ошибка при чтении файла: " + e);
            }
        }
        String inputString = sb.toString();
        System.out.println(inputString);
        Pattern pattern = Pattern.compile("(\\d{5}-\\d{5})\\s*.*?(\\d{5}-\\d{5})\\s*.*?(\\d+)\\s*BYN", Pattern.DOTALL);
        Matcher matcher = pattern.matcher(inputString);
        while (matcher.find()) {
            String accountFrom = matcher.group(1);
            String accountTo = matcher.group(2);
            int amount = Integer.parseInt(matcher.group(3));
            String status = "не определено";
            String failureReason = null;
            Transfer transfer = new Transfer(accountFrom, accountTo, amount, status, failureReason);
            transfers.add(transfer);
        }
        System.out.println(Arrays.toString(transfers.toArray()));
        return transfers;
    }

    public static void moveFileFromInputToArchive() {
        File inputFolder = new File("input");
        File archiveFolder = new File("archive");
        if (!inputFolder.exists() || !archiveFolder.exists()) {
            System.out.println("Папки не существуют");
            return;
        }
        File[] files = inputFolder.listFiles((dir, name) -> name.endsWith(".txt"));
        if (files == null) {
            System.out.println("Файлы не найдены или не удалось прочитать папку");
            return;
        }

        for (File file : files) {
            File targetFile = new File(archiveFolder, file.getName());
            boolean success = file.renameTo(targetFile);
            if (!success) {
                System.out.println("Не удалось переместить файл: " + file.getName());
            }
        }
    }

}

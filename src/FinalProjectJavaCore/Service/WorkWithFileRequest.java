package FinalProjectJavaCore.Service;

import java.io.File;
import java.io.FileReader;

public class WorkWithFileRequest {

    public static String filesRequestToString() {
        File file = new File("input");
        File[] files = file.listFiles((dir, name) -> name.endsWith(".txt"));
        StringBuilder sb = new StringBuilder();
        for (File f : files) {
            try (FileReader fileReader = new FileReader(f)) {
                int i = 0;
                while ((i = fileReader.read()) != -1) {
                    sb.append((char) i);
                }
            } catch (Exception e) {
                System.out.println("Exception: " + e);
            }
        }
        return sb.toString();
    }

}

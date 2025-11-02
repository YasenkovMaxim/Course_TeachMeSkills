package FinalProjectJavaCore.Service;

import java.io.FileReader;
import java.io.IOException;

public class WorkWishFiles {


    public static String fileBankDataBaseInToString(String way) {
        StringBuilder sb = new StringBuilder();
        try (FileReader fileReader = new FileReader(way)) {
            int i = 0;
            while ((i = fileReader.read()) != -1) {
                sb.append((char) i);
            }
        } catch (IOException e) {
            System.out.println("Exception: " + e);
        }
        return sb.toString();
    }


}

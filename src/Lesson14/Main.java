package Lesson14;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalTime;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(LocalTime.now());
        File file = new File("C:\\Games\\dog.jpg");
        File newFile = new File("C:\\Games\\my\\dog.jpg");

        System.out.println(file.exists());
        byte[] dog = new byte[(int) file.length()];
        int index = 0;
        try (FileInputStream fis = new FileInputStream(file)) {
            int i;
            while ((i = fis.read()) != -1) {
                dog[index++] = (byte) i;
            }
        } catch (IOException e) {
            System.out.println("Exception: " + e);
        }
        try (FileOutputStream fos = new FileOutputStream(newFile)) {
            fos.write(dog);
        } catch (IOException e){
            System.out.println("Exception: " + e);
        }
        System.out.println(LocalTime.now());
    }
}

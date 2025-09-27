package Lesson13;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Practis_4 {
    public static void main(String[] args) {
        // создать объект класса Student сериализовать и десериализовать его.
        Student student = new Student("Maxim");
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Games\\tms.txt"))) {
            oos.writeObject(student);
        } catch (IOException e) {
            System.out.println("Exception: " + e);
        }
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Games\\tms.txt"))) {
           Student student2 =(Student) ois.readObject();
            System.out.println(student2.getName());
        } catch (IOException e) {
            System.out.println("Exception: " + e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}

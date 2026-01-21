package service;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileService {

    public static <T> void saveToFile(List<T> data, String filePath) {
        try (ObjectOutputStream oos =
                     new ObjectOutputStream(new FileOutputStream(filePath))) {

            oos.writeObject(data);

        } catch (IOException e) {
            System.out.println("Error saving data: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    public static <T> List<T> loadFromFile(String filePath) {
        File file = new File(filePath);

        if (!file.exists()) {
            return new ArrayList<>();
        }

        try (ObjectInputStream ois =
                     new ObjectInputStream(new FileInputStream(filePath))) {

            return (List<T>) ois.readObject();

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error loading data: " + e.getMessage());
            return new ArrayList<>();
        }
    }
}

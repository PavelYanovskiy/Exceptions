package Lesson_2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DivisionException {
    public class CheckedExample {
    public static void main(String[] args) {
        try {
            try (FileInputStream file = new FileInputStream("nonexistent.txt")) {
            } catch (FileNotFoundException e) {
                throw e;
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}
}

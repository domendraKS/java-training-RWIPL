// package Day5.Package;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {
    public static void main(String[] args) {
        try {
            File fr = new File("D:\\Railworld India\\Backend --JAVA\\Day5\\Package\\Test.txt");
            Scanner sc = new Scanner(fr);

            while (sc.hasNextLine()) {
                System.out.println(sc.hasNextLine());
                System.out.println(sc.nextLine());
                System.out.println(sc.hasNextLine());
            }

            sc.close(); // Don't forget to close the Scanner to release resources.
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        }
    }
}

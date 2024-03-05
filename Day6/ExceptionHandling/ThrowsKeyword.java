import java.io.*;

class ReadAndWrite {
    void fileRead() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("d://xyz.txt");
        System.out.println(fis);
        // statements
    }

    void saveFile() throws FileNotFoundException {
        String text = "I am Shubham Sahu";
        FileOutputStream fis = new FileOutputStream("d://xyz.txt");
        // statements
    }
}

public class ThrowsKeyword {
    public static void main(String[] args) {
        ReadAndWrite rw = new ReadAndWrite();
        try {
            rw.fileRead();
        } catch (FileNotFoundException fnfe) {
            // System.out.println(fnfe);
            fnfe.printStackTrace();
        }
        try {
            rw.saveFile();
        } catch (FileNotFoundException fnfe) {
            // System.out.println(fnfe);
            fnfe.printStackTrace();
        }
    }
}

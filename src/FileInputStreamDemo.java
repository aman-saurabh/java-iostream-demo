import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class FileInputStreamDemo {
    public static void main(String[] args) {
        try {
            FileInputStream fis1 = new FileInputStream("/home/aman/Desktop/test.txt");
            FileInputStream fis2 = new FileInputStream("/home/aman/Desktop/test2.txt");
            SequenceInputStream sis = new SequenceInputStream(fis1, fis2);
            int i = sis.read();
            String s = "";
            while (i != -1) {
                s = s + ((char) i);
                i = sis.read();
            }
            System.out.println(s);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

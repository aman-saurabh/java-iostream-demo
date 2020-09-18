import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerDemo2 {
    public static void main(String[] args) throws FileNotFoundException {
        String s = "Hello, This is Aman.\nThis is my second line.\nAnd this one is third line.";

        //To read data from the given string
        Scanner scan = new Scanner(s);
        System.out.println("Content of given string is as follows : ");
        while (scan.hasNext()) {
            System.out.println(scan.nextLine());
        }
        scan.close();

        //To read data from the given file
        Scanner scanFile = new Scanner(new File("/home/aman/Desktop/test.txt"));
        System.out.println("\nAnd Content of given file is as follows : ");
        while (scanFile.hasNext()) {
            System.out.println(scanFile.nextLine());
        }
        scanFile.close();
    }
}

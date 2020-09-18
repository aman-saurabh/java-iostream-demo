import java.io.*;

public class PrintStreamDemo2 {
    public static void main(String[] args) {
        try {
            PrintStream ps = new PrintStream("/home/aman/Desktop/test.txt");
            ps.println("Hello World!");
            ps.println("This is printstream second line.");
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

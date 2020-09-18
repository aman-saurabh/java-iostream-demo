import java.io.*;

public class PrintWriterDemo2 {
    public static void main(String[] args) {
        try{
            PrintWriter pw = new PrintWriter("/home/aman/Desktop/test.txt");
            pw.println("Hello World!");
            pw.println("This is second line.");
            pw.flush();
            pw.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}

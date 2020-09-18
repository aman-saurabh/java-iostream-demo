import java.io.*;

public class PrintWriterDemo1 {
    public static void main(String[] args) {
        try{
            PrintWriter pw = new PrintWriter(System.out);
            pw.println("Hello World");
            pw.flush();
            pw.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}

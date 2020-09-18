import java.io.*;

public class PrintStreamDemo1 {
    public static void main(String[] args) {
        try{
            PrintStream ps = new PrintStream(System.out);
            ps.println("Hello World!");
            ps.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}

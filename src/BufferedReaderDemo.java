import java.io.*;

public class BufferedReaderDemo {
    public static void main(String[] args) {
        try{
            FileReader fr = new FileReader("/home/aman/Desktop/test.txt");
            BufferedReader br = new BufferedReader(fr);
            String str = "";
            String s = br.readLine();
            while (s != "" && s !=null){
                str +=  s+'\n';
                s = br.readLine();
            }
            System.out.println(str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

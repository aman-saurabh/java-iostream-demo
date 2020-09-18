import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
    public static void main(String[] args) {
        String s = "This is a test string.";
        byte[] b = s.getBytes();
        try {
            FileOutputStream fos1 = new FileOutputStream("/home/aman/Desktop/test.txt");
            // Writing using write(int singleByte) method
            for (int i: b){
                fos1.write(i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try{
            FileOutputStream fos2 = new FileOutputStream("/home/aman/Desktop/test2.txt");
            //Writing using write(byte[] b) method
            fos2.write(b);
            //Both methods are writing same thing in a file.But as we can see writing using second method is more simple.
        } catch (IOException e ){
            e.printStackTrace();
        }

    }
}
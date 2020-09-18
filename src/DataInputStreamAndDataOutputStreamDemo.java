import java.io.*;

public class DataInputStreamAndDataOutputStreamDemo {
    public static void main(String[] args) {
        try {
            DataOutputStream dout = new DataOutputStream(new FileOutputStream("/home/aman/Desktop/test.txt"));
            dout.writeDouble(1.1);
            dout.writeInt(55);
            dout.writeBoolean(true);
            dout.writeChar('a');
            dout.writeChar('b');
            dout.writeUTF("Hello");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            DataInputStream din = new DataInputStream(new FileInputStream("/home/aman/Desktop/test.txt"));
            double a = din.readDouble();
            int b = din.readInt();
            boolean c = din.readBoolean();
            char d = din.readChar();
            char e = din.readChar();
            String f = din.readUTF();
            System.out.println("Values : "+a+", "+b+", "+c+", "+d+", "+e+", "+f);
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}

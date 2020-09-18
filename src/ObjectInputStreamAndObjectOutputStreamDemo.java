import java.io.*;

public class ObjectInputStreamAndObjectOutputStreamDemo {
    public static void main(String[] args) {
        try{
            int i = 10;
            Test t = new Test();
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("/home/aman/Desktop/test.txt"));
            oos.writeInt(i);
            oos.writeObject(t);
        } catch (IOException e){
            e.printStackTrace();
        }

        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("/home/aman/Desktop/test.txt"));
            int a = ois.readInt();
            Test b = (Test) ois.readObject();
            System.out.println("Number : "+b.num);
            System.out.println(b.sayHello());
            System.out.println("Integer Value that was written directly : "+a);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

class Test implements Serializable {
    int num = 5;
    String name = "Aman";
    public String sayHello(){
        return "Hello " + name;
    }
}
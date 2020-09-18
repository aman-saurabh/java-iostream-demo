import java.util.Scanner;
public class ScannerDemo1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name;
        int age;
        double sal;

        System.out.print("Enter your name: ");
        name = in.next();

        System.out.print("Enter your age: ");
        age = in.nextInt();

        System.out.print("Enter your salary: ");
        sal = in.nextDouble();

        System.out.println("Your Details :-");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + sal);

        in.close();
    }
}

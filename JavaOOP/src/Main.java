import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Student Name: ");
        String name = sc.next();
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        System.out.print("Enter your I.D. Number: ");
        String idNo = sc.next();

        Student student = new Student(name, age, idNo);

        System.out.println("--OUTPUT--");
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("I.D. No.: " + student.getIdNo());
    }
}

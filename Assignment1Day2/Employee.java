import java.util.Scanner;
class EmployeeDetails {
    int age;
    String city;
    String name;
    void display()
    {
        System.out.println("The name of the employee is"+name);
        System.out.println("The age is "+age);
        System.out.println("city);
    }
}
public class Employee {

    public static void main(String[] args) {
        EmployeeDetails e1= new EmployeeDetails();
        Scanner input= new Scanner(System.in);
        System.out.println("enter the name: ");
        e1.name=input.next();
        int a = input.nextInt();
        input.nextLine();
        System.out.println("enter the name1: ");
        String b= input.next();
        System.out.println(b);
        input.nextLine();
        System.out.println("enter the name2: ");
        String c= input.nextLine();
        System.out.println(c);
        System.out.println("enter the char: ");
        char d= input.next().charAt(0);
        e1.age=18;
        e1.city="eluru";
        EmployeeDetails e2= new EmployeeDetails();
        e2.name="manohar";
        e2.age=18;
        e2.city="eluru";
        e1.display();
        e2.display();
    }
}

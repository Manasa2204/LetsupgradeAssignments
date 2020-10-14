class EmployeeDetails {
    int age;
    String city;
    String name;
    void display()
    {
        System.out.println("The name of the employee is "+name);
        System.out.println("The age is "+age);
        System.out.println("The city is "+city);
    }
}
public class Employee {

    public static void main(String[] args) {
        EmployeeDetails e1= new EmployeeDetails();
        e1.name="Manasa";
        e1.age=18;
        e1.city="eluru";
        EmployeeDetails e2= new EmployeeDetails();
        e2.name="Manohar";
        e2.age=18;
        e2.city="eluru";
        e1.display();
        e2.display();
    }
}

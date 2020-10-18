import java.util.Scanner;
class Details
{
    String name;
    int dob,mob,yob,monthly_salary,tax,age,annual_salary;
    void display()
    {
        System.out.println("Hello, " +name+ ", Your age is " + age + " with annual salary " +annual_salary+ " and Tax amount to be paid is "+ tax);
    }
}
public class Employee_tax {

    public static void main(String[] args)
    {
        Details emp= new Details();
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter Your name");
        emp.name=sc.nextLine();

        System.out.println("Enter Your Day of birth");
        emp.dob=sc.nextInt();

        System.out.println("Enter Your Month of birth in number from 1 to 12");
        emp.mob=sc.nextInt();

        System.out.println("Enter Your Year of birth in number");
        emp.yob=sc.nextInt();

        System.out.println("Enter Your Monthly Salary");
        emp.monthly_salary =sc.nextInt();
        emp.age = 2020-emp.yob;
        emp.annual_salary = (emp.monthly_salary * 12);
        if(emp.annual_salary >=500000) {
            emp.tax= (emp.annual_salary * 20) / 100;
            emp.display();
        }
        else if(emp.annual_salary >=400000) {
            emp.tax= (emp.annual_salary * 15) / 100;
            emp.display();
        }
        else if(emp.annual_salary >=300000) {
            emp.tax= (emp.annual_salary * 10) / 100;
            emp.display();
        }
        else if(emp.annual_salary >=200000) {
            emp.tax= (emp.annual_salary * 5) / 100;
            emp.display();
        }
        else {
            System.out.println("Hello, " +emp.name+ " , Your age is " + emp.age + ", annual salary is " +emp.annual_salary+ ", and Tax is not need to pay");
        }
    }

}
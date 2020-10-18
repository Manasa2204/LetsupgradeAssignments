import java.util.Scanner;
public class Avenger {
        String name,weapon,power,planet;
        int age;
        void getDetails()
        {
            Scanner input= new Scanner(System.in);
            System.out.println("Enter name: ");
            name=input.nextLine();

            System.out.println("Enter the weapon: ");
            weapon=input.nextLine();

            System.out.println("Enter power: ");
            power=input.nextLine();

            System.out.println("Enter planet: ");
            planet=input.nextLine();

            System.out.println("Enter age: ");
            age=input.nextInt();

        }
        void displayDetails() {
            System.out.println("Welcome " + name + ", your power is " + power + " with weapon " + weapon + " and you are from " + planet + ".");
        }
        public static void main(String args[])
        {
            Avenger[] avenger= new Avenger[5];
            for(int i=0;i<5;i++)
            {
                System.out.println("enter the details of avenger["+i+"]: ");
                avenger[i] = new Avenger();
                avenger[i].getDetails();
            }
            for(int i=0;i<5;i++)
            {
                avenger[i].displayDetails();
            }
        }
}


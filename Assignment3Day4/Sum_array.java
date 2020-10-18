import java.util.Scanner;
public class Sum_array {
public static void main(String args[])
{
    int arr[]=new int[5],sum=0;
    Scanner input =new Scanner(System.in);
    System.out.println("<enter the elements>");
    for(int i=0;i<5;i++)
    {
        System.out.print("Enter the value of the element in index "+i+" is ");
        arr[i]=input.nextInt();
        sum=sum+arr[i];
    }
    System.out.println("The sum of the elements in the array is "+sum);
}
}

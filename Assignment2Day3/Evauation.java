import java.sql.SQLOutput;
import java.util.Scanner;
class Evaluation
{
    public static void main(String args[])
    {
        float s1_marks, s2_marks, s3_marks, s4_marks, s5_marks;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 5 subject marks:");
        s1_marks=input.nextFloat();
        s2_marks= input.nextFloat();
        s3_marks= input.nextFloat();
        s4_marks= input.nextFloat();
        s5_marks= input.nextFloat();
        float percentage=(s1_marks+s2_marks+s3_marks+s4_marks+s5_marks)/5;
        if(percentage>85)
            System.out.println("You obtained a grade of A with percentage "+percentage);
        else if(percentage>75)
            System.out.println("You obtained a grade of B with percentage \"+percentage");
        else if(percentage>65)
            System.out.println("You obtained a grade of C with percentage \"+percentage");
        else if(percentage>55)
            System.out.println("You obtained a grade of D with percentage \"+percentage");
        else
            System.out.println("You are failed! Better luck next time.");
    }
}
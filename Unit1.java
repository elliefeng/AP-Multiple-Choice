import java.util.*;

public class Unit1
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("\u000c");
        
        //question 1
        System.out.println("1.Which of the following arithmetic expressions evaluates to 1?");
        System.out.println("I.2/5%3\nII.2/(5%3)\nIII.2/5+1");
        System.out.println("Answers\nI." + 2/5%3 + ", 2/5%3 is 2/5=0 then mod 3 which equals 3");
        System.out.println("II. "+2/(5%3)+", 5%3 is 2 and 2/2=1");
        System.out.println("III. "+2/5+1+", 2/5 is 0 and 0+1=1");
        
        //question 2
        double d = 0.25;
        int i = 3;
        double diff = d-i;
        System.out.println("\n2.Given double d = 0.25,int i = 3,double diff = d-i");
        System.out.println("What is (int)diff - 0.5?");
        System.out.println((int)diff-0.5);
        System.out.println("diff is 0.25-3=-2.75, cast to int it is truncated to -2, subtract 0.5 is -2.5");
        
        //question 3
        double fact1 = 1/2;
        double fact2 = 3*4;
        double product = fact1*fact2;
        System.out.println("\n3.Given double fact1=1/2, double fact2=3*4, double product = fact1*fact2, why isn't product 6.0?");
        System.out.println("1/2 computes to 0 because 1 and 2 are both int types so we must cast either 1 or 2 to double");
    }
}
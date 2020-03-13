import java.util.*;

public class Unit3Q3
{
    public static void method1(int x, int y){
        int result = 0;
        if (x>y){
            result = x-y;
            System.out.print(result);
        }
        else if (x<y){
            result = y-x;
            System.out.print(result);
        }
        else{
            System.out.print(result);
        }
    }
    
    public static void method2(int x, int y){
        if (x<y){
            System.out.print(y-x);
        }
        else{
            System.out.print(x-y);
        }
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("\u000c");
        System.out.println("Please enter x");
        int x = sc.nextInt();
        System.out.println("Please enter y");
        int y = sc.nextInt();
        System.out.print("Method 1: " );
        method1(x,y);
        System.out.print("Method 2: " );
        method2(x,y);
    }
    
    //for all values of x and y the two methods print the same thing
    //when x>y both method1 and method2 print x-y
    //when x<y both method1 and method2 print y-x
    //when x<y both method1 and method2 print 0
    
}
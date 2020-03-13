public class Unit4Q14
{
    public static void method1(){
        for (int j = 0; j < 4; j++)
        {
            for (int k = 0; k < j; k++)
               {
                 System.out.println("hello");
               }
        }
    }
    
    public static void method2(){
        for (int j = 0; j < 4; j++)
        {
            for (int k = j; k < 4; k++)
               {
                 System.out.println("hello");
               }
        }
    }
    
    public static void main(String[] args){
        System.out.println("Method 1: ");
        method1();
        System.out.println("Method 2: "); 
        method2();
    }
}
//method 1
//in method 1, the outer loop is executed 4 times for j=0,1,2,3
//the inner loop is executed j times for each value of j 
//hello is printed 0+1+2+3=6 times

//method2
//in method 2, it's different
//when j is 0, inner executes 4 times
//when j is 1, inner executes 3 times
//when j is 2, inner executes 2 times
//when j is 3, inner executes 1 time
//hello is printed 4+3+2+1=10 times

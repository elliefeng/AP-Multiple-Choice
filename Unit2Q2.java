public class Unit2Q2
{
   public static void main(String[]args){
       int val = (int) (Math.random() * 4 + 1);
       val*=2;
       System.out.println("We want to print one of the values 2,4,6,or 8 with equal probability");
       System.out.println("int val = (int) (Math.random() * 4 + 1)");
       System.out.println("val*=2;");
       System.out.print("val = " + val);
       
       System.out.println("(int) (Math.random() * 4 + 1= "+(int) (Math.random() * 4 + 1));
       System.out.println("Math.random() returns a random double a where 0<=a<1");
       System.out.println("Multiplying a by 4 means 0<=a<4 where a can only be then adding 1 means 1<=a<5");
       System.out.println("Casting a to an int means a can only be 1,2,3 or 4");
       System.out.println("Multiplying everything by 2 means a can only be 2,4,6,or 8");
   }
}
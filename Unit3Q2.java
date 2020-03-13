public class Unit3Q2
{
   public static void main(String[]args){
       String first = new String("duck");
       String second = new String("duck");
       String third = new String("goose");
       if (first==second){
           System.out.print("A");
       }
       else if (second==third){
           System.out.print("B");
       }
       else if (first.equals(second)){
           System.out.print("C");
       }
       else if (second.equals(third)){
           System.out.print("D");
       }
       else{
           System.out.print("E");
       }
   }
   
   //the 1st and 2nd if statement are false because == compares object references not content and first is not equal to second or third
   //the third condition is true because .equals compare content and both Strings have "duck"
   //so C is printed
}
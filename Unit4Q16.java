public class Unit4Q16
{
    public static void main(String[] args){
        int a = 100;
        while (a > 1)
        {
            System.out.println("$");
            a /= 2;
        }
    }
}
//the body of the while loop executes 6 times
//a goes from 100 to 50 to 25 to 12 to 6 to 3 to 1 and the body of the while loop doesn't execute when a is 1
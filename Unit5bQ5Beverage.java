public class Unit5bQ5Beverage
{
    private int numOunces;
    private static int numSold = 0;
    public Unit5bQ5Beverage(int numOz)
    {
        numOunces = numOz;
    }
    public static void sell(int n)
    {
        /*implementation not shown */
        //sell is a static method
        //static methods can access and update static variables
        //static methods cannot access and update nonstatic variables
        //the sell method can access and update numSold not numOunces
    }
}

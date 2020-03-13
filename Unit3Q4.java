public class Unit3Q4
{
    public static boolean method1(int j, int k, int m){
        return !((j==k)&&(k>m));
    }
    
    public static boolean method2(int j, int k, int m){
        return (j!=k)||(k<=m);
    }
    
    //!(A&&B) equals !A||!B by DeMorgan's Law
    //A is j==k and B is k>m
    //Negate j==k becomes j!=k
    //Negate k>m becomes k<=m
    //Negate && becomes ||
    //The equivalent expression to method1 is (j!=k)||(k<=m)
}

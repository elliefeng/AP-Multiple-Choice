public class Unit5Q12
{
    public static void main(String[] args){
        Unit5bQ12Email e = new Unit5bQ12Email("default");
        e.printThis();
    }
}
//the new object e has the instance variable username set to "default"
//calling printThis prints the object e and invokes toString which prints default@example.com
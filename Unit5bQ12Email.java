public class Unit5bQ12Email
{
    private String username;
    public Unit5bQ12Email(String u)
    {
        username = u;
    }
    public void printThis()
    {
        System.out.println(this);
    }
    public String toString()
    {
        return username + "@example.com";
    }
}

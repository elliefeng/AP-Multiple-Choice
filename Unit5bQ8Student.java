public class Unit5bQ8Student
{
    private String firstName;
    private String lastName;
    private int age;
    public Unit5bQ8Student(String firstName, String lastName, int age)
    {
        firstName = firstName;
        lastName = lastName;
        age = age;
    }
    
    public String toString()
    {
        return firstName + " " + lastName;
    }
}
//local variables and instance variables have the same name 
//when this shappens, the variable names refers to the local variable not the instance variable

//if you added "my" to the variable name in the parameters(local variables) then the code segment would work
//otherwise, the code prints null null because the instance variables firstName and lastName aren't initialized
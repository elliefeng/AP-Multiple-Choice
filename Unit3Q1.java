public class Unit3Q1
{
    public static void Question1(int temp){
        String weather;
        if (temp<=31){
            weather = "cold";
        }
        else{
            weather = "cool";
        }
        if (temp>=51){
            weather = "moderate";
        }
        else{
            weather = "warm";
        }
        System.out.print(weather);
    }
    
    public static void main(String[]args){
        Question1(31);
    }
    
    // calling Question1(31) would cause weather to first be initialized to "cold" 
    // but then it would skip to the next if else statement where it would be passed to the else statement
    // thus it would print "warm"
}
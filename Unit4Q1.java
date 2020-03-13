public class Unit4Q1
{
    public static void sum(){
        int x = 100;
        int total = 0;
        while(x>=10)
        {
            total = total + x;
            x = x - 10;
        }  
        System.out.print(total);
    }
}
//x goes 100,90,80,70,60,50,40,30,20,10
//those values of x are all added together to total

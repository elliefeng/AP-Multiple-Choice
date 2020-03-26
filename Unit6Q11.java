public class Unit6Q11
{
    static int[] arr = {1,2,3,4,5,5,6,7};
    
    public static void main(String[] args)
    {
        System.out.println("{1,2,3,4,5,5,6,7}");
        
        boolean duplicates = false;
        for (int x = 0; x < arr.length - 1; x++)
        {
            for (int y = x + 1; y < arr.length; y++)
            {
                System.out.println("x: " + x);
                System.out.println("y: " + y);
                if (arr[x] == arr[y])
                {
                    duplicates = true;
                    System.out.println("duplicate: " + arr[x]);
                }
            }
        }
    }
}

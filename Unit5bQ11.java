public class Unit5bQ11
{
    public static void main(String[] args){
        Unit5bQ11Person andy = new Unit5bQ11Person("Andrew", 5, 6);
        Unit5bQ11Person ben = new Unit5bQ11Person("Benjamin", 6, 5);
        System.out.println(andy.compareHeights(ben));
    }
}
//the person andrew is 66 inches
//the person benjamin is 77 inches
//when compareHeights is called on the andy object, this refers to andy and other refers to ben
//compareHeights returns the shorter person, so andrew is returned
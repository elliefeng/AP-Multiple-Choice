public class Thing
{
    private String color;
    
    public Thing(){
        color = "Blue";
    }
    
    public Thing(String setColor){
        color = setColor;
    }
}

//In a separate class, writing "Thing someThing;" would create a new Thing object with a value of null
//Even if you write "Thing someThing = new Thing();" it would still initialize the Thing object with the color as "Blue"
//Even if you write "Thing someThing = new Thing("")" it would set the color to an empty String which is still initializing its value
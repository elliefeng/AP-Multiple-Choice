public class Unit2Q1Thing
{
    private String color;
    
    public Unit2Q1Thing(){
        color = "Blue";
    }
    
    public Unit2Q1Thing(String setColor){
        color = setColor;
    }
}

//In a separate class, writing "Unit2Q1Thing someThing;" would create a new Unit2Q1Thing object with a value of null
//Even if you write "Unit2Q1Thing someThing = new Unit2Q1Thing();" it would still initialize the Unit2Q1Thing object with the color as "Blue"
//Even if you write "Unit2Q1Thing someThing = new Unit2Q1Thing("")" it would set the color to an empty String which is still initializing its value
public class Unit5bQ6
{
    public static void main(String[] args){
        //creates UnitsHandler object, sets unitsPerContainer to 100
        Unit5bQ6UnitsHandler large = new Unit5bQ6UnitsHandler(100);
        System.out.println("Container size: " + large.getUnitsPerContainer());
        
        //static update method sets containers to 8, sets totalUnits to 100*8=800
        Unit5bQ6UnitsHandler.update(8);
        System.out.println("Containers : "+large.getContainers());
        System.out.println("Total Units: "+large.getTotalUnits());
    }
}

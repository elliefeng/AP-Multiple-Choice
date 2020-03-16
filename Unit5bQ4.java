public class Unit5bQ4
{
    public static void main(String[] args){
        //creates a new Gadget object with status=10
        Unit5bQ4Gadget a = new Unit5bQ4Gadget();
        System.out.println("status: " + a.getStatus());
        
        //set status to 3
        Unit5bQ4Gadget.setStatus(3);
        System.out.println("status: " + Unit5bQ4Gadget.getStatus());
        
        //creates new Gadget object and sets status back to 10
        Unit5bQ4Gadget b = new Unit5bQ4Gadget();
        System.out.println("status: " + b.getStatus());
        
    }
}

public class Unit5bQ6UnitsHandler
{
    private static int totalUnits=0;
    private static int containers=0;
    private static int unitsPerContainer=0;
    public Unit5bQ6UnitsHandler(int containerSize)
    {
        unitsPerContainer = containerSize;
    }
    public static void update(int c)
    {
        containers = c;
        totalUnits = unitsPerContainer * containers;
    }
    public static int getUnitsPerContainer()
    {
        return unitsPerContainer;
    }
    public static int getContainers()
    {
        return containers;
    }
    public static int getTotalUnits()
    {
        return totalUnits;
    }
}

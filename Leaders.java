
/**
 * Write a description of class Soldiers here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Leaders
{
    final String name;
    private Regions r = null;
    private Soldiers s = null;
    private Weapons w = null;
    /**
     * Constructor for objects of class Soldiers
     */
    public Leaders(String n, Regions r)
    {
        // initialise instance variables
        name = n;
        this.r = r;
        s = new Cavalry();
        w = new Sword();
    }
    
    public Regions getRegion()
    {
        return r;
    }
    
    public Soldiers getSoldiers()
    {
        return s;
    }
    
    public Weapons getWeapons()
    {
        return w;
    }
    
    public String getName()
    {
        return name;
    }
}

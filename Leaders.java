
/**
 * Write a description of class Soldiers here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Leaders
{
    public String name;
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
}

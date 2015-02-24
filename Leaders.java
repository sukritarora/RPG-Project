import java.util.ArrayList;
/**
 * Write a description of class Soldiers here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Leaders
{
    final String name;
    private ArrayList<Regions> regionArray = new ArrayList<Regions>(); 
    //private Regions r = null;
    private Soldiers s = null;
    private Weapons w = null;
    /**
     * Constructor for objects of class Soldiers
     */
    public Leaders(String n, Regions r)
    {
        // initialise instance variables
        name = n;
        regionArray.add(r);
        //         s = new Cavalry();
        //         w = new Sword();
    }

    public void assignSoldier(Soldiers s)
    {
        this.s = s;
    }

    public void assignWeapon(Weapons w)
    {
        this.w = w;
    }

    public ArrayList<Regions> getRegionArray()
    {
        return regionArray;
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

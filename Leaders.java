/**
 * Write a description of class Soldiers here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;
import java.util.Random;

public abstract class Leaders
{
    final String name;
    private ArrayList<Regions> regionArray = new ArrayList<Regions>(); 
    //private Regions r = null;
    Random r = new Random();
    
    private Soldiers s = new Soldiers(20);
    
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

    public ArrayList<Regions> getRegionArray()
    {
        return regionArray;
    }

    public Soldiers getSoldiers()
    {
        return s;
    }

    public String getName()
    {
        return name;
    }
    
    public void addSoldiers ()
    {
        s.numberOfSoldiers +=3;
    }
    
    public void subtractSoldiers ()
    {
        s.numberOfSoldiers-=3;
    }
}

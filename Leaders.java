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
    private Soldiers s = null;

    /**
     * Constructor for objects of class Soldiers
     */
    public Leaders(String n, Regions r)
    {
        // initialise instance variables
        name = n;
        regionArray.add(r);
        s = new Soldiers(this);
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

}

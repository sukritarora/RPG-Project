
/**
 * Write a description of class Soldiers here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.Random;

public class Soldiers
{
    // instance variables - replace the example below with your own
    int numberOfSoldiers;

    /**
     * Constructor for objects of class Soldiers
     */
    public Soldiers(int num)
    {
        numberOfSoldiers = num;
    }
    
    public int getNumberOfSoldiers()
    {
        return numberOfSoldiers;
    }
    
    public void assignSoldiersToRegions(int changingSoldiers)
    {
        numberOfSoldiers = numberOfSoldiers - changingSoldiers;
    }
    
    public void assignCPUSoldiers (Leaders l)
    {
        Random r = new Random();
        numberOfSoldiers = (r.nextInt(10) + 1) * l.getRegionArray().get(0).getCountryNum();
        while (numberOfSoldiers < 10)
        {
            numberOfSoldiers = (int) (numberOfSoldiers * 1.5);
        }
    }
    
    public void setNumberOfSoldiers (int num)
    {
        numberOfSoldiers = num;
    }
}

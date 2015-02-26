
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
    private int permanentNumberOfSoldiers;
    private int numberOfSoldiersToUse = 20;

    /**
     * Constructor for objects of class Soldiers
     */
    public Soldiers(Leaders l)
    {
        Random r = new Random();
        permanentNumberOfSoldiers = (r.nextInt(10) + 1) * l.getRegionArray().get(0).getCountryNum();
        while (permanentNumberOfSoldiers < 10)
        {
            permanentNumberOfSoldiers = (int) (permanentNumberOfSoldiers * 1.5);
        }
        //l.getRegion().assignSoldiers(numberOfSoldiers);
    }

    public int getPermanentNumberOfSoldiers()
    {
        return permanentNumberOfSoldiers;
    }

    public int getNumberOfSoldiersToUse()
    {
        return numberOfSoldiersToUse;
    }
    
    public void setNumberOfSoldiersToUse(int num)
    {
        numberOfSoldiersToUse -= num;
    }
    
    public int getTotalNumberOfSoldiers()
    {
        return permanentNumberOfSoldiers + numberOfSoldiersToUse;
    }
    

    //     public void assignSoldiersToRegions(int changingSoldiers)
    //     {
    //         numberOfSoldiers = numberOfSoldiers - changingSoldiers;
    //     }

    //     public void setNumberOfSoldiers (int num)
    //     {
    //         numberOfSoldiers = num;
    //     }
}


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
    
    public void addSoldiers(int num)
    {
        numberOfSoldiersToUse = numberOfSoldiersToUse + num;
    }
    
    public void setPermanentSoldiers(int num)
    {
        permanentNumberOfSoldiers = num;
    }

}


/**
 * Write a description of class Countries here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Regions
{
    //private i
    final String regionName;
    private int countryNumber;
    private int activeSoldiers;
    private String[] adjacentRegions;
    /**
     * Constructor for objects of class Countries
     */
    public Regions(String regionName, int num, String[] ar)
    {
        this.regionName = regionName;
        countryNumber = num;
        adjacentRegions = ar;
        //         for (int i = 0; i < ar.length; i++)
        //         {
        //             adjacentRegions[i] = ar[i];
        //         }
    }

    public int getCountryNum()
    {
        return countryNumber;
    }

    public void assignSoldiers(int numberOfSoldiers)
    {
        activeSoldiers = activeSoldiers + numberOfSoldiers;
    }

    //     public void setSoldiers(int num)
    //     {
    //         activeSoldiers = num;
    //     }
    //     
    public int getSoldiers()
    {
        return activeSoldiers;
    }

    public String[] getAdjacentRegions()
    {
        return adjacentRegions;
    }
}

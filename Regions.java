
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
    /**
     * Constructor for objects of class Countries
     */
    public Regions(String regionName, int num)
    {
        this.regionName = regionName;
        countryNumber = num;
    }
    
    public int getCountryNum()
    {
        return countryNumber;
    }
}


/**
 * Write a description of class UKRegion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class UKRegion extends Regions
{
    // instance variables - replace the example below with your own
    String[] neighboringRegions = {"Western Europe","Central Europe","Scandinavia"};

    /**
     * Constructor for objects of class UKRegion
     */
    public UKRegion()
    {
        // initialise instance variables
        super("United Kingdom",2,new String[] {"Western Europe","Scandinavia"});        
    }   
}

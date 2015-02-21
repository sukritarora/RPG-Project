
/**
 * Write a description of class WestEuropeRegion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class WestEuropeRegion extends Regions
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class WestEuropeRegion
     */
    public WestEuropeRegion(String countryName)
    {
        // initialise instance variables
        super("Western Europe");
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}

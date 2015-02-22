
/**
 * Write a description of class Arnold here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Arnold extends Leaders
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Arnold
     */
    public Arnold()
    {
        // initialise instance variables
        super("Arnold Schwarzenegger",new CarpathianRegion());
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

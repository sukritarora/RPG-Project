
/**
 * Write a description of class Soldiers here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Soldiers
{
    // instance variables - replace the example below with your own
    public int health;
    public int strength;
    public int defense; 
    

    /**
     * Constructor for objects of class Soldiers
     */
    public Soldiers(int d, int s)
    {
        // initialise instance variables
        defense = d;
        strength = s;
        health = 100;
    }
}

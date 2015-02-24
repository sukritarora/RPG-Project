
/**
 * Write a description of class Soldiers here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Soldiers
{
    // instance variables - replace the example below with your own
    private int health;
    private int strength;
    private int defense; 
    final String typeOfSoldier;

    /**
     * Constructor for objects of class Soldiers
     */
    public Soldiers(int d, int s, String type)
    {
        // initialise instance variables
        defense = d;
        strength = s;
        health = 100;
        typeOfSoldier = type;
    }
    
    public int getHealth()
    {
        return health;
    }
    
     public int getStrength()
    {
        return strength;
    }
    
     public int getDefense()
    {
        return defense;
    }
    
    public void takeDamage(int d)
    {
        health -= d;
    }
}

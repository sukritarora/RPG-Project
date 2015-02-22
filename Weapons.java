/**
 * Write a description of class Weapons here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Weapons
{
    // instance variables - replace the example below with your own
    private int damage;
    private int accuracy;
    final String typeOfWeapon;

    /**
     * Constructor for objects of class Weapons
     */
    public Weapons(int d, int a, String type)
    {
        // initialise instance variables
        damage = d;
        accuracy = a;
        typeOfWeapon = type;
    }
    
    public int getDamage()
    {
        return damage;
    }
    
    public int getAccuracy()
    {
        return accuracy;
    }
}

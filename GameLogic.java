
/**
 * Write a description of class GameLogic here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import javax.swing.*;

import java.util.ArrayList;
import java.util.Random;
public class GameLogic
{
    String choice = "";
    public static Leaders chooseLeader()
    {
        String[] leaders = {"Winston Churchill","Napoleon Bonaparte","Adolf Hitler","Alexander the Great","Otto von Bismarck","Joseph Stalin","Gustavus Adolphus","Arnold Schwarzenegger"};
        String response = (String) JOptionPane.showInputDialog(null, "Which European Leader would you like to be?", "Leader", JOptionPane.PLAIN_MESSAGE,null, leaders, leaders[0]);
        Leaders l = null;
        switch (response)
        {
            case "Winston Churchill": 
            {
                l = new Churchill();
                break;
            }
            case "Napoleon Bonaparte":
            {
                l = new Napoleon();
                break;
            }
            case "Adolf Hitler":
            {
                l = new Hitler();
                break;
            }
            case "Alexander the Great":
            {
                l = new AlexanderTheGreat();
                break;
            }
            case "Otto von Bismarck":
            {
                l = new Bismarck();
                break;
            }
            case "Joseph Stalin":
            {
                l = new Stalin ();
                break;
            }
            case "Gustavus Adolphus":
            {
                l = new Adolphus();
                break;
            }
            case "Arnold Schwarzenegger":
            {
                l = new Arnold();
                break;
            }
        }
        return l; 
    }
    
    public static Soldiers chooseSoldier()
    {
        String[] soldiers = {"Infantry","Cavalry","Artillery"};
        String response = (String) JOptionPane.showInputDialog(null, "Which type of Soldier would you like to control?", "Soldier", JOptionPane.PLAIN_MESSAGE,null,soldiers,soldiers[0]);
        Soldiers s = null;
        switch (response)
        {
            case "Infantry":    
            {
                s = new Infantry();
                break;
            }
            case "Cavalry": 
            {
                s = new Cavalry();
                break;
            }
            case "Artillery":   
            {
                s = new Artillery();
                break;
            }
        }
        return s;
    }
    
    public static Weapons chooseWeapon()
    {
        String[] weapons = {"Gun","Sword","Cannon"};
        String response = (String) JOptionPane.showInputDialog(null,"Which type of weapon do you want?","Weapon",JOptionPane.PLAIN_MESSAGE,null,weapons,weapons[0]);
        Weapons w = null;
        switch (response)
        {
            case "Gun": 
            {
                w = new Gun();
                break;
            }
            case "Sword":  
            {
                w = new Sword();
                break;
            }
            case "Canon":  
            {
                w = new Cannon();
                break;
            }
        }
        return w;
    }
    
    public static void displayStats(Leaders l)
    {

        System.out.println("This will be the window that will keep you updated on all your information");
        System.out.println("You are: " + l.name);
        System.out.print("You rule over the ");
        for (Regions i : l.getRegionArray())
        {
            System.out.print(i.regionName + ", ");
            System.out.print(" region(s) which has/have " + i.getCountryNum()+ " countries");
        }
        
        System.out.println("\nYou're type of soldier is: " + l.getSoldiers().typeOfSoldier + "\nYou're weapon is: " + l.getWeapons().typeOfWeapon);
        System.out.println("\nWeapons have " + l.getWeapons().getDamage() + " damage and " + l.getWeapons().getAccuracy() + " accuracy"); 
        System.out.println("\nCurrent health: " + l.getSoldiers().getHealth() + "\nCurrent strength: " + l.getSoldiers().getStrength() + "\nCurrent defense: " + l.getSoldiers().getDefense());
    }
    
    public static void fightSequence()
    {
    }
    
    public static void cpuTurn()
    {
    }

    public static void firstChallenge (Leaders l)
    {
        System.out.println("Welcome to the first challenge!");
        Random r = new Random ();
        int newNumber = r.nextInt(8);
        BattleSequence b = null;
        if (newNumber == 0 && !(l.getRegion().regionName.equals("Carpathian")))
        {
            b = BattleSequence (new CarpathianRegion(), new Infantry (), new Sword());
            choice = "Carpathian";
        }
        else if (newNumber == 1 && !(l.getRegion().regionName.equals("United Kingdom")))
        {
            b = BattleSequence (new UKRegion(), new Infantry (), new Sword ());
            choice = "United Kingdom";
        } else if (newNumber == 2 && !(l.getRegion().regionName.equals("Western Europe")))
        {
            b = BattleSequence (new WestEuropeRegion(), new Infantry (), new Sword ());
            choice = "Western Europe";
        } else if (newNumber == 3 && !(l.getRegion().regionName.equals("Central Europe")))
        {
            b = BattleSequence (new CentralEuropeRegion(), new Infantry (), new Sword ());
            choice = "Central Europe";
        } else if (newNumber == 4 && !(l.getRegion().regionName.equals("Balkan")))
        {
            b = BattleSequence (new BalkanRegion(), new Infantry (), new Sword ());
        } else if (newNumber == 5 && !(l.getRegion().regionName.equals("Baltic")))
        {
            b = BattleSequence (new BalticRegion(), new Infantry (), new Sword ());
        } else if (newNumber == 6 && !(l.getRegion().regionName.equals("Ural")))
        {
            b = BattleSequence (new RussianRegion(), new Infantry (), new Sword ());
        } else if (newNumber == 7 && !(l.getRegion().regionName.equals("Scandinavian")))
        {
            b = BattleSequence (new ScandinavianRegion(), new Infantry (), new Sword ());
        }
    }
    
    public static void BattleSequence (Regions r, Weapons w, Soldiers s)
    {
        

    }
}

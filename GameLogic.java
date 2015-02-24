
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
    
    public static Regions chooseAttack(Leaders l)
    {
        boolean valid = true;
        String response = "";
        while (valid)
        {
            String[] regions = {"UK Region","West European Region","Central European Region","Balkan Region","Baltic Region","Russian Region","Scandinavian Region","Carpathian Region"};
            response = (String) JOptionPane.showInputDialog(null, "Which region would you like to attack?", "Attack Choices", JOptionPane.PLAIN_MESSAGE,null, regions, regions[0]);
            if (!(response.equals(l.getName()))) valid = false;
        }
        Regions att = null;
        switch (response)
        {
            case "UK Region" : att = new UKRegion();
            case "West European Region" : att = new WestEuropeRegion();
            case "CentralEuropeanRegion" : att = new CentralEuropeRegion();
            case "Balkan Region" : att = new BalkanRegion();
            case "Baltic Region" : att = new BalticRegion();
            case "Russian Region" : att = new RussianRegion();
            case "Scandinavian Region" : att = new ScandinavianRegion();
            case "Carpathian Region" : att = new CarpathianRegion();
        }
        return att;
    }
    
    public static void placeSoldiers(Leaders l)
    {
        int soldierNum = l.getSoldiers().getNumberOfSoldiers();
        Object[] soldierArray =new Object[l.getRegionArray().size()];
        l.getRegionArray().toArray(soldierArray);
        String response = (String) JOptionPane.showInputDialog(null, "You have " + soldierNum + " soldiers. Where would you like to place them?", "Place Soldiers", JOptionPane.PLAIN_MESSAGE,null, soldierArray, soldierArray[0]);
        String numMoving = JOptionPane.showInputDialog("Please enter the number of soldiers that you would like to put in" + response);
        int soldier = Integer.parseInt(numMoving);
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
        
    }
        
    public static void firstChallenge (Leaders l)
    {
        
    }
    
    public static void BattleSequence (Regions r, Soldiers s)
    {
        

    }
}

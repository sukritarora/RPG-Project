
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
    public GameLogic()
    {
        UKRegion UK = new UKRegion();
        //When an instance of GameLogic is created, all regions are created to use throughout the game
    }
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
//         boolean valid = true;
//         String response = "";
//         while (valid)
//         {
//             String[] regions = {"UK Region","West European Region","Central European Region","Balkan Region","Baltic Region","Russian Region","Scandinavian Region","Carpathian Region"};
//             response = (String) JOptionPane.showInputDialog(null, "Which region would you like to attack?", "Attack Choices", JOptionPane.PLAIN_MESSAGE,null, regions, regions[0]);
//             if (!(response.equals(l.getRegionArray().get(0)))) valid = false;
//         }
//         Regions att = null;
//         switch (response)
//         {
//             case "UK Region" : att = new UKRegion();
//             case "West European Region" : att = new WestEuropeRegion();
//             case "CentralEuropeanRegion" : att = new CentralEuropeRegion();
//             case "Balkan Region" : att = new BalkanRegion();
//             case "Baltic Region" : att = new BalticRegion();
//             case "Russian Region" : att = new RussianRegion();
//             case "Scandinavian Region" : att = new ScandinavianRegion();
//             case "Carpathian Region" : att = new CarpathianRegion();
//         }
//         return att;
        
        ArrayList <Regions> attackableRegions = new ArrayList<Regions>();
        for (Regions r: l.getRegionArray())
        {
            for (int i = 0; i < r.getAdjacentRegions().length; i++)
            {
                String [] adjacentRegions = r.getAdjacentRegions();
                switch(adjacentRegions[i])
                {
                    case "United Kingdom":  {
                        attackableRegions.add(new UKRegion());
                        break;
                    }
                    case "Western Europe":  {
                        attackableRegions.add(new WestEuropeRegion());
                        break;
                    }
                    case "Central Europe":  {
                        attackableRegions.add(new CentralEuropeRegion());
                        break;
                    }
                    case "Balkans": {
                        attackableRegions.add(new BalkanRegion());
                        break;
                    }
                    case "Baltics": {
                        attackableRegions.add(new BalticRegion());
                        break;
                    }
                    case "Urals":   {
                        attackableRegions.add(new RussianRegion());
                        break;
                    }
                    case "Scandinavia": {
                        attackableRegions.add(new ScandinavianRegion());
                        break;
                    }
                    case "Carpathians": {
                        attackableRegions.add(new CarpathianRegion());
                        break;
                    }
                }
            }
        }
        Regions[] realAttackableRegions = null;
        attackableRegions.toArray(realAttackableRegions);
        Regions response = (Regions) JOptionPane.showInputDialog(null, "Which Region would you like to attack", "Attacking Regions", JOptionPane.PLAIN_MESSAGE,null, realAttackableRegions, realAttackableRegions[0]);
        return response;
    }
    
    public static void placeSoldiers(Leaders l)
    {
        boolean cont = true;
        Object[] yesOrNo = {true,false};
        while (cont)
        {
            int soldierNum = l.getSoldiers().getNumberOfSoldiers();
            Object[] soldierArray =new Object[l.getRegionArray().size()];
            l.getRegionArray().toArray(soldierArray);
            Object response = JOptionPane.showInputDialog(null, "You have " + soldierNum + " soldiers. Where would you like to place them?","Place Soldiers",JOptionPane.PLAIN_MESSAGE,null,soldierArray,soldierArray[0]);
            Regions region = null;
            for (int i = 0; i < soldierArray.length; i++)
            {
                if (response == soldierArray[i]) 
                {
                    region = (Regions) response;
                }
            }
            String numMoving = JOptionPane.showInputDialog("Please enter the number of soldiers that you would like to put in" + response);
            int numberOfSoldiersToMove = Integer.parseInt(numMoving);
            l.getSoldiers().assignSoldiersToRegions(numberOfSoldiersToMove);
            region.assignSoldiers(numberOfSoldiersToMove);
            cont = (boolean) JOptionPane.showInputDialog(null, "Would you like to continue placing troops?","Continue",JOptionPane.PLAIN_MESSAGE,null,yesOrNo,yesOrNo[0]);
        }
    }
    
    public static void displayStats(Leaders l)
    {

        System.out.println("This will be the window that will keep you updated on all your information");
        System.out.println("You are: " + l.name);
        System.out.print("You rule over the ");
        for (Regions i : l.getRegionArray())
        {
            System.out.print(i.regionName + ",");
            System.out.print(" region(s) which has/have " + i.getCountryNum()+ " countries and " + i.getSoldiers() + "soldiers");
        }
        
    }
        
    public static void firstChallenge (Leaders l)
    {
        
    }
    
    public static boolean fightSequence (Leaders l, boolean win)
    {
        Random cpu = new Random ();
        int cpuSoldiers;
        if (win == true)
        {
            cpuSoldiers = cpu.nextInt(11) + (l.getSoldiers().getNumberOfSoldiers() - 10);
        } else 
        {
            cpuSoldiers = cpu.nextInt(11) + (l.getSoldiers().getNumberOfSoldiers() - 10) + 3;
        }
        
        double prob = cpu.nextDouble();
        if (((double)(l.getSoldiers().getNumberOfSoldiers() - cpuSoldiers) / 100 + prob) > .5)
        {
            System.out.println("Congratulations! You have beat the region of (insert region here)! You have gained three soldiers!");
            return true;
        } else
        {
            return false;
        }
    }
}

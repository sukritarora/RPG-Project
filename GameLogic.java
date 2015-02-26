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
    public static Leaders winstonChurchill = new Churchill();
    public static Leaders napoleonBonaparte = new Napoleon();
    public static Leaders adolfHitler = new Hitler();
    public static Leaders alexanderTheGreat = new AlexanderTheGreat();
    public static Leaders arnold = new Arnold();
    public static Leaders ottoVonBismarck = new Bismarck();
    public static Leaders josephStalin = new Stalin();
    public static Leaders gustavusAdolphus = new Adolphus();
    
    public GameLogic()
    {
        //When an instance of GameLogic is created, all regions are created to use throughout the game
    }
    
    public static void randomiseCPUSoldiers()
    {
        winstonChurchill.getSoldiers().assignCPUSoldiers(winstonChurchill);
        napoleonBonaparte.getSoldiers().assignCPUSoldiers(napoleonBonaparte);
        adolfHitler.getSoldiers().assignCPUSoldiers(adolfHitler);
        alexanderTheGreat.getSoldiers().assignCPUSoldiers(alexanderTheGreat);
        arnold.getSoldiers().assignCPUSoldiers(arnold);
        ottoVonBismarck.getSoldiers().assignCPUSoldiers(ottoVonBismarck);
        josephStalin.getSoldiers().assignCPUSoldiers(josephStalin);
        gustavusAdolphus.getSoldiers().assignCPUSoldiers(gustavusAdolphus);
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
                l = winstonChurchill;
                break;
            }
            case "Napoleon Bonaparte":
            {
                l = napoleonBonaparte;
                break;
            }
            case "Adolf Hitler":
            {
                l = adolfHitler;
                break;
            }
            case "Alexander the Great":
            {
                l = alexanderTheGreat;
                break;
            }
            case "Otto von Bismarck":
            {
                l = ottoVonBismarck;
                break;
            }
            case "Joseph Stalin":
            {
                l = josephStalin;
                break;
            }
            case "Gustavus Adolphus":
            {
                l = gustavusAdolphus;
                break;
            }
            case "Arnold Schwarzenegger":
            {
                l = arnold;
                break;
            }
        }
        l.getSoldiers().setNumberOfSoldiers(20);
        return l; 
    }
    
    public static Leaders chooseAttack(Leaders l)
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
        
        ArrayList <Leaders> attackableLeaderRegions = new ArrayList<Leaders>();
        for (Regions r: l.getRegionArray())
        {
            for (int i = 0; i < r.getAdjacentRegions().length; i++)
            {
                String [] adjacentLeaderRegions = r.getAdjacentRegions();
                switch(adjacentLeaderRegions[i])
                {
                    case "United Kingdom":   {
                        attackableLeaderRegions.add(winstonChurchill);
                        break;
                    }
                    case "Western Europe":  {
                        attackableLeaderRegions.add(napoleonBonaparte);
                        break;
                    }
                    case "Central Europe":    {
                        attackableLeaderRegions.add(adolfHitler);
                        break;
                    }
                    case "Balkans": {
                        attackableLeaderRegions.add(alexanderTheGreat);
                        break;
                    }
                    case "Baltics":   {
                        attackableLeaderRegions.add(ottoVonBismarck);
                        break;
                    }
                    case "Urals":   {
                        attackableLeaderRegions.add(josephStalin);
                        break;
                    }
                    case "Scandinavia":   {
                        attackableLeaderRegions.add(gustavusAdolphus);
                        break;
                    }
                    case "Carpathians":   {
                        attackableLeaderRegions.add(arnold);
                        break;
                    }
                }
            }
        }
        Leaders[] realAttackableLeaderRegions = new Leaders[attackableLeaderRegions.size()];
        attackableLeaderRegions.toArray(realAttackableLeaderRegions);
        for (Leaders leader: realAttackableLeaderRegions)
        {
            
        }
        Leaders response = (Leaders) JOptionPane.showInputDialog(null, "Which Leader would you like to attack", "Attacking Leaders", JOptionPane.PLAIN_MESSAGE,null, realAttackableLeaderRegions, realAttackableLeaderRegions[0]);
        return response;
    }
    
    public static void placeSoldiers(Leaders l)
    {
        int cont = JOptionPane.YES_OPTION;
        Object[] yesOrNo = {true,false};
        while (cont == JOptionPane.YES_OPTION)
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
            JOptionPane.showMessageDialog(null,"You have just moved " + numberOfSoldiersToMove + " soldiers into" + region,"Soldier Movement",JOptionPane.INFORMATION_MESSAGE);
            cont = JOptionPane.showOptionDialog(null, "Would you like to continue placing troops?","Continue",JOptionPane.YES_NO_OPTION,JOptionPane.PLAIN_MESSAGE,null,null,null);
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
            System.out.print(" region(s) which has/have " + i.getCountryNum()+ " countries and " + i.getSoldiers() + " soldiers");
        }
        
    }
    
    public static void fightSequence (Leaders attackingLeader, Leaders defendingLeader)
    {
        Random r = new Random();
//         Random cpu = new Random ();
//         int cpuSoldiers;
//         if (win == true)
//         {
//             cpuSoldiers = cpu.nextInt(11) + (l.getSoldiers().getNumberOfSoldiers() - 10);
//         } else 
//         {
//             cpuSoldiers = cpu.nextInt(11) + (l.getSoldiers().getNumberOfSoldiers() - 10) + 3;
//         }
//         
//         double prob = cpu.nextDouble();
//         if (((double)(l.getSoldiers().getNumberOfSoldiers() - cpuSoldiers) / 100 + prob) > .5)
//         {
//             return true;
//         } else
//         {
//             return false;
//         }

        int attackingSoldiers = attackingLeader.getRegion().getSoldiers();
        int defendingSoldiers = defendingLeader.getSoldiers().getNumberOfSoldiers();
        

        while ((attackingSoldiers > 1) && (defendingSoldiers > 0))
        {
            
            if ((attackingSoldiers > 3) && (defendingSoldiers > 1))
            {
                
                int[] offenseArray = new int [3];
                int[] defenseArray = new int [2];
                
                for (int i = 0; i < 3; i++)
                {
                    offenseArray[i] = r.nextInt(6) + 1;
                }
                
                if (Math.max(offenseArray[0],offenseArray[1]) == offenseArray[1])
                {
                    int temp = offenseArray[1];
                    offenseArray[1] = offenseArray[0];
                    offenseArray[0] = temp;
                }
                
                if (Math.max(offenseArray[0],offenseArray[2]) == offenseArray[2])
                {
                    int temp = offenseArray[2];
                    offenseArray[2] = offenseArray[0];
                    offenseArray[0] = temp;
                }
                
                if (Math.max(offenseArray[1],offenseArray[2]) == offenseArray[2])
                {
                    int temp = offenseArray[2];
                    offenseArray[2] = offenseArray[1];
                    offenseArray[1] = temp;
                }
                
                for (int j = 0; j < 2; j++)
                {
                    defenseArray[j] = r.nextInt(6) + 1;
                }
                
                if (Math.max(defenseArray[0],defenseArray[1]) == defenseArray[1])
                {
                    int temp = defenseArray[1];
                    defenseArray[1] = defenseArray[0];
                    defenseArray[0] = temp;
                }
                
                if ((offenseArray[0] > defenseArray[0]) && (offenseArray[1] > defenseArray[1]))
                {
                    defendingSoldiers = defendingSoldiers - 2;
                }
                else if ((offenseArray[0] <= defenseArray[0]) && (offenseArray[1] <= defenseArray[1]))
                {
                    attackingSoldiers = attackingSoldiers - 3;
                }
                else
                {
                    attackingSoldiers = attackingSoldiers - 1;
                    defendingSoldiers = defendingSoldiers - 1;
                }
                
            }
            else if ((attackingSoldiers > 3) && (defendingSoldiers == 1))
            {
                
                int[] offenseArray = new int [3];
                
                for (int i = 0; i < 3; i++)
                {
                    offenseArray[i] = r.nextInt(6) + 1;
                }
                
                if (Math.max(offenseArray[0],offenseArray[1]) == offenseArray[1])
                {
                    int temp = offenseArray[1];
                    offenseArray[1] = offenseArray[0];
                    offenseArray[0] = temp;
                }
                
                if (Math.max(offenseArray[0],offenseArray[2]) == offenseArray[2])
                {
                    int temp = offenseArray[2];
                    offenseArray[2] = offenseArray[0];
                    offenseArray[0] = temp;
                }
                
                if (Math.max(offenseArray[1],offenseArray[2]) == offenseArray[2])
                {
                    int temp = offenseArray[2];
                    offenseArray[2] = offenseArray[1];
                    offenseArray[1] = temp;
                }
                
                int defenseValue = r.nextInt(6) + 1;
                
                if (offenseArray[0] > defenseValue)
                {
                    defendingSoldiers = defendingSoldiers - 1;
                }
                else if (offenseArray[0] <= defenseValue)
                {
                    attackingSoldiers = attackingSoldiers - 3;
                }

            }
            else if ((attackingSoldiers == 3) && (defendingSoldiers > 1))
            {
                
                int[] offenseArray = new int [2];
                int[] defenseArray = new int [2];
                
                for (int i = 0; i < 2; i++)
                {
                    offenseArray[i] = r.nextInt(6) + 1;
                }
                
                if (Math.max(offenseArray[0],offenseArray[1]) == offenseArray[1])
                {
                    int temp = offenseArray[1];
                    offenseArray[1] = offenseArray[0];
                    offenseArray[0] = temp;
                }
                
                for (int j = 0; j < 2; j++)
                {
                    defenseArray[j] = r.nextInt(6) + 1;
                }
                
                if (Math.max(defenseArray[0],defenseArray[1]) == defenseArray[1])
                {
                    int temp = defenseArray[1];
                    defenseArray[1] = defenseArray[0];
                    defenseArray[0] = temp;
                }
                
                if ((offenseArray[0] > defenseArray[0]) && (offenseArray[1] > defenseArray[1]))
                {
                    defendingSoldiers = defendingSoldiers - 2;
                }
                else if ((offenseArray[0] <= defenseArray[0]) && (offenseArray[1] <= defenseArray[1]))
                {
                    attackingSoldiers = attackingSoldiers - 2;
                }
                else
                {
                    attackingSoldiers = attackingSoldiers - 1;
                    defendingSoldiers = defendingSoldiers - 1;
                }
                
            }
            else if ((attackingSoldiers == 3) && (defendingSoldiers == 1))
            {
                
                int[] offenseArray = new int [2];
                
                for (int i = 0; i < 2; i++)
                {
                    offenseArray[i] = r.nextInt(6) + 1;
                }
                
                if (Math.max(offenseArray[0],offenseArray[1]) == offenseArray[1])
                {
                    int temp = offenseArray[1];
                    offenseArray[1] = offenseArray[0];
                    offenseArray[0] = temp;
                }
                
                int defenseValue = r.nextInt(6) + 1;
                
                if (offenseArray[0] > defenseValue)
                {
                    defendingSoldiers = defendingSoldiers - 1;
                }
                else if (offenseArray[0] <= defenseValue)
                {
                    attackingSoldiers = attackingSoldiers - 2;
                }
                
            }
            else if ((attackingSoldiers == 2) && (defendingSoldiers > 1))
            {
                
                int offenseValue = r.nextInt(6) + 1;
                
                int[] defenseArray = new int [2];
                
                for (int j = 0; j < 2; j++)
                {
                    defenseArray[j] = r.nextInt(6) + 1;
                }
                
                if (Math.max(defenseArray[0],defenseArray[1]) == defenseArray[1])
                {
                    int temp = defenseArray[1];
                    defenseArray[1] = defenseArray[0];
                    defenseArray[0] = temp;
                }
                
                if (offenseValue > defenseArray[0])
                {
                    defendingSoldiers = defendingSoldiers - 2;
                }
                else if (offenseValue <= defenseArray[0])
                {
                    attackingSoldiers = attackingSoldiers - 1;
                }
                
            }
            else if ((attackingSoldiers == 2) && (defendingSoldiers == 1))
            {
                
                int offenseValue = r.nextInt(6) + 1;
                int defenseValue = r.nextInt(6) + 1;
                
                if (offenseValue > defenseValue)
                {
                    defendingSoldiers = defendingSoldiers - 1;
                }
                else if (offenseValue <= defenseValue)
                {
                    attackingSoldiers = attackingSoldiers - 1;
                }
                
            }
        }
        
        attackingLeader.getRegion().setSoldiers(attackingSoldiers);
        defendingLeader.getRegion().setSoldiers(defendingSoldiers);
        
        if (defendingSoldiers == 0)
        {
            JOptionPane.showMessageDialog(null,"You defeated " + defendingLeader.getName(),"Victory",JOptionPane.INFORMATION_MESSAGE);
            attackingLeader.getRegionArray().add(defendingLeader.getRegion());
        }
        else if (attackingSoldiers == 1)
        {
            JOptionPane.showMessageDialog(null,"You were defeated by " + defendingLeader.getName(),"Defeat",JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
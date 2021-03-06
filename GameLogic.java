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
    private static Leaders winstonChurchill = null;
    private static Leaders napoleonBonaparte = null;
    private static Leaders adolfHitler = null;
    private static Leaders alexanderTheGreat = null;
    private static Leaders arnold = null;
    private static Leaders ottoVonBismarck = null;
    private static Leaders josephStalin = null;
    private static Leaders gustavusAdolphus = null;

    public GameLogic()
    {
        winstonChurchill = new Churchill();
        napoleonBonaparte = new Napoleon();
        adolfHitler = new Hitler();
        alexanderTheGreat = new AlexanderTheGreat();
        arnold = new Arnold();
        ottoVonBismarck = new Bismarck();
        josephStalin = new Stalin();
        gustavusAdolphus = new Adolphus();
    }

    public static Leaders chooseLeader()
    {
        String[] leaders = {"Winston Churchill","Napoleon Bonaparte","Adolf Hitler","Alexander the Great","Otto von Bismarck","Joseph Stalin","Gustavus Adolphus","Arnold Schwarzenegger"};
        String response = null;
        while (response==null)
        {
            try {
                response = (String) JOptionPane.showInputDialog(null, "Which European Leader would you like to be?", "Leader", JOptionPane.PLAIN_MESSAGE,null, leaders, leaders[0]);
            }
            catch (Exception e) {
            }
        }
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
        //l.getSoldiers().setNumberOfSoldiers(20);
        return l; 
    }

    public static Leaders chooseAttack(Leaders l)
    {
        ArrayList <Leaders> attackableLeaderRegions = new ArrayList<Leaders>();
        boolean added = false;
        for (Regions r: l.getRegionArray())
        {
            for (int i = 0; i < r.getAdjacentRegions().length; i++)
            {
                String [] adjacentLeaderRegions = r.getAdjacentRegions();
                switch(adjacentLeaderRegions[i])
                {
                    case "United Kingdom":   {
                        for (int j = 0; j < attackableLeaderRegions.size(); j++)
                        {
                            if (attackableLeaderRegions.get(j).equals(winstonChurchill.getRegionArray().get(0))) added = true;
                        }
                        for (int j = 0; j < l.getRegionArray().size(); j++)
                        {
                            if (l.getRegionArray().get(j).equals(winstonChurchill.getRegionArray().get(0))) added = true;
                        }
                        if (added == false) attackableLeaderRegions.add(winstonChurchill);
                        else if (added == true) added = false;
                        break;
                    }
                    case "Western Europe":  {
                        for (int j = 0; j < attackableLeaderRegions.size(); j++)
                        {
                            if (attackableLeaderRegions.get(j).equals(napoleonBonaparte.getRegionArray().get(0))) added = true;
                        }
                        for (int j = 0; j < l.getRegionArray().size(); j++)
                        {
                            if (l.getRegionArray().get(j).equals(napoleonBonaparte.getRegionArray().get(0))) added = true;
                        }
                        if (added == false) attackableLeaderRegions.add(napoleonBonaparte);
                        else if (added == true) added = false;
                        break;
                    }
                    case "Central Europe":    {
                        for (int j = 0; j < attackableLeaderRegions.size(); j++)
                        {
                            if (attackableLeaderRegions.get(j).equals(adolfHitler.getRegionArray().get(0))) added = true;
                        }
                        for (int j = 0; j < l.getRegionArray().size(); j++)
                        {
                            if (l.getRegionArray().get(j).equals(adolfHitler.getRegionArray().get(0))) added = true;
                        }
                        if (added == false) attackableLeaderRegions.add(adolfHitler);
                        else if (added == true) added = false;
                        break;
                    }
                    case "Balkans": {
                        for (int j = 0; j < attackableLeaderRegions.size(); j++)
                        {
                            if (attackableLeaderRegions.get(j).equals(alexanderTheGreat.getRegionArray().get(0))) added = true;
                        }
                        for (int j = 0; j < l.getRegionArray().size(); j++)
                        {
                            if (l.getRegionArray().get(j).equals(alexanderTheGreat.getRegionArray().get(0))) added = true;
                        }
                        if (added == false) attackableLeaderRegions.add(alexanderTheGreat);
                        else if (added == true) added = false;
                        break;
                    }
                    case "Baltics":   {
                        for (int j = 0; j < attackableLeaderRegions.size(); j++)
                        {
                            if (attackableLeaderRegions.get(j).equals(ottoVonBismarck.getRegionArray().get(0))) added = true;
                        }
                        for (int j = 0; j < l.getRegionArray().size(); j++)
                        {
                            if (l.getRegionArray().get(j).equals(ottoVonBismarck.getRegionArray().get(0)))added = true;
                        }
                        if (added == false) attackableLeaderRegions.add(ottoVonBismarck);
                        else if (added == true) added = false;
                        break;
                    }
                    case "Urals":   {
                        for (int j = 0; j < attackableLeaderRegions.size(); j++)
                        {
                            if (attackableLeaderRegions.get(j).equals(josephStalin.getRegionArray().get(0))) added = true;
                        }
                        for (int j = 0; j < l.getRegionArray().size(); j++)
                        {
                            if (l.getRegionArray().get(j).equals(josephStalin.getRegionArray().get(0))) added = true;
                        }
                        if (added == false) attackableLeaderRegions.add(josephStalin);
                        else if (added == true) added = false;
                        break;
                    }
                    case "Scandinavia":   {
                        for (int j = 0; j < attackableLeaderRegions.size(); j++)
                        {
                            if (attackableLeaderRegions.get(j).equals(gustavusAdolphus.getRegionArray().get(0)))added = true;
                        }
                        for (int j = 0; j < l.getRegionArray().size(); j++)
                        {
                            if (l.getRegionArray().get(j).equals(gustavusAdolphus.getRegionArray().get(0))) added = true;
                        }
                        if (added == false) attackableLeaderRegions.add(gustavusAdolphus);
                        else if (added == true) added = false;
                        break;
                    }
                    case "Carpathians":   {
                        for (int j = 0; j < attackableLeaderRegions.size(); j++)
                        {
                            if (attackableLeaderRegions.get(j).equals(arnold.getRegionArray().get(0))) added = true;
                        }
                        for (int j = 0; j < l.getRegionArray().size(); j++)
                        {
                            if (l.getRegionArray().get(j).equals(arnold.getRegionArray().get(0))) added = true;
                        }
                        if (added == false) attackableLeaderRegions.add(arnold);
                        else if (added == true) added = false;
                        break;
                    }
                }
            }
        }
        Leaders[] realAttackableLeaderRegions = new Leaders[attackableLeaderRegions.size()];
        attackableLeaderRegions.toArray(realAttackableLeaderRegions);

        Leaders response = null;
        int sure = JOptionPane.NO_OPTION;
        while (sure == JOptionPane.NO_OPTION)
        {
            try {
                response = (Leaders) JOptionPane.showInputDialog(null, "Which Leader would you like to attack", "Attacking Leaders", JOptionPane.PLAIN_MESSAGE,null, realAttackableLeaderRegions, realAttackableLeaderRegions[0]);
                sure = JOptionPane.showOptionDialog(null,response + " has " + response.getSoldiers().getPermanentNumberOfSoldiers() + " soldiers. Are you completely sure you want to attack him.","Verification",JOptionPane.YES_NO_OPTION,JOptionPane.PLAIN_MESSAGE,null,null,null);
            }
            catch (Exception e) {
                JOptionPane.showMessageDialog(null,"You should really work with the program.","Try Again",JOptionPane.INFORMATION_MESSAGE);
            }
        }
        
        return response;
    }

    public static void placeSoldiers(Leaders l)
    {
        int cont = JOptionPane.YES_OPTION;
        Object[] yesOrNo = {true,false};
        while (cont == JOptionPane.YES_OPTION)
        {
            
            Object[] soldierArray =new Object[l.getRegionArray().size()];
            l.getRegionArray().toArray(soldierArray);
            boolean valid = true;
            Object response = null;
            Object soldierResponse = null;
            int numberOfSoldiersToMove = -1;
            while (valid)
            {
                do
                {
                    response = JOptionPane.showInputDialog(null, "You have " + l.getSoldiers().getNumberOfSoldiersToUse() + " soldiers. Where would you like to place them?","Place Soldiers",JOptionPane.PLAIN_MESSAGE,null,soldierArray,soldierArray[0]);
                } while (response == null);
                
                do
                {
                    try {
                        if (l.getSoldiers().getNumberOfSoldiersToUse() > 0)soldierResponse = JOptionPane.showInputDialog("Please enter the number of soldiers that you would like to put in " + response + " out of " + l.getSoldiers().getNumberOfSoldiersToUse() + " available soldiers.");
                        else soldierResponse = "0";
                        numberOfSoldiersToMove = Integer.parseInt((String) soldierResponse);
                        if (numberOfSoldiersToMove <= l.getSoldiers().getNumberOfSoldiersToUse()) 
                        {
                            l.getSoldiers().setNumberOfSoldiersToUse(numberOfSoldiersToMove);
                            valid = false;
                        }
                        else JOptionPane.showMessageDialog(null,"You don't have that many soldiers.","TRY AGAIN",JOptionPane.INFORMATION_MESSAGE);
                    } catch (NumberFormatException e) {
                        // Not a number, display error message...
                        JOptionPane.showMessageDialog(null,"Do it again.","Again",JOptionPane.INFORMATION_MESSAGE);
                    }
                } while((numberOfSoldiersToMove < 0)||(valid)||(soldierResponse==null));

                if (numberOfSoldiersToMove > (l.getSoldiers().getNumberOfSoldiersToUse()+numberOfSoldiersToMove)) JOptionPane.showMessageDialog(null,"You don't have that many soldiers.","TRY AGAIN",JOptionPane.INFORMATION_MESSAGE);
                else valid = false;
            }
            
            Regions regionInWhichToPlaceSoldiers = null;
            
            for (int i = 0; i < soldierArray.length; i++)
            {
                if (response == soldierArray[i]) 
                {
                    regionInWhichToPlaceSoldiers = (Regions) response;
                }
            }
            regionInWhichToPlaceSoldiers.assignSoldiers(numberOfSoldiersToMove);
            JOptionPane.showMessageDialog(null,"You have just moved " + numberOfSoldiersToMove + " soldiers into " + regionInWhichToPlaceSoldiers + " and so you now have a total of " + regionInWhichToPlaceSoldiers.getNumberOfActiveSoldiers() + " soldiers.","Soldier Movement",JOptionPane.INFORMATION_MESSAGE);
            if (l.getSoldiers().getNumberOfSoldiersToUse() > 0) cont = JOptionPane.showOptionDialog(null, "Would you like to continue placing troops?","Continue",JOptionPane.YES_NO_OPTION,JOptionPane.PLAIN_MESSAGE,null,null,null);
            else cont = JOptionPane.NO_OPTION;
        }
    }

    public static void addSoldiers(Leaders l)
    {
        int numberOfRegions = l.getRegionArray().size();
        int totalCountries = 0;
        for (int i = 0; i < numberOfRegions; i++)
        {
            totalCountries = totalCountries + l.getRegionArray().get(i).getCountryNum();
        }
        
        Random r = new Random();
        
        int soldiersToAdd = (r.nextInt(5) + 1) * totalCountries;
        l.getSoldiers().addSoldiers(soldiersToAdd);
    }

    public static void fightSequence (Leaders attackingLeader, Leaders defendingLeader)
    {
        Random r = new Random();
        Regions[] regionArray =new Regions[attackingLeader.getRegionArray().size()];
        attackingLeader.getRegionArray().toArray(regionArray);
        ArrayList <Regions> attackingRegionsArray = new ArrayList <Regions>();
        for (Regions reg: regionArray)
        {
            for (int i = 0; i < reg.getAdjacentRegions().length; i++)
            {
                 if (reg.getAdjacentRegions()[i].equals(defendingLeader.getRegionArray().get(0).regionName)) attackingRegionsArray.add(reg);
            }
        }
        Regions[] attackingRegionsOptions = new Regions[attackingRegionsArray.size()];
        attackingRegionsArray.toArray(attackingRegionsOptions);
        Regions response = (Regions) JOptionPane.showInputDialog(null, "You have " + attackingLeader.getRegionArray().size() + " regions. Where would you like to attack from?","Attack From Region",JOptionPane.PLAIN_MESSAGE,null,attackingRegionsOptions,attackingRegionsOptions[0]); //need to change this so the attacking Region must be adjacent
        int indexOfRegion = 0;
        int valid = JOptionPane.YES_OPTION;
        for (int i = 0; i < regionArray.length; i++)
        {
            if (response == regionArray[i]) 
            {
                indexOfRegion = i;
            }
        }

        int attackingSoldiers = attackingLeader.getRegionArray().get(indexOfRegion).getNumberOfActiveSoldiers();
        int defendingSoldiers = defendingLeader.getSoldiers().getPermanentNumberOfSoldiers();

        while ((attackingSoldiers > 1) && (defendingSoldiers > 0) && valid == JOptionPane.YES_OPTION)
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

            valid = JOptionPane.showOptionDialog(null, "You have " + attackingSoldiers + " left while your opponent has " + defendingSoldiers + " soldiers left. Would you like to keep attacking?","Continue",JOptionPane.YES_NO_OPTION,JOptionPane.PLAIN_MESSAGE,null,null,null);
            
        }

        attackingLeader.getRegionArray().get(indexOfRegion).setSoldiers(attackingSoldiers);
        defendingLeader.getSoldiers().setPermanentSoldiers(defendingSoldiers);

        if (defendingSoldiers == 0)
        {
            JOptionPane.showMessageDialog(null,"You defeated " + defendingLeader.getName(),"Victory",JOptionPane.INFORMATION_MESSAGE);
            attackingLeader.getRegionArray().add(defendingLeader.getRegionArray().get(0));
        }
        else if ((attackingSoldiers == 1) || (valid == JOptionPane.NO_OPTION))
        {
            JOptionPane.showMessageDialog(null,"You were defeated by " + defendingLeader.getName(),"Defeat",JOptionPane.INFORMATION_MESSAGE);
        }
        
    }
    
    public static void displayStats(Leaders l)
    {
        for (Regions r: l.getRegionArray())
        {
            if (r.getNumberOfActiveSoldiers() == 0) r.setSoldiers(1);
        }
        
        JOptionPane.showMessageDialog(null,"You rule all of the following territories: ","Opening",JOptionPane.INFORMATION_MESSAGE);
        
        String ownedRegions = l.getRegionArray().get(0).toString() + " with " + l.getRegionArray().get(0).getNumberOfActiveSoldiers() + " soldiers \n";
        
        for (int i = 1; i < l.getRegionArray().size(); i++)
        {
            ownedRegions = ownedRegions + l.getRegionArray().get(i).toString() + " with " + l.getRegionArray().get(i).getNumberOfActiveSoldiers() + " soldiers \n"; 
            
        }
        
        JOptionPane.showMessageDialog(null,ownedRegions,"Territories Controlled",JOptionPane.INFORMATION_MESSAGE);
    }
}

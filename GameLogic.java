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
        Leaders adolfHitler = new Hitler();
        alexanderTheGreat = new AlexanderTheGreat();
        arnold = new Arnold();
        ottoVonBismarck = new Bismarck();
        josephStalin = new Stalin();
        gustavusAdolphus = new Adolphus();
    }

    //     public static void randomiseCPUSoldiers()
    //     { 
    //         winstonChurchill.getSoldiers().assignCPUSoldiers(winstonChurchill);
    //         napoleonBonaparte.getSoldiers().assignCPUSoldiers(napoleonBonaparte);
    //         adolfHitler.getSoldiers().assignCPUSoldiers(adolfHitler);
    //         alexanderTheGreat.getSoldiers().assignCPUSoldiers(alexanderTheGreat);
    //         arnold.getSoldiers().assignCPUSoldiers(arnold);
    //         ottoVonBismarck.getSoldiers().assignCPUSoldiers(ottoVonBismarck);
    //         josephStalin.getSoldiers().assignCPUSoldiers(josephStalin);
    //         gustavusAdolphus.getSoldiers().assignCPUSoldiers(gustavusAdolphus);
    //     }

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
        //l.getSoldiers().setNumberOfSoldiers(20);
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
            //int soldierNum = l.getSoldiers().getNumberOfSoldiers();
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
                        soldierResponse = JOptionPane.showInputDialog("Please enter the number of soldiers that you would like to put in" + response);
                        numberOfSoldiersToMove = Integer.parseInt((String) soldierResponse);
                    } catch (NumberFormatException e) {
                        // Not a number, display error message...
                        JOptionPane.showMessageDialog(null,"Do it again.","Again",JOptionPane.INFORMATION_MESSAGE);
                    }
                } while(numberOfSoldiersToMove < 0);

                if (numberOfSoldiersToMove > l.getSoldiers().getNumberOfSoldiersToUse()) JOptionPane.showMessageDialog(null,"You don't have that many soldiers.","TRY AGAIN",JOptionPane.INFORMATION_MESSAGE);
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
            //String numMoving = JOptionPane.showInputDialog("Please enter the number of soldiers that you would like to put in" + response);
            //int numberOfSoldiersToMove = Integer.parseInt(numMoving);
            //l.getSoldiers().assignSoldiersToRegions(numberOfSoldiersToMove);
            regionInWhichToPlaceSoldiers.assignSoldiers(numberOfSoldiersToMove, l.getSoldiers());
            JOptionPane.showMessageDialog(null,"You have just moved " + numberOfSoldiersToMove + " soldiers into" + regionInWhichToPlaceSoldiers,"Soldier Movement",JOptionPane.INFORMATION_MESSAGE);
            cont = JOptionPane.showOptionDialog(null, "Would you like to continue placing troops?","Continue",JOptionPane.YES_NO_OPTION,JOptionPane.PLAIN_MESSAGE,null,null,null);
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
    
//     public static void displayStats(Leaders l)
//     {
// 
//             response = JOptionPane.showInputDialog(null, "You have " + l.getSoldiers().getNumberOfSoldiersToUse() + " soldiers. Where would you like to place them?","Place Soldiers",JOptionPane.PLAIN_MESSAGE,null,soldierArray,soldierArray[0]);
//             numberOfSoldiersToMove = Integer.parseInt(JOptionPane.showInputDialog("Please enter the number of soldiers that you would like to put in" + response));
// 
//             if (numberOfSoldiersToMove > l.getSoldiers().getNumberOfSoldiersToUse()) JOptionPane.showMessageDialog(null,"You don't have that many soldiers.","TRY AGAIN",JOptionPane.INFORMATION_MESSAGE);
//             else valid = false;
//         }
// >>>>>>> Stashed changes
// 
//         Regions regionInWhichToPlaceSoldiers = null;
// 
//         >>>>>>> origin/master
//         for (int i = 0; i < soldierArray.length; i++)
//         {
// <<<<<<< Updated upstream
//             System.out.print(i.regionName + ",");
//             System.out.print(" region(s) which has/have " + i.getCountryNum()+ " countries and " + i.getNumberOfActiveSoldiers() + " active soldiers");
//         }
//         System.out.println("\nYou have " + l.getSoldiers().getPermanentNumberOfSoldiers() + " of soliders in your home country and " + l.getSoldiers().getNumberOfSoldiersToUse() + " that you can place in any of your regions");
// 
//     }

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
        Object[] regionArray =new Object[attackingLeader.getRegionArray().size()];
        attackingLeader.getRegionArray().toArray(regionArray);
        Regions response = (Regions) JOptionPane.showInputDialog(null, "You have " + attackingLeader.getRegionArray().size() + " regions. Where would you like to attack from?","Attack From Region",JOptionPane.PLAIN_MESSAGE,null,regionArray,regionArray[0]);
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
        int defendingSoldiers = defendingLeader.getSoldiers().getTotalNumberOfSoldiers();

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

            if (attackingSoldiers <= (attackingLeader.getRegionArray().get(indexOfRegion).getNumberOfActiveSoldiers()/2))
            {
                valid = JOptionPane.showOptionDialog(null, "You have " + attackingSoldiers + " left while your opponent has " + defendingSoldiers + " soldiers left. Would you like to keep attacking?","Continue",JOptionPane.YES_NO_OPTION,JOptionPane.PLAIN_MESSAGE,null,null,null);
            }
        }

        attackingLeader.getRegionArray().get(indexOfRegion).assignSoldiers(attackingSoldiers);
        defendingLeader.getRegionArray().get(indexOfRegion).assignSoldiers(defendingSoldiers);

        if (defendingSoldiers == 0)
        {
            JOptionPane.showMessageDialog(null,"You defeated " + defendingLeader.getName(),"Victory",JOptionPane.INFORMATION_MESSAGE);
            attackingLeader.getRegionArray().add(defendingLeader.getRegionArray().get(0));
        }
        else if (attackingSoldiers == 1)
        {
            JOptionPane.showMessageDialog(null,"You were defeated by " + defendingLeader.getName(),"Defeat",JOptionPane.INFORMATION_MESSAGE);
        }
        
    }
// =======
//             if (response == soldierArray[i]) 
//             {
//                 regionInWhichToPlaceSoldiers = (Regions) response;
//             }
//         }
//         <<<<<<< HEAD
//             // to try catch
//         l.getSoldiers().assignSoldiersToRegions(numberOfSoldiersToMove);
//         region.assignSoldiers(numberOfSoldiersToMove);
//         JOptionPane.showMessageDialog(null,"You have just moved " + numberOfSoldiersToMove + " soldiers into" + region + " for a grand total of " + l.getRegion().getSoldiers() + " soldiers.","Soldier Movement",JOptionPane.INFORMATION_MESSAGE);
//         =======
//         //String numMoving = JOptionPane.showInputDialog("Please enter the number of soldiers that you would like to put in" + response);
//         //int numberOfSoldiersToMove = Integer.parseInt(numMoving);
//         //l.getSoldiers().assignSoldiersToRegions(numberOfSoldiersToMove);
//         regionInWhichToPlaceSoldiers.assignSoldiers(numberOfSoldiersToMove, l.getSoldiers());
//         JOptionPane.showMessageDialog(null,"You have just moved " + numberOfSoldiersToMove + " soldiers into" + regionInWhichToPlaceSoldiers,"Soldier Movement",JOptionPane.INFORMATION_MESSAGE);
//         >>>>>>> origin/master
//         cont = JOptionPane.showOptionDialog(null, "Would you like to continue placing troops?","Continue",JOptionPane.YES_NO_OPTION,JOptionPane.PLAIN_MESSAGE,null,null,null);
// 
//     }
// }
// 
// public static void displayStats(Leaders l)
// {
// 
// System.out.println("This will be the window that will keep you updated on all your information");
// System.out.println("You are: " + l.name);
// System.out.print("You rule over the ");
// for (Regions i : l.getRegionArray())
// {
// System.out.print(i.regionName + ",");
// System.out.print(" region(s) which has/have " + i.getCountryNum()+ " countries and " + i.getNumberOfActiveSoldiers() + " active soldiers");
// }
// <<<<<<< HEAD
// =======
// System.out.println("\nYou have " + l.getSoldiers().getPermanentNumberOfSoldiers() + " of soliders in your home country and " + l.getSoldiers().getNumberOfSoldiersToUse() + " that you can place in any of your regions");
// >>>>>>> origin/master
// 
// }

// public static void fightSequence (Leaders attackingLeader, Leaders defendingLeader)
// {
// Random r = new Random();
// //         Random cpu = new Random ();
// //         int cpuSoldiers;
// //         if (win == true)
// //         {
// //             cpuSoldiers = cpu.nextInt(11) + (l.getSoldiers().getNumberOfSoldiers() - 10);
// //         } else 
// //         {
// //             cpuSoldiers = cpu.nextInt(11) + (l.getSoldiers().getNumberOfSoldiers() - 10) + 3;
// //         }
// //         
// //         double prob = cpu.nextDouble();
// //         if (((double)(l.getSoldiers().getNumberOfSoldiers() - cpuSoldiers) / 100 + prob) > .5)
// //         {
// //             return true;
// //         } else
// //         {
// //             return false;
// //         }
// <<<<<<< HEAD
// 
// int attackingSoldiers = attackingLeader.getRegion().getSoldiers();
// int defendingSoldiers = defendingLeader.getSoldiers().getNumberOfSoldiers();
// 
// int valid = JOptionPane.YES_OPTION;
// while ((attackingSoldiers > 1) && (defendingSoldiers > 0) && (valid == JOptionPane.YES_OPTION))
// {
// =======
// Object[] regionArray =new Object[attackingLeader.getRegionArray().size()];
// attackingLeader.getRegionArray().toArray(regionArray);
// Regions response = (Regions) JOptionPane.showInputDialog(null, "You have " + attackingLeader.getRegionArray().size() + " regions. Where would you like to attack from?","Attack From Region",JOptionPane.PLAIN_MESSAGE,null,regionArray,regionArray[0]);
// int indexOfRegion = 0;
// int valid = JOptionPane.YES_OPTION;
// for (int i = 0; i < regionArray.length; i++)
// {
// if (response == regionArray[i]) 
// {
// indexOfRegion = i;
// }
// }
// 
// int attackingSoldiers = attackingLeader.getRegionArray().get(indexOfRegion).getNumberOfActiveSoldiers();
// int defendingSoldiers = defendingLeader.getSoldiers().getTotalNumberOfSoldiers();
// 
// while ((attackingSoldiers > 1) && (defendingSoldiers > 0) && valid == JOptionPane.YES_OPTION)
// {
// >>>>>>> origin/master
// 
// if ((attackingSoldiers > 3) && (defendingSoldiers > 1))
// {
// 
// int[] offenseArray = new int [3];
// int[] defenseArray = new int [2];
// 
// for (int i = 0; i < 3; i++)
// {
// offenseArray[i] = r.nextInt(6) + 1;
// }
// 
// if (Math.max(offenseArray[0],offenseArray[1]) == offenseArray[1])
// {
// int temp = offenseArray[1];
// offenseArray[1] = offenseArray[0];
// offenseArray[0] = temp;
// }
// 
// if (Math.max(offenseArray[0],offenseArray[2]) == offenseArray[2])
// {
// int temp = offenseArray[2];
// offenseArray[2] = offenseArray[0];
// offenseArray[0] = temp;
// }
// 
// if (Math.max(offenseArray[1],offenseArray[2]) == offenseArray[2])
// {
// int temp = offenseArray[2];
// offenseArray[2] = offenseArray[1];
// offenseArray[1] = temp;
// }
// 
// for (int j = 0; j < 2; j++)
// {
// defenseArray[j] = r.nextInt(6) + 1;
// }
// 
// if (Math.max(defenseArray[0],defenseArray[1]) == defenseArray[1])
// {
// int temp = defenseArray[1];
// defenseArray[1] = defenseArray[0];
// defenseArray[0] = temp;
// }
// 
// if ((offenseArray[0] > defenseArray[0]) && (offenseArray[1] > defenseArray[1]))
// {
// defendingSoldiers = defendingSoldiers - 2;
// }
// else if ((offenseArray[0] <= defenseArray[0]) && (offenseArray[1] <= defenseArray[1]))
// {
// attackingSoldiers = attackingSoldiers - 3;
// }
// else
// {
// attackingSoldiers = attackingSoldiers - 1;
// defendingSoldiers = defendingSoldiers - 1;
// }
// 
// }
// else if ((attackingSoldiers > 3) && (defendingSoldiers == 1))
// {
// 
// int[] offenseArray = new int [3];
// 
// for (int i = 0; i < 3; i++)
// {
// offenseArray[i] = r.nextInt(6) + 1;
// }
// 
// if (Math.max(offenseArray[0],offenseArray[1]) == offenseArray[1])
// {
// int temp = offenseArray[1];
// offenseArray[1] = offenseArray[0];
// offenseArray[0] = temp;
// }
// 
// if (Math.max(offenseArray[0],offenseArray[2]) == offenseArray[2])
// {
// int temp = offenseArray[2];
// offenseArray[2] = offenseArray[0];
// offenseArray[0] = temp;
// }
// 
// if (Math.max(offenseArray[1],offenseArray[2]) == offenseArray[2])
// {
// int temp = offenseArray[2];
// offenseArray[2] = offenseArray[1];
// offenseArray[1] = temp;
// }
// 
// int defenseValue = r.nextInt(6) + 1;
// 
// if (offenseArray[0] > defenseValue)
// {
// defendingSoldiers = defendingSoldiers - 1;
// }
// else if (offenseArray[0] <= defenseValue)
// {
// attackingSoldiers = attackingSoldiers - 3;
// }
// 
// }
// else if ((attackingSoldiers == 3) && (defendingSoldiers > 1))
// {
// 
// int[] offenseArray = new int [2];
// int[] defenseArray = new int [2];
// 
// for (int i = 0; i < 2; i++)
// {
// offenseArray[i] = r.nextInt(6) + 1;
// }
// 
// if (Math.max(offenseArray[0],offenseArray[1]) == offenseArray[1])
// {
// int temp = offenseArray[1];
// offenseArray[1] = offenseArray[0];
// offenseArray[0] = temp;
// }
// 
// for (int j = 0; j < 2; j++)
// {
// defenseArray[j] = r.nextInt(6) + 1;
// }
// 
// if (Math.max(defenseArray[0],defenseArray[1]) == defenseArray[1])
// {
// int temp = defenseArray[1];
// defenseArray[1] = defenseArray[0];
// defenseArray[0] = temp;
// }
// 
// if ((offenseArray[0] > defenseArray[0]) && (offenseArray[1] > defenseArray[1]))
// {
// defendingSoldiers = defendingSoldiers - 2;
// }
// else if ((offenseArray[0] <= defenseArray[0]) && (offenseArray[1] <= defenseArray[1]))
// {
// attackingSoldiers = attackingSoldiers - 2;
// }
// else
// {
// attackingSoldiers = attackingSoldiers - 1;
// defendingSoldiers = defendingSoldiers - 1;
// }
// 
// }
// else if ((attackingSoldiers == 3) && (defendingSoldiers == 1))
// {
// 
// int[] offenseArray = new int [2];
// 
// for (int i = 0; i < 2; i++)
// {
// offenseArray[i] = r.nextInt(6) + 1;
// }
// 
// if (Math.max(offenseArray[0],offenseArray[1]) == offenseArray[1])
// {
// int temp = offenseArray[1];
// offenseArray[1] = offenseArray[0];
// offenseArray[0] = temp;
// }
// 
// int defenseValue = r.nextInt(6) + 1;
// 
// if (offenseArray[0] > defenseValue)
// {
// defendingSoldiers = defendingSoldiers - 1;
// }
// else if (offenseArray[0] <= defenseValue)
// {
// attackingSoldiers = attackingSoldiers - 2;
// }
// 
// }
// else if ((attackingSoldiers == 2) && (defendingSoldiers > 1))
// {
// 
// int offenseValue = r.nextInt(6) + 1;
// 
// int[] defenseArray = new int [2];
// 
// for (int j = 0; j < 2; j++)
// {
// defenseArray[j] = r.nextInt(6) + 1;
// }
// 
// if (Math.max(defenseArray[0],defenseArray[1]) == defenseArray[1])
// {
// int temp = defenseArray[1];
// defenseArray[1] = defenseArray[0];
// defenseArray[0] = temp;
// }
// 
// if (offenseValue > defenseArray[0])
// {
// defendingSoldiers = defendingSoldiers - 2;
// }
// else if (offenseValue <= defenseArray[0])
// {
// attackingSoldiers = attackingSoldiers - 1;
// }
// 
// }
// else if ((attackingSoldiers == 2) && (defendingSoldiers == 1))
// {
// 
// int offenseValue = r.nextInt(6) + 1;
// int defenseValue = r.nextInt(6) + 1;
// 
// if (offenseValue > defenseValue)
// {
// defendingSoldiers = defendingSoldiers - 1;
// }
// else if (offenseValue <= defenseValue)
// {
// attackingSoldiers = attackingSoldiers - 1;
// }
// 
// }
// 
// <<<<<<< HEAD
// if (attackingSoldiers <= (attackingLeader.getRegion().getSoldiers()/2))
// =======
// if (attackingSoldiers <= (attackingLeader.getRegionArray().get(indexOfRegion).getNumberOfActiveSoldiers()/2))
// >>>>>>> origin/master
// {
// valid = JOptionPane.showOptionDialog(null, "You have " + attackingSoldiers + " left while your opponent has " + defendingSoldiers + " soldiers left. Would you like to keep attacking?","Continue",JOptionPane.YES_NO_OPTION,JOptionPane.PLAIN_MESSAGE,null,null,null);
// }
// 
// }
// 
// <<<<<<< HEAD
// attackingLeader.getRegion().setSoldiers(attackingSoldiers);
// defendingLeader.getRegion().setSoldiers(defendingSoldiers);
// 
// if (defendingSoldiers == 0)
// {
// JOptionPane.showMessageDialog(null,"You defeated " + defendingLeader.getName() + ". You now have control over " + defendingLeader.getRegion().regionName,"Victory",JOptionPane.INFORMATION_MESSAGE);
// attackingLeader.getRegionArray().add(defendingLeader.getRegion());
// =======
// attackingLeader.getRegionArray().get(indexOfRegion).assignSoldiers(attackingSoldiers);
// defendingLeader.getRegionArray().get(indexOfRegion).assignSoldiers(defendingSoldiers);
// 
// if (defendingSoldiers == 0)
// {
// JOptionPane.showMessageDialog(null,"You defeated " + defendingLeader.getName(),"Victory",JOptionPane.INFORMATION_MESSAGE);
// attackingLeader.getRegionArray().add(defendingLeader.getRegionArray().get(0));
// >>>>>>> origin/master
// }
// else if (attackingSoldiers == 1)
// {
// JOptionPane.showMessageDialog(null,"You were defeated by " + defendingLeader.getName() + ". You now have only 1 soldier in the " + attackingLeader.getRegion() + " while your opponent has " + defendingSoldiers + " soldiers in the " + defendingLeader.getRegion(),"Defeat",JOptionPane.INFORMATION_MESSAGE);
// }
// }
// >>>>>>> Stashed changes
    }

/**
 * Write a description of class Starter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import javax.swing.JOptionPane;

public class Starter
{
    public static void main(String[] args)
    {
        Leaders l = GameLogic.chooseLeader();
        Soldiers s = GameLogic.chooseSoldier();
        l.assignSoldier(s);
        Weapons w = GameLogic.chooseWeapon();
        l.assignWeapon(w);
        GameLogic.displayStats(l);
    }
}

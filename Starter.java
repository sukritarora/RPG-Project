/**
 * Write a description of class Starter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

//import javax.swing.JOptionPane;

public class Starter
{
    public static void main(String[] args)
    {
        boolean win = false;
        //GameLogic.randomiseCPUSoldiers();
        GameLogic g = new GameLogic();
        //Leaders l = null;
        Leaders l = GameLogic.chooseLeader(); //constructing an instance of the Leaders class with the identifier l which is being assigned the value of the static chooseLeader accessor method being invoked upon the GameLogic class with no explicit parameters
        while (!win)
        {
            GameLogic.addSoldiers(l);
            GameLogic.displayStats(l);//invoking the static method displayStats upon the class GameLogic with the explicit parameter of an instance of the Leaders class with the identifier l
            GameLogic.placeSoldiers(l);
            Leaders leaderAttacked = GameLogic.chooseAttack(l);
            GameLogic.fightSequence(l,leaderAttacked);
            if (l.getRegionArray().size() == 8) win = true;
        }
        //         win = GameLogic.fightSequence (l, win);
        // 
        //         Regions r = GameLogic.chooseAttack(l);
        //         win = GameLogic.fightSequence (l, win, r);

    }
}

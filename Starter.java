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
        boolean win = true;
        Leaders l = GameLogic.chooseLeader(); //constructing an instance of the Leaders class with the identifier l which is being assigned the value of the static chooseLeader accessor method being invoked upon the GameLogic class with no explicit parameters
        GameLogic.displayStats(l);//invoking the static method displayStats upon the class GameLogic with the explicit parameter of an instance of the Leaders class with the identifier l
        GameLogic.placeSoldiers(l);
        GameLogic.chooseAttack(l);
        win = GameLogic.fightSequence (l, win);
    }
}

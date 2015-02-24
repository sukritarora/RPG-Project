
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
        Leaders l = GameLogic.chooseLeader(); //constructing an instance of the Leaders class with the identifier l which is being assigned the value of the static chooseLeader accessor method being invoked upon the GameLogic class with no explicit parameters
        Soldiers s = GameLogic.chooseSoldier(); //constructing an instance of the Soldiers class with the identifier s which is being assigned the value of the static chooseSoldier accessor method being invoked upon the GameLogic class with no explicit parameters
        l.assignSoldier(s); //invoking the mutator method assignSoldier upon an newly constructed instance of the Leaders class with an expicit parameter of an instance of the Soldiers class with the identifier s
        Weapons w = GameLogic.chooseWeapon(); //constructing an instance of the Weapons class with the identifier w which is being assigned the value of the static chooseWeapons accessor method being invoked upon the GameLogic class with no explicit parameters
        l.assignWeapon(w); //invoking the mutator method assignWeapon upon a newly constructed instance of the Leaders class with an explicit parameter of an instance of the Weapons class with the identifier w
        GameLogic.displayStats(l); //invoking the static method displayStats upon the class GameLogic with the explicit parameter of an instance of the Leaders class with the identifier l
    }
}

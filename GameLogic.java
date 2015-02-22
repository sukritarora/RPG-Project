
/**
 * Write a description of class GameLogic here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import javax.swing.*;
public class GameLogic
{
    public static Leaders chooseLeader ()
    {
        String[] leaders = {"Winston Churchill","Napoleon Bonaparte","Adolf Hitler","Alexander the Great","Otto von Bismarck","Joseph Stalin","Gustavus Adolphus","Arnold Schwarzenegger"};
        String response = (String) JOptionPane.showInputDialog(null, "Which European Leader would you like to be.", "Leader", JOptionPane.PLAIN_MESSAGE,null, leaders, leaders[0]);
        Leaders l = null;
        switch (response)
        {
            case "Winston Churchill": 
            {
                l = new Churchill();
                
            }
            case "Napoleon Bonaparte":
            {
                l = new Napoleon();
            }
            case "Adolf Hitler":
            {
                l = new Hitler();
            }
            case "Alexander the Great":
            {
                l = new AlexanderTheGreat();
            }
            case "Otto von Bismarck":
            {
                l = new Bismarck();
            }
            case "Joseph Stalin":
            {
                l = new Stalin ();
            }
            case "Gustavus Adolphus":
            {
                l = new Adolphus();
            }
            case "Arnold Schwarzenegger":
            {
                l = new Arnold();
            }
        }
        return l; 
    }
}

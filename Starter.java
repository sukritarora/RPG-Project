
/**
 * Write a description of class Starter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import javax.swing.JOptionPane;

public class Starter extends JOptionPane
{
    // instance variables - replace the example below with your own
    //Anish!
    //anishp2
    //THis is Nilay test

    //This is pooja

    //this is shravan test

    /**
     * Constructor for objects of class Starter
     */
    public Starter(String[] args)
    {
        String[] leaders = {"Winston Churchill","Napoleon Bonaparte","Adolf Hitler","Alexander the Great","Otto von Bismarck","Joseph Stalin","Gustavus Adolphus","Arnold Schwarzenegger"};
        String response = (String) JOptionPane.showInputDialog(null, "Which European Leader would you like to be.", "Leader", JOptionPane.PLAIN_MESSAGE,null, options, options[0]);
    }
}

/* Author: Aidan Din    Zinnformatics.java
*
* Calculates the prices and discounts for a web design software
*/

import javax.swing.JOptionPane; //imports JOptionPane

public class Zinnformatics
{
    public static void main (String[] args)
    {
        int againOrExit = 1;
        do { //user controlled exit loop

            //gets user input for the organization ordering the packages and the package amount
            String name = JOptionPane.showInputDialog("What's the name of your organization?");

            String amountString = JOptionPane.showInputDialog("How many packages are you ordering?");
            int amount = Integer.parseInt(amountString);

            int discountToPercent = (int)(discount(amount) * 100);
            //final output
            JOptionPane.showMessageDialog(null, "Thank you for your order " + name + "! You have ordered " + amount + " packages, at a " + discountToPercent + "% discount. Your final cost will be $" + zinnformatics(amount) + ".");
            //user input for controlled exit
            String againOrExitInput = JOptionPane.showInputDialog("Type 1 to re-run the program. Type 2 to exit the program.");
            againOrExit = Integer.parseInt(againOrExitInput);

        } while (againOrExit == 1); //user controlled exit loop
        
        if (againOrExit == 2) {
            JOptionPane.showMessageDialog(null, "Thank you for using my program <3");
        }
    }
    public static double zinnformatics(int quantity) { //returns cost
        
        double finalCost = (quantity * 99) * discount(quantity);

        return finalCost;

    }
    public static double discount(int quantity) { //return decimal value, not percent
        if (quantity >= 10 && quantity <= 19) { //gets discounts based on quantities
            return 0.2;
        } else if (quantity >= 20 && quantity <= 49) {
            return 0.3;
        } else if (quantity >= 50 && quantity <= 99) {
            return 0.4;
        } else if (quantity >= 100) {
            return 0.5;
        } else {
            return 0;
        }
    }
}

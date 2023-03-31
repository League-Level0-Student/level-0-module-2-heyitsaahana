package _03_string_conversion._3_rollercoaster;

import javax.swing.JOptionPane;

public class RollerCoaster {

	// 1) Make a main method that includes all the steps below…. 
		public static void main(String[] args) {
			
 String heightToRide=JOptionPane.showInputDialog("Enter your height in inches");
 
		
		int heightAsInt;
		// 2) Ask the user to enter their height in inches using JOptionPane and set it to the variable heightToRide
		https://github.com/League-Level0-Student/level-0-module-2-heyitsaahana.git
		// Uncomment the line below...
			//if( heightToRide > 42 ) { }
		
		// Do you see the heightToRide > 42 underlined red? That is because you are comparing a STRING to an INTEGER.
		
		// 3) Convert heightToRide to heightAsInt using Integer.parseInt();  Hint: int heightAsInt = Integer.parse... 
	    heightAsInt = Integer.parseInt(heightToRide);
		// 4) If the heightAsInt is greater than or equal to 48 inches tall print:
	    // "Hurray! You are tall enough to ride the coaster alone!" Hint: use JoptionPane
		if(heightAsInt>=48) {
			JOptionPane.showMessageDialog(null, "Hurray!You are tall enough to ride the roller coaster alone!");
		}
		
		// 5) Else if the heightAsInt is greater than or equal to 42 inches tall print:
		// "You can ride the coaster with someone else!" 
	if(heightAsInt<=42) {
		JOptionPane.showMessageDialog(null,"You can ride the coaster with someone else!");
	}
	}
		// 6) else print: "You must be at least 42 inches tall to ride the roller coaster pal!"
		}


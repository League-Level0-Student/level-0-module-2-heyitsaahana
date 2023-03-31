package _03_string_conversion._4_voting_booth;

import javax.swing.JOptionPane;

public class voting_booth {
	
	public static void main(String[] args) {
	String agetoVote=JOptionPane.showInputDialog("How old are you in years?");
		int ageAsInt;
		ageAsInt=Integer.parseInt(agetoVote);
		if(ageAsInt>=18) {
			JOptionPane.showInputDialog("Who would you like to be president");
		}
		if(ageAsInt<=17) {
			JOptionPane.showMessageDialog(null,"Sorry,Nobody cares what you think");
		}
		}
		
	}




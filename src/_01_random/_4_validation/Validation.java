//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _01_random._4_validation;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		
		Random randomMaker = new Random();
		for(int n=0;n<=10;n++) {
		
		int randomNumber = randomMaker.nextInt(5);
		
		System.out.println(randomNumber);

		// 1. Use each value of randomNumber to give the user a random compliment.
		Random gen=new Random();
		int randomChoice=gen.nextInt(4-1+1)+1;
		if (randomChoice==1) {
			JOptionPane.showMessageDialog(null,"You rock!");
		}
		else if(randomChoice==2) {
        	 JOptionPane.showMessageDialog(null, "You rule!");
        
         }
		else if(randomChoice==3) {
			JOptionPane.showMessageDialog(null, "You are awesome");
		
		}
		else if(randomChoice==4) {
			JOptionPane.showMessageDialog(null, "You're amazing");
		}
		}
		// 2. Repeat all the code above 10 times
		
		
		// 3. Find someone to test out your program. They will like it :)
	}
}

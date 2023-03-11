package _01_random._6_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class Lottery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random gen=new Random();
		
		int randomChoice1=gen.nextInt(100-0+1)+0;
		int randomChoice2=gen.nextInt(100-0+1)+0;
		int randomChoice3=gen.nextInt(100-0+1)+0;
		int randomChoice4=gen.nextInt(100-0+1)+0;
		int randomChoice5=gen.nextInt(100-0+1)+0;
		int randomChoice6=gen.nextInt(100-0+1)+0;
		String x=randomChoice1+" "+randomChoice2+" "+randomChoice3+" "+randomChoice4+" "+randomChoice5+" "+randomChoice6+" ";
		JOptionPane.showMessageDialog(null,x);
		
			
	}

	

}

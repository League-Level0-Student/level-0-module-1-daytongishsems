package _07_riddler;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import java.util.Random;

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score

		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles

		// 4. If they got the answer right, pop up "correct!" and increase the score by one

		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
	
		int score = 0;	
		 String talk0 = JOptionPane.showInputDialog("What is greater than God,"+
				 " more evil than the devil,"+
				 "the poor have it,"+
				 "the rich need it,"+
				 "and if you eat it, you'll die?");
		
		 if (talk0.equals("Nothing")) {
			 score = score +1;
			  JOptionPane.showInputDialog("+1 Point");
		 }
			
		 else {
				  JOptionPane.showMessageDialog(null, "You're Wrong, the correct answer is Nothing.");
		
		
		 }	
		
	}
 }

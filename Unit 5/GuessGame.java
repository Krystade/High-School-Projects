import javax.swing.*;

public class GuessGame {
	public static void main (String[] args){
		//Have user choose size of board
		int rows = Integer.parseInt(JOptionPane.showInputDialog("How many rows?"));
		int columns = Integer.parseInt(JOptionPane.showInputDialog("How many columns?"));
		//Create two tables
		String[][]table = new String[rows][columns];
		//Will have answers
		String[][]hiddenTable = new String[rows][columns];
		//Will be displayed
		
		//Fill up table with numbers from 1 - 100
		for (int i = 0; i < table.length; i++){
			for(int j = 0; j < table[i].length; j++){ 
				table[i][j] = ((int)(Math.random() * 100) + 1) + "";
				hiddenTable[i][j] = "X";
			}
		}
		//Place the 0
		int zeroRow = (int)(Math.random() * rows);
		int zeroColumn = (int)(Math.random() * rows);
		table[zeroRow][zeroColumn] = "0";
		//Print out board
		//System.out.print(printBoard(table));
		System.out.print(printBoard(hiddenTable));
		
		//Explain how to format guess
		//JOptionPane.showMessageDialog(null, "Enter your answer as row and column seperated by a comma\nex. 3,4");
		//Begin loop to allow multiple guesses
		boolean correct = false;
		int[] guess = new int[2];
		while (!correct){
			guess[0] = Integer.parseInt(JOptionPane.showInputDialog("Guess a row")) - 1;
			//Integer.parseInt(guess[0]);
			guess[1] = Integer.parseInt(JOptionPane.showInputDialog("Guess a column")) - 1;
			//Integer.parseInt(guess[1]);
			if((table[guess[0]][guess[1]]).equals("0")){
				JOptionPane.showMessageDialog(null,"Correct! You found the 0 at " + (guess[0] + 1)  + "," + (guess[1] + 1));
				correct = true;
			}else{
				System.out.println("\f");
				JOptionPane.showMessageDialog(null,"You are " + (Math.abs(zeroRow - guess[0]) + " row(s) away and " + (Math.abs(zeroColumn - guess[1])) + " column(s) away from 0."));
				hiddenTable[guess[0]][guess[1]] = "N";
				System.out.print(printBoard(hiddenTable));
			}
		}
	}
	
	public static String printBoard(String[][] table) {
		String output = "";
		for (int i = 0; i < table.length; i++){
			for(int j = 0; j < table[i].length; j++){ 
				output += table[i][j] + "\t";
			}
			output += "\n\n";
		}
		return output;
	}
}
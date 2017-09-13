//Jack Schmid
import java.util.*;
public class OnlyZeroOrOne{
    public static void main(String args[]){
        System.out.print("Size of Square: ");
        Scanner input = new Scanner(System.in);
        
        int size = input.nextInt();
        int[][] board = new int[size][size];
        
        for (int i = 0; i < board.length; i++){
            int row = 0;
            for (int j = 0; j < board[i].length; j++){
                board[i][j] = (int)(Math.random() * 2);
                System.out.print(board[i][j] + "\t");
                row += board[i][j];
            }
            if(row == 0){
                System.out.println("All 0's on row " + i);
            }else if (row == board.length){
                System.out.println("All 1's on row " + i);
            }else{
                System.out.println("No same numbers on row " + i);
            }
            System.out.println("\n");
        }
        
        
        for (int i = 0; i < board.length; i++){
            int column = 0;
            for (int j = 0; j < board[i].length; j++){
                column += board[j][i];
            }
            if(column == 0){
                System.out.println("All 0's on column " + i);
            }else if (column == board.length){
                System.out.println("All 1's on column " + i);
            }else{
                System.out.println("No same numbers on column " + i);
            }
            System.out.println("");
        }
        
        int j = board.length;
        int rDiagonal = 0;
        for (int i = 0; i < board.length; i++){
            j--;
            rDiagonal += board[j][i];
            //System.out.println("j,i: " + j + "," + i);
        }
        if (rDiagonal == 0){
            System.out.println("All 0's on right to left diagonal ");
        }else if (rDiagonal == board.length){
            System.out.println("All 1's on right to left diagonal ");
        }else{
            System.out.println("No same numbers on right to left diagonal ");
        }
        
        
        j = board.length;
        int lDiagonal = 0;
        for (int i = board.length - 1; i >= 0; i--){
            j--;
            lDiagonal += board[i][j];
            //System.out.println("i,j: " + i + "," + j);
        }
        if (lDiagonal == 0){
            System.out.println("All 0's on left to right diagonal ");
        }else if (lDiagonal == board.length){
            System.out.println("All 1's on left to right diagonal ");
        }else{
            System.out.println("No same numbers on left to right diagonal ");
        }        
    }
}

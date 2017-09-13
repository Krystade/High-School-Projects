//Jack Schmid
public class ZeroAndOne{
    public static void main(String args[]){
        int[][] board = new int[5][5];
        int lRow = 0;
        int lColumn = 0;
        int rIndex = 0;
        int cIndex = 0;
        for (int i = 0; i < board.length; i++){
            int row = i;
            for (int j = 0; j < board[i].length; j++){
                board[i][j] = (int)(Math.random() * 2);
                System.out.print(board[i][j] + "\t");
                row += board[i][j];
            }
            if (row > lRow){
                lRow = row;
                rIndex = i;
            }
            System.out.println("\n");
        }
        
        for (int i = 0; i < board[0].length; i++){
            int column = 0;
            for (int j = 0; j < board.length; j++){
                column += board[i][j];
            }
            if (column > lColumn){
                lColumn = column;
                cIndex = i;
            }
        }
        System.out.println("Largest row index: " + rIndex + "\nLargest column index: " + lColumn);
    }
}

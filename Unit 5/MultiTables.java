//JackSchmid
public class MultiTables{
    public static void main(String[] args){
        int[][] table = new int[25][26];
        for (int i = 1; i < table.length; i++){
            for (int j = 1; j < table[i].length; j++){
                table[i][j] = i * j;
                System.out.print(i * j + "\t");
            }
            System.out.println("\n");
        }
    }
}

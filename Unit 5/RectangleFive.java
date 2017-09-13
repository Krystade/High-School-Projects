//Jack Schmid
public class RectangleFive{
    public static void main(String[] args){
        int[][] rect = new int[3][4];
        for (int i = 0; i < rect.length; i++){
            for (int j = 0; j < rect[0].length; j++){
                rect[i][j] = (int)(Math.random() * 10);
                System.out.print(rect[i][j] + "\t");
            }
            System.out.println();
        }
        
        for (int i = 0; i < rect.length; i++){
            for (int j = 0; j < rect[0].length; j++){
                if(rect[i][j] == 5){
                    System.out.println("5 found at Row: " + (i + 1) + " Column: " + (j + 1));
                }
            }
        }
    }
}

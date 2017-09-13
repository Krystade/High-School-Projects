//Jack Schmid
public class OneToFifteen{
    public static void main(String[] args){
        int[][] rect = new int[3][5];
        int sum = 0;
        int rowSum = 0;
        int colSum = 0;
        int count = 1;
        System.out.println("Values: ");
        
        for (int i = 0; i < rect.length; i++){
            rowSum = 0;
            for (int j = 0; j < rect[i].length; j++){
                rect[i][j] = count;
                System.out.print(rect[i][j] + "\t");
                sum += rect[i][j];
                count++;
                rowSum += rect[i][j];
            }
            System.out.println("\tRow Sum: " + rowSum);
            System.out.println();
        }
        
        for (int i = 0; i < rect[0].length; i++){
            colSum = 0;
            for (int j = 0; j < rect.length; j++){
                colSum += rect[j][i];
            }
            System.out.println("\nColumn " + (i + 1) + " Sum: " + colSum);
        }
        
        System.out.println("\nTotal Sum: " + sum);
        
        
        
        /*
        for (int i = 0; i < rect.length; i++){
            for (int j = 0; j < rect[0].length; j++){
                rect[i][j] = (int)(Math.random() * 15) + 1;
                System.out.print(rect[i][j] + "\t");
                sum += rect[i][j];
            }
            System.out.println("");
        }
        
        System.out.println("\nSorted Values: ");
        
        for (int h = 0; h < rect.length; h++){
            int min = rect[h][0];
            int indexI = h;
            int indexJ = h;
            for (int i = 0; i < rect.length; i++){
                for (int j = 0; j < rect[0].length; j++){
                    if(min < rect[i][j]){
                        min = rect[i][j];
                        indexI = i;
                        indexJ = j;
                    }
                }
            }
            temp = rect[i][j];
            rect[i][j] = rect[indexI][indexJ];
            rect[indexI][indexJ] = temp;
        }
        
                for (int i = 0; i < rect.length; i++){
            for (int j = 0; j < rect[0].length; j++){
                System.out.print(rect[i][j] + "\t");
            }
            System.out.println("");
        }
        */
    }
}
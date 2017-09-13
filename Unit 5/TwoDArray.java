//Jack Schmid
public class TwoDArray {
    public static void main(String[] args) {
        int[][]numbers = new int[6][5];
        System.out.println("Before Sort");
        for (int i = 0; i < numbers.length; i++){
            for (int j = 0; j <numbers[i].length; j++){
                numbers[i][j] = (int)(Math.random()*51) + 50;
                System.out.print(" " + numbers[i][j]);
                //end of inner loop
            }
            //sort
        System.out.println();
        }
        for (int i = 0; i < numbers.length; i++){
            System.out.println(" ");
            for (int j = 0; j <= numbers[i].length - 1; j++){
                int min = numbers[i][j];
                int index = j;
                for (int k = j + 1; k < numbers[i].length; k++){
                    if (min > numbers[i][k]){
                        min = numbers[i][k];
                        index = k;
                    }
                }
                numbers[i][index] = numbers[i][j];
                numbers[i][j] = min;
                System.out.print(" " + numbers[i][j]);
            }
        }
    }
}

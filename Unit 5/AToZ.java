//JackSchmid
public class AToZ{
    public static void main(String[] args){
        int[][] table = new int[5][5];
        int count = 0;
        for (int i = 0; i < table.length; i++){
            if (i % 2 == 0){
                System.out.print("\t");
            }
            for (int j = 0; j < table[i].length; j++){
                if(j == 0){
                    System.out.print((char)(count + 65) + "\t");
                }else{
                    System.out.print("\t" + (char)(count + 65) + "\t");
                }
                count++;
                if(count >= 26){
                    count = 0;
                }
            }
            System.out.println("\n");
        }
    }
}

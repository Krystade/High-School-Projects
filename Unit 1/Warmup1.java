
public class Warmup1{
    public static void main(String[] args){
        int[] array = new int[8];
        int place = -11;
        for (int i = 0; i < 8; i++){
            array[i] = (int)(Math.random()*21);
            System.out.println(array[i]);
        }
        int max = array[0];
        for (int i = 1; i < 8; i++){
            if( max < array[i]){
                max = array[i];
            }
            if ( max == array[i]){
            place = i;
        }
        }
        System.out.println("max = " + max);
        System.out.println("The max was located in array[" + place + "]");
    }
}

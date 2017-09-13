
public class Warmup2{
    public static void main(String[] args){
        int[] array = new int[10];
        int place = 0;
        int eight = -1;
        for (int i = 0; i < 10; i++){
            array[i] = (int)(Math.random()*21);
            System.out.println(array[i]);
        }
        int max = array[0];
        for (int i = 0; i < 10; i++){
            if( max < array[i]){
                max = array[i];
            }else{}
            if ( array[i] == 8){
                eight = i;
            }else{}
            if ( max == array[i]){
            place = i;
        }else{}
        }
        for (int i = 1; i < 10; i++){
            
        }
        System.out.println("max = " + max);
        System.out.println("The max was located in array[" + place + "]");
        if ( eight != -1){
            System.out.println("There was an 8 found in array[" + eight + "]");
        }else{
        System.out.println("There was no 8 found in the array");
        }
    }
}

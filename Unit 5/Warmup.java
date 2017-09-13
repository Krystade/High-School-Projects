//JackSchmid
public class Warmup{
    public static void main(String[] args){
        int[] Two = new int[10];
        int temp;
        for (int i = 0; i < Two.length; i++){
            Two[i] = (int)(Math.random() * 21);
            System.out.println(Two[i]);
        }
        for (int i = 0; i < Two.length - 1; i++){
            int min = Two[i];
            int index = i;
            for(int j = i + 1; j < Two.length; j++){
                if (min > Two[j]){
                    min = Two[j];
                    index = j;
                }
            }
            temp = Two[i];
            Two[i] = Two[index];
            Two[index] = temp;
        }
        System.out.println();
        int count = 0;
        while (count < Two.length){
            if (Two[count] == 2){
                System.out.println("2 was found in Two[" + count + "]");
            }
            count++;
        }
        System.out.println();
        for (int i = 0; i < Two.length; i++){
            System.out.println(Two[i]);
        }
    }
}

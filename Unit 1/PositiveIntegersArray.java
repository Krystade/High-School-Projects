public class PositiveIntegersArray{
    public static void main(String[] args){
        int[] numbers = {0,0,0,0,0,0,0,0,0,0};
        for (int i = 0; i < 10; i++){
            int random = (int) (Math.random() * 100);
            int negative = (int) (Math.random() * 2);
            if (negative == 1){
                random *= -1;
            }
            numbers[i] = random;
            System.out.println(numbers[i]);
        }
        int count = 0;
        for(int i = 0; i < 10; i++){
            if (numbers[i] > 0){
                count++;
            }
        }
        System.out.println("There are " + count + " positive numbers.");
    }
}

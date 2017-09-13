
public class Factorial{
    public static void main(String[] args){
        int n = 0;
        int num = 1;
        if (n > 12) {
            throw new IllegalArgumentException("n is greater than 12.");
        }
        if (n == 0){
        }else{
            for (int i = 1; i <= n; i++){
               num *= i;
               System.out.println(num);
            }
        }
        System.out.println(num);
    }
}

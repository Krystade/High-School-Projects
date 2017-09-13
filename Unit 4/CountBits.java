import java.util.*;
public class CountBits{
    public static void main(String[] args){
        String binary = "";
        int n = 1738;
        int bits = 0;
            while (n > 0){
                long remainder = n % 2;
                binary += remainder;
                n /= 2;
            }
        for (int i = 0; i < binary.length(); i++){
            if (binary.substring(i, i + 1).equals("1")){
                bits++;
            }else{}
        }
        System.out.println(bits);
    }
}

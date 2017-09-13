import java.util.Scanner;
public class EvenOrOdd{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int number1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = input.nextInt();
        int remainder1 = number1 % 2;
        int remainder2 = number2 % 2;
        String string1;
        String string2;
        if (remainder1 == 0){
            string1 = " even ";
}else {
    string1 = " odd ";
}if (remainder2 == 0){
    string2 = " even ";
}else {
    string2 = " odd ";
}
System.out.println(number1 + " is an" + string1 + "number and " + number2 + " is an" + string2 + "number");
}
}
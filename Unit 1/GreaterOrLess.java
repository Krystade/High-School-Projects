import java.util.Scanner;
public class GreaterOrLess{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int number1 = input.nextInt();
        System.out.print("\nEnter the second number: ");
        int number2 = input.nextInt();
        if (number1 > number2){
            System.out.println("The value of number 1 is " + number1 + " and it is greater than number2 whose value is " + number2);
        }else if (number2 > number1){
            System.out.println("The value of number2 is " + number2 + " and it is greater than number1 whose value is " + number1);
        }else{
            System.out.println("number1 and number2 have the same value which is " + number1);
        }
    }
}
import java.util.Scanner;
public class Sorter{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();
        int temp;
        if (number1 < number2 && number2 < number3){
            System.out.println("The numbers from least to greatest are " + number1 + " " + number2 + " " + number3);
}else if (number2 < number3 && number3 < number1){
    System.out.println("The numbers from least to greatest are " + number2 + " " + number3 + " " + number1);
}else if (number3 < number1 && number1 < number2){
    System.out.println("The numbers from least to greatest are " + number3 + " " + number1 + " " + number2);
}else if (number2 < number1 && number1 < number3){
    System.out.println("The numbers from least to greatest are " + number2 + " " + number1 + " " + number3);
}else if (number1 < number3 && number3 < number2){
    System.out.println("The numbers from least to greatest are " + number1 + " " + number3 + " " + number2);
}else if (number3 < number2 && number2 < number1){
    System.out.println("The numbers from least to greatest are " + number3 + " " + number2 + " " + number1);
}
}
}
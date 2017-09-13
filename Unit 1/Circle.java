import java.util.Scanner;
public class Circle
{
    public  static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a radius: ");
        double radius = input.nextDouble();
        double area = 3.14159 * radius * radius;
        double circumference = 2 * 3.14159 * radius;
        System.out.println("A circle of radius " + radius + " has an area of " + area + "  and a circumference of " + circumference);
    }
}

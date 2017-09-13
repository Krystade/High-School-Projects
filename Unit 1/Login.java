import java.util.Scanner;
public class Login{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        while (true){
        System.out.print("Enter your Username: ");
        String user = input.next();
        System.out.print("Enter your Password: ");
        int pass = input.nextInt();
        String correctUser = "jack";
        int correctPass = 1230;
        if (user.equals(correctUser)){
            if (pass == correctPass){
                System.out.println("You have successfully logged in");
                break;
            }
            if (pass != correctPass){
                System.out.println("Login unsuccessful...try again");
            }
        }
       if (user != correctUser){
        System.out.println("Login unsuccessful...try again");
       }
    }
    }
}

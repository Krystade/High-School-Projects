import java.util.Scanner;
public class NewPassword{
    public static void main (String[] args){
        String pass;
        String attempt;
        boolean isAlphanumeric = false;
        pass = "Password@";
        System.out.println("Password must include at least 6 characters and " + 
        "\none non-alphanumeric character(+,-,*,/, or @)");
        Scanner input = new Scanner(System.in);
        if (pass.length() < 6){
            System.out.println("Password must be 6 characters long");
        }else{
            for ( int i = 0; i < pass.length(); i++){
                int pos1 = i;
                int pos2 = i + 1;
                if (pass.substring(pos1, pos2).equals("+")){
                    isAlphanumeric = true;
                    break;
                }else if (pass.substring(pos1, pos2).equals("-")){
                    isAlphanumeric = true;
                    break;
                }else if (pass.substring(pos1, pos2).equals("*")){
                    isAlphanumeric = true;
                    break;
                }else if (pass.substring(pos1, pos2).equals("/")){
                    isAlphanumeric = true;
                    break;
                }else if (pass.substring(pos1, pos2).equals("@")){
                    isAlphanumeric = true;
                    break;
                }else{
                }
            }
            if (isAlphanumeric == true){
                System.out.print("Enter your password: ");
                attempt = input.next();
                if (pass.equals(attempt)){
                    System.out.println("Correct Password.");
                }else{
                    System.out.println("Wrong Password.");
                }
            }else{
                System.out.println("Password must include at least one non-alphanumeric character(+,-,*,/, or @)");
            }
        }
    }
}

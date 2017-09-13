
public class Diamond{
    public static void main(String[] args){
        int n = 3;
        if (n % 2 == 0 || n < 0){
            //return null;
        }
        int num = n - 1;
        String[] diamond = new String[n];
        int space = 1 + (n / 2);
        String ast = "*";
        String done = "";
        for (int i = 0; i < 1 + (n / 2); i++){
            diamond[i] = "";
            for (int j = 1; j < space; j++){
                diamond[i] += " ";
            }
            space--;
            diamond[i] += ast;
            ast += "**";
        }
        for (int i = 0; i < n/2; i++){
            diamond[num] = diamond[i];
            num--;
        }
        for (int i = 0; i < diamond.length; i++){
            done += diamond[i] + "\n";
            System.out.println(done);
        }
        //return done;
    }
}
public class StringArray{
    public static void main(String[] args){
        String[] movies = {"Now you see me","Avengers","Civil War"};
        String[] songs = {"Anti-Hu","The End's Not Near","Charborg"};
        int count = 0;
        for(int i = 0;i < 3 ;i++){
            System.out.print(movies[i] + "\n");
        }
        System.out.println("\n");
        while(count < 3){
            System.out.print(songs[count] + " \t");
            count++;
        }
    }
}


public class CollegeArray{
    public static void main(String[] args){
        String[] colleges = {"Berkeley","Biola University","Whittier","Scripps"};
        String smallest = "None";
        int min = 100;
        int letters = 0;
        for (int i = 0; i < 4; i++){
            System.out.println(colleges[i] + " is " + colleges[i].length() + " letters long.");
            if (colleges[i].length() < min){
                smallest = colleges[i];
                letters = colleges[i].length();
            }
        }
    System.out.println("The college with the shortest length is " + smallest + " with " + letters + " letters.");
    colleges[3] = null;
    for (int i = 0; i < 4; i++){
            System.out.println(colleges[i]);
        }
    }
}

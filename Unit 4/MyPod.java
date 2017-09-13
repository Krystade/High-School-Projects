
public class MyPod{
    private String color;
    private double memory;
    private Song[] songLibrary;
    //private String[] song = {"Heathens","Closer","24K Magic"};
    public MyPod(){
        color = "Red";
        memory = 16;
        songLibrary = new Song[3];
        songLibrary[0] = new Song("Heathens", 195);
        songLibrary[1] = new Song("Closer", 276);
        songLibrary[2] = new Song("24K Magic", 226);
    }
    public MyPod(String color, double memory){
        this.color = color;
        this.memory = memory;
        songLibrary = new Song[3];
        songLibrary[0] = new Song("Heathens", 195);
        songLibrary[1] = new Song("Closer", 276);
        songLibrary[2] = new Song("24K Magic", 226);
        
    }
    public String toString(){
        String output = "This MyPod is " + color + "\nIt has " + memory +
        "GBs of memory\nThe Songs in this MyPod are - \n\n";
        for ( Song song : songLibrary ){
            output += song + "\n";
        }
        return output;
    }
}

import java.util.ArrayList;
public class MyPod2{
    private String color;
    private double memory;
    private ArrayList<Song> songLibrary = new ArrayList<Song>();
    //private String[] song = {"Heathens","Closer","24K Magic"};
    public MyPod2(){
        color = "Red";
        memory = 16;
        songLibrary.add( new Song("Heathens", 195) );
        songLibrary.add( new Song("Closer", 276) );
        songLibrary.add( new Song("24K Magic", 226) );
    }
    public MyPod2(String color, double memory){
        this.color = color;
        this.memory = memory;
        songLibrary.add( new Song("Heathens", 195) );
        songLibrary.add( new Song("Closer", 276) );
        songLibrary.add( new Song("24K Magic", 226) );
        
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

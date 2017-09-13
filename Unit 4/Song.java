import java.util.Scanner;
public class Song
{
    //Write the instance variables
    int length;
    int seconds;
    int minutes;
    String name;
    //Write constructors
    public Song()
    {
        length = 98;
        name = "Ramen King";
    }//end constructor Song
    public Song(String diffName, int diffLength)
    {
        length = diffLength;
        name = diffName;
    }
    public void convertToMinSec(){
        seconds = length % 60;
        minutes = length / 60;
    }
    public String toString()
    {
        String output = new String();
        convertToMinSec();
        output = "Name: " + name + "\n" + "The Length of the song is: " + minutes + " minutes and " + seconds + " seconds\n";
        return output;
    }
}// end class Song

import java.util.Scanner;
public class Song
{
    //Write the instance variables
    int tempo;
    int length;
    int seconds;
    int minutes;
    String name;
    private int yearReleased;
    //Write constructors
    public Song()
    {
        tempo = 90;
        length = 98;
        name = "Ramen King";
        yearReleased = 2014;
    }//end constructor Song
    public Song(int diffTempo, int diffLength, String diffName, int yearReleased)
    {
        tempo = diffTempo;
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
        output = "Tempo is: " + tempo + "\n" +
                 "Length is: " + length + "\n" + 
                 "Name is: " + name + "\n" + "Year Released: " + yearReleased + 
                 "\n" + "The Length of the song is: " + minutes + " minutes and " + 
                 seconds + " seconds\n";
        return output;
    }
    //Write getter and setter methods
    public int getYearReleased(){
        return yearReleased;
    }
    public void setYearReleased(int year){
        int pass = 111;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the password: ");
        int attempt = input.nextInt();
        if (attempt == pass){
        this.yearReleased = year;
        }else{
            System.out.print("Nah\n");
        }
    }
}// end class Song

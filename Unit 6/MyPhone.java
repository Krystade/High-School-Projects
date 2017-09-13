//Jack Schmid
import java.util.ArrayList;
public class MyPhone extends MyDevice{
    private int numOfSongs;
    public MyPhone(){
        super();
        numOfSongs = 0;
    }
    public MyPhone (String name, int price, int storage, int numOfSongs){
        setName(name);
        setPrice(price);
        setStorage(storage);
        this.numOfSongs = numOfSongs;
    }
    public void setNumOfsongs(int numOfSongs){
        this.numOfSongs = numOfSongs;
    }
    public int getNumOfSongs(){
        return numOfSongs;
    }
    public String toString(){
        String output = super.toString() + "\nNumber of Songs: " + numOfSongs + "\n";
        return output;
    }
}
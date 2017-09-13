//Jack Schmid
import java.util.ArrayList;
public class MyDevice{
    private String name;
    private int price;
    private int storage;
    private String owner = "Jack";
    public MyDevice(String name, int price, int storage){
        this.name = name;
        this.price = price;
        this.storage = storage;
    }
    public MyDevice(){
        name = "null";
        price = 0;
        storage = 0;
    }
    public void setName(String newName){
        name = newName;
    }
    public String getName(){
        return name;
    }
    public void setPrice(int newPrice){
        price = newPrice;
    }
    public int getPrice(){
        return price;
    }
    public void setOwner (String newOwner){
        owner = newOwner;
    }    
    public String getOwner (){
        return owner;
    }
    public void setStorage(int newStorage){
        storage = newStorage;
    }
    public int getStorage(){
        return storage;
    }
    public String toString(){
        String output = "Owned By: " + owner + "\nName: " + name + "\nPrice: $" + price + "\nStorage Space: " + storage + " gigs";
        return output;
    }
}
  
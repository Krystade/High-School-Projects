//JackSchmid
public abstract class MyDevice{
    private String owner;
    private String color;
    private int storage;
    public MyDevice (){
        owner = "";
        color = "";
        storage = -1;
    }
    public MyDevice(String owner, String color, int storage){
        this.owner = owner;
        this.color = color;
        this.storage = storage;
    }
    public String getOwner(){
        return owner;
    }
    public String getColor(){
        return color;
    }
    public int getStorage(){
        return storage;
    }
    public String toString(){
        return "Owner: " + getOwner() + "\nColor: " + getColor() + "\nStorage: " + getStorage() + "gigs";
    }
}

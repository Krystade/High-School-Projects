
public class YourObject{
    String name;
    int size;
    boolean good;
    public YourObject(){
        name = "ball";
        size = 3;
    }
    public YourObject(String nameFirst, int sizeFirst){
        name = nameFirst;
        size = sizeFirst;
    }
    public String toString(){
        String output = "The object's name is " + name + "\nIt its " + size + " big\n" ;
        return output;
    }
}

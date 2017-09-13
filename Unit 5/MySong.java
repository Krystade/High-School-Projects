
public class MySong{
    String name;
    int rating;
    public MySong (String name, int rating){
        this.name = name;
        this.rating = rating;
    }
    public String toString(){
        String output = "Name: " + name + "\nRating: " + rating;
        return output;
    }
}

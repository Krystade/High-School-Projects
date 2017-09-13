//Jack Schmid
public class Television{
    public String model;
    public double cost;
    public Television(){
        model = "";
        cost = 0;
    }
    public Television(String model, double cost){
        this.model = model;
        this.cost = cost;
    }
    public String toString(){
        String output = "Model: " + model + "\nCost: " + cost + "\n";
        return output;
    }
}

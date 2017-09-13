//Jack Schmid
public class LCD extends Television{
    public LCD(){
        super();
        model = "";
        cost = 0;
    }
    public LCD(String model, double cost){
        super();
        this.model = model;
        this.cost = cost;
    }
    public String toString(){
        return super.toString();
    }
}

//Jack Schmid
public class LED extends Television{
    public LED(){
        super();
        model = "";
        cost = 0;
    }
    public LED(String model, double cost){
        super();
        this.model = model;
        this.cost = cost;
    }
    public String toString(){
        return super.toString();
    }
}

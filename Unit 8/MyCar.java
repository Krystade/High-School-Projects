
public class MyCar extends Vehicle implements Connectables, Discountable{
    public String connectToBluetooth(){
        return "MyCar connecting to Bluetooth...";
    }
    public MyCar(){
        super();
    }
    public MyCar(String brand, String color, int age){
        super(brand, color, age);
    }
}

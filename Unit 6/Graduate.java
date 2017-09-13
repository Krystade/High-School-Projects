//Jack Schmid
public class Graduate extends Student{
    public Graduate(){
        super();
    }
    public Graduate(String name, String major, int units){
        super();
        this.setName(name);
        this.setMajor(major);
        this.setUnits(units);
    }
    public int calculateTuition(int units){
        return units * 500;
    }
}

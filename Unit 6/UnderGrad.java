//Jack Schmid
public class UnderGrad extends Student{
    public UnderGrad(){
        super();
    }
    public UnderGrad(String name, String major, int units){
        super();
        this.setName(name);
        this.setMajor(major);
        this.setUnits(units);
    }
    public int calculateTuition(int units){
        return units * 250;
    }
}

//Jack Schmid
public class PostGraduate extends Graduate{
    public PostGraduate(){
        super();
    }
    public PostGraduate(String name, String major, int units){
        super();
        this.setName(name);
        this.setMajor(major);
        this.setUnits(units);
    }
    public int calculateTuition(int units){
        return units * 750;
    }
}

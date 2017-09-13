//Jack Schmid
abstract public class Student{
    private String name;
    private String major;
    private int units;
    public Student(){
        major = "";
        name = "";
        units = 0;
    }
    public Student(String name, String major, int units){
        this.major = major;
        this.name = name;
        this.units = units;
    }
    abstract public int calculateTuition(int units);
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getMajor(){
        return major;
    }
    public void setMajor(String major){
        this.major = major;
    }
    public int getUnits(){
        return units;
    }
    public void setUnits(int units){
        this.units = units;
    }
    public String toString(){
        return "Name: " + getName() + "\tMajor: " + getMajor() + "\nUnits: " + getUnits() + "\tTuition: " + calculateTuition(this.units) + "\n";
    }
}

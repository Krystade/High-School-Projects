//Jack Schmid
public class School{
    String name;
    int students;
    int faculty;
    public School(){
        name = "SCHS";
        students = 2000;
        faculty = 45;
    }
    public School(String name, int students, int faculty){
        this.name = name;
        this.students = students;
        this.faculty = faculty;
    }
    public String toString(){
        String output = name + ":" + "\nNumber of Students: " + students + "\nNumber of Faculty: " + faculty + "\n";
        return output;
    }
}

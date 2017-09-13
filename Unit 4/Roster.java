
public class Roster{
    private Student[] roster = new Student[3];
    public Roster(){
        roster[0] = new Student("Jack", "Schmid", 4.0, 4.0, 4.0, 4.0, 4.0);
        roster[1] = new Student("Evan", "Gill", 2.4, 3.0, 2.0, 1.8, 4.0);
        roster[2] = new Student("Kate", "Luchens", 0.0, 0.0, 0.0, 0.0, 0.0);
    }
    public int findMaxGPA(){
        int max = 0;
        double maxGPA = 0;
        for (int i = 0; i < roster.length; i++){
            if (roster[i].calcGPA() < max){
                maxGPA = roster[i].calcGPA();
                max = i;
            }
        }
        return max;
    }
    public String toString(){
        String output = "The Student with the max GPA is " + roster[findMaxGPA()].firstName + " " + 
        roster[findMaxGPA()].lastName + " with a GPA of " + roster[findMaxGPA()].calcGPA() + "\n";
        for ( Student student : roster ){
            output += student + "\n";
        }
        return output;
    }
}

import java.util.ArrayList;
public class Roster2{
    private ArrayList<Student> enrolledStudents = new ArrayList<Student>();
    public Roster2(){
        enrolledStudents.add ( new Student("Jack", "Schmid", 4.0, 4.0, 4.0, 4.0, 4.0) );
        enrolledStudents.add ( new Student("Evan", "Gill", 2.4, 3.0, 2.0, 1.8, 4.0) );
        enrolledStudents.add ( new Student("Kate", "Luchens", 0.0, 0.0, 0.0, 0.0, 0.0) );
    }
    public int findMaxGPA(){
        int max = 0;
        double maxGPA = 0;
        for (int i = 0; i < enrolledStudents.size(); i++){
            if (enrolledStudents.get(i).calcGPA() < max){
                maxGPA = enrolledStudents.get(i).calcGPA();
                max = i;
            }
        }
        return max;
    }
    public void addStudent (Student newStudent){
        enrolledStudents.add(newStudent);
    }
    public void dropStudent (String nameLast){
        for (int i = 0; i < enrolledStudents.size(); i++){
            if (enrolledStudents.get(i).lastName == nameLast){
                System.out.println(enrolledStudents.get(i).lastName + " has been dropped successfully.\n");
                enrolledStudents.remove(i);
            }else{
            }
        }
    }
    public String toString(){
        String output = "The Student with the max GPA is " + enrolledStudents.get(findMaxGPA()).firstName + " " + 
        enrolledStudents.get(findMaxGPA()).lastName + " with a GPA of " + enrolledStudents.get(findMaxGPA()).calcGPA() + "\n";
        for ( Student student : enrolledStudents){
            output += student + "\n";
        }
        return output;
    }
}

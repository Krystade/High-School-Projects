
public class Student
{
    String firstName;
    String lastName;
    int grade;
    int age;
    public Student(){
        firstName = "Student";
        lastName = "McStudentface";
        grade = 13;  
        age = 18;
    }
    public Student(String nameFirst, String nameLast, int firstGrade, int firstAge){
        firstName = nameFirst;
        lastName = nameLast;
        grade = firstGrade;
        age = firstAge;
    }
    public String toString(){
        String output = "First Name\t" + firstName + "\nLast Name \t" + lastName + "\nGrade\t\t" + grade 
        + "\nAge\t\t" + age;
        return output;
    }
}

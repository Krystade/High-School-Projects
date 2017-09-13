
public class Student
{
    String firstName;
    String lastName;
    char letterGrade;
    double GPA;
    double[] grades = new double[5];
    public Student(){
        firstName = "Student";
        lastName = "McStudentface";
        grades[0] = 0.0;//English
        grades[1] = 0.0;//Math
        grades[2] = 0.0;//Science
        grades[3] = 0.0;//Fine Arts
        grades[4] = 0.0;//Social Science
    }
    public Student(String nameFirst, String nameLast, double english, double math, double science, double fineArts, double socialScience){
        firstName = nameFirst;
        lastName = nameLast;
        grades[0] = english;
        grades[1] = math;
        grades[2] = science;
        grades[3] = fineArts;
        grades[4] = socialScience;
    }
    public void setGPA(double english, double math, double science, double fineArts, double socialScience){
        grades[0] = english;
        grades[1] = math;
        grades[2] = science;
        grades[3] = fineArts;
        grades[4] = socialScience;
    }
    public double calcGPA(){
        double totalGrades = 0;
        totalGrades += grades[0];
        totalGrades += grades[1];
        totalGrades += grades[2];
        totalGrades += grades[3];
        totalGrades += grades[4];
        GPA = (totalGrades / 5);
        return GPA;
    }
    public char getGPA(){
        char letterGrade;
        if (calcGPA() >= 4.0){
            letterGrade = 'A';
        }else if (GPA >= 3.0){
            letterGrade = 'B';
        }else if (GPA >= 2.0){
            letterGrade = 'C';
        }else if (GPA >= 1.0){
            letterGrade = 'D';
        }else{
            letterGrade = 'F';
        }
        return letterGrade;
    }
    public String toString(){
        String output = "First Name\t" + firstName + "\nLast Name \t" + lastName + "\n" + 
        firstName + "'s GPA is\t" + calcGPA() + "\n" + firstName + "'s Grade is\t" + getGPA() + "\n";
        return output;
    }
}


public class StudentDriver{
    public static void main(String[] args){
        Student one = new Student();
        System.out.println(one);
        Student Senior = new Student("Joe", "Senior", 4.0, 4.0, 3.5, 4.0, 4.0);
        System.out.println(Senior);
        Senior.setGPA(4.0,4.0,4.0,4.0,4.0);
        System.out.println(Senior);
    }
}

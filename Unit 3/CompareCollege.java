
public class CompareCollege{
    public static void main(String[] args){
        String school1 = new String("Saddleback");
        String school2 = new String("Berkeley");
        String school3 = new String("UCLA");
        String school4 = new String("Saddleback");
        System.out.println(school1 + ".compareTo(" + school3 + ")" + "\t = " + school3.compareTo(school1));
        System.out.println(school1 + ".compareTo(" + school2 + ")" + "\t = " + school2.compareTo(school1));
        System.out.println(school1 + ".compareTo(" + school4 + ")" + " = " + school1.compareTo(school4));
    }
}

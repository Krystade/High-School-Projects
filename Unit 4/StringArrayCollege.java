import java.util.ArrayList;
public class StringArrayCollege{
    public static void main(String[] args){
        ArrayList<String> college = new ArrayList<String>();
        college.add( new String ( "UCSD" ) );
        college.add( new String ( "Saddleback" ) );
        college.add( new String ( "UCLA" ) );
        college.add( new String ( "SWIM" ) );
        college.add( new String ( "Berkeley" ) );
        System.out.println ( "There are " + college.size() + " schools in my list." );
        for ( String col: college ){
            System.out.println(col);
        }
        System.out.println();
        for ( int i = 0; i < college.size(); i++){
            int CTo = "".compareTo(college.get( i ) );
            if ( CTo == -4 ){
                college.remove( i );
                i--;
            }
        }
        System.out.println ( "There are now " + college.size() + " schools in my list." );
        for ( String col: college ){
            System.out.println(col);
        }
    }
}
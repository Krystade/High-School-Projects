import java.util.ArrayList;
public class StringArrayList{
    public static void main(String[] args){
        ArrayList<String> family = new ArrayList<String>();
        family.add( new String( "Steve Schmid" ) );
        family.add( new String( "Tess Schmid" ) );
        family.add( new String( "Garrett Schmid" ) );
        family.add( new String( "Blake Schmid" ) );
        family.add( new String( "Jack Schmid" ) );
        family.add( new String( "Lily Schmid" ) );
        System.out.println( "There are " + family.size() + " members in my family." );
        for ( int i = 0; i < family.size(); i++){
            System.out.println ( family.get(i) );
        }
        System.out.println();
        for ( String name: family ){
            System.out.println( name );
        }
    }
}
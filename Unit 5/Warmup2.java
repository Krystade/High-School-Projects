import java.util.ArrayList;
//JackSchmid
public class Warmup2{
    public static void main(String[] args){
        ArrayList<String> countries = new ArrayList<String>();
        
        countries.add( new String ("AMERICA"));
        countries.add( new String ("England"));
        countries.add( new String ("Australia"));
        countries.add( new String ("Germany"));
        countries.add( new String ("France"));
        countries.add( new String ("Iraq"));
        countries.add( new String ("Switzerland"));
        countries.add( new String ("Spain"));
        
        for(int i = 0; i < countries.size(); i++){
            System.out.println(countries.get(i));
        }
        System.out.println();
        
        countries.add( new String ("Russia"));
        countries.add( new String ("Turkey"));
        
        for (String country : countries){
            System.out.println(country);
        }
        System.out.println();
        countries.remove(countries.get(3));
        for (String country : countries){
            System.out.println(country);
        }
        System.out.println();
    }
}

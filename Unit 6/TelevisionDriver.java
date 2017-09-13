//Jack Schmid
import java.util.ArrayList;
public class TelevisionDriver{
    public static void main(String[] args){
        ArrayList<Television> arr = new ArrayList<Television>();
        arr.add(new Television("HD Bronze", 59.99));
        arr.add(new DLP("DLF Silver", 99.99));
        arr.add(new LCD("LCD Gold", 199.99));
        arr.add(new LED("LED Platinum", 399.99));
        arr.add(new Plasma("Plasma Saphire", 499.99));
        Television test = new Plasma("Plasma Saphire", 499.99);
        for (Television tv : arr){
            System.out.println(tv);
        }
    }
}

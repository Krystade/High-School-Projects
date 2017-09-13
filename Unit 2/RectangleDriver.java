
public class RectangleDriver{
    public static void main(String[] args){
        Rectangle test = new Rectangle();
        
        test.setLength(5.5);
        System.out.println("Zero Argument\n" + test);
        
        Rectangle multi = new Rectangle(11.2434, 5.45);
        System.out.println("Multi Argument\n" + multi);
    }
}

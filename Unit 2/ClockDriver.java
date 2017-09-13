
public class ClockDriver
{
    public static void main(String[] args){
     Clock kitchenClock = new Clock();
     System.out.println(kitchenClock);
     Clock bedroomClock = new Clock(12, 45, 5);
     System.out.println(bedroomClock);
    }
}


public class ClockDriver
{
    public static void main(String[] args){
     Clock kitchenClock = new Clock();
     System.out.println(kitchenClock);
     Clock bedroomClock = new Clock(12, 45, 5);
     System.out.println(bedroomClock);
     bedroomClock.setTime( 1,1,1);
     System.out.println(bedroomClock);
     bedroomClock.convertDayLightSavings( 1 );
     System.out.println(bedroomClock);
    }
}

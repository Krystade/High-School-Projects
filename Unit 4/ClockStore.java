
public class ClockStore{
    private Clock[] ClockStore = new Clock[3];
    public ClockStore(){
        ClockStore[0] = new Clock(1,21, 06);
        ClockStore[1] = new Clock(14, 45 , 55);
        ClockStore[2] = new Clock(6,6, 06);
    }
    public int mostSeconds(){
        int seconds = ClockStore[0].totalSeconds();
        int clockMax = 0;
        for (int i = 1; i < ClockStore.length - 1; i++){
            if (seconds < ClockStore[i].totalSeconds()){
                seconds = ClockStore[i].totalSeconds();
                clockMax = i;
            }
        }
        return clockMax;
    }
    public String toString(){
        String output = "The clock with the most seconds is ClockStore[" + mostSeconds() + "]" +
        " with a total of " + ClockStore[mostSeconds()].totalSeconds() 
         + " seconds\nThe clocks stored are:\n\n";
        for ( Clock clock : ClockStore ){
            output += clock + "\n";
        }
        return output;
    }
}

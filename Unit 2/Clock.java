
public class Clock
{
    int hours;
    int minutes;
    int seconds;
    public Clock(){
        hours = 3;
        minutes = 33;
        seconds = 3;
    }
    public Clock(int diffHours, int diffMinutes, int diffSeconds){
        hours = diffHours;
        minutes = diffMinutes;
        seconds = diffSeconds;
    }
    public String toString()
    {
        String output = new String();
        output = "The time is " + hours + ":" + minutes + ":" + seconds;
        return output;
    }
}

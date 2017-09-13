
public class Clock
{
    private int hours;
    private int minutes;
    private int seconds;
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
    public void setTime(int hours, int minutes, int seconds){
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }
    public int convertDayLightSavings( int hours){
        boolean spring = true;
        if (hours == 1){
            spring = true;
            System.out.println("Spring Forward");
        }else if (hours == -1){
            spring = false;
            System.out.println("Fall Backward");
        }
        if(spring == true){
            this.hours++;
        }else{
            this.hours--;
        }
        return hours;
    }
    public int totalSeconds(){
        int totalSeconds = (this.hours *60 *60) + (this.minutes * 60) + this.seconds;
        return totalSeconds;
    }
    public String toString()
    {
        String output = new String();
        output = "The time is " + hours + ":" + minutes + ":" + seconds + "\nTotal Seconds: " +
        this.totalSeconds() + "\n";
        return output;
    }
}

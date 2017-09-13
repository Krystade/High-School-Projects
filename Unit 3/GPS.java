
public class GPS{
    private String name;
    private int altitude;
    private double transmissionTime;  
    public GPS(){
        name = null;
        altitude = 0;
        transmissionTime = 0.00;
    }
    public GPS(String diffName, int diffAltitude, double diffTransmissionTime){
        name = diffName;
        altitude = diffAltitude;
        transmissionTime = diffTransmissionTime;
    }
    public double getTransmissionTime(){
        return transmissionTime;
    }
    public void setTransmissionTime(double newTime) { 
        transmissionTime = newTime;
    }
    public double calcHypotenuse () {
        double hypotenuse = transmissionTime * 300000;
        return hypotenuse;
    }
    public double calcDistance () {
        double distance = Math.sqrt( Math.pow( calcHypotenuse( ), 2 ) - Math.pow ( altitude, 2 ) );
        return distance;
    }
    public String toString () {
        if ( altitude == 0 ){
            String output = "The name of this GPS is: " + name + "\nThe altitude of this GPS is " + altitude +
            ".\nThe GPS is not in orbit.\n";
            return output;
        }else { 
            String output = "The name of this GPS is: " + name + "\nThe altitude of this GPS is: " + altitude +
            " kilometers\nThe transmission time of this GPS is: " + transmissionTime + " seconds\nThe line of sight distance h is: " + 
            ( ( int )( ( calcHypotenuse( ) * 1000) / 1000.0 ) ) + " kilometers\nThe distance d is: " + 
            ( ( int )( calcDistance( ) * 1000) / 1000.0 ) + " kilometers\n";
            return output;
        }
    }
}

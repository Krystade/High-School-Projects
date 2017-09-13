
public class GPSDriver{
    public static void main( String[] args ){
        GPS gpsA = new GPS();
        System.out.println(gpsA);
        GPS gpsB = new GPS("gpsB", 20000, .15);
        System.out.println(gpsB);
        gpsB.setTransmissionTime(.30);
        System.out.println(gpsB);
        System.out.println(gpsB.getTransmissionTime());
    }
}

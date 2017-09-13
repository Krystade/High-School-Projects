
public class SongDriver
{
    public static void main( String[] args)
    {
        Song pinkGuy = new Song();
        System.out.println(pinkGuy);
        Song thriller = new Song(118, 357, "Thriller", 1983);
        thriller.setYearReleased(1982);
        System.out.println(thriller);
    }
}
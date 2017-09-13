//JackSchmid
public class Jukebox{
    MySong[][] songList = new MySong[3][4];
    public Jukebox(){
        songList[0][0] = new MySong("body time" , 8);
        songList[0][1] = new MySong("way part" , 6);
        songList[0][2] = new MySong("girl name" , 1);
        songList[0][3] = new MySong("girl way" , 8);
        songList[1][0] = new MySong("country result" , 7);
        songList[1][1] = new MySong("teacher city" , 0);
        songList[1][2] = new MySong("problem problem" , 2);
        songList[1][3] = new MySong("business guy" , 1);
        songList[2][0] = new MySong("lot company" , 8);
        songList[2][1] = new MySong("kind thing" , 6);
        songList[2][2] = new MySong("year Mr" , 1);
        songList[2][3] = new MySong("night teacher" , 5);
    }
    public MySong RandomSong(){
        int row = (int)(Math.random() * songList.length);
        int column = (int)(Math.random() * songList[0].length);
        return songList[column][row];
    }
    public String PlaySongOfRating(int rating){
        String string = "";
        string += ("\nSongs with a rating of " + rating + "\n");
        for(int i = 0; i < songList.length; i++){
            for(int j = 0; j < songList[i].length; j++){
                if(getRating(songList[i][j]) == rating){
                    string += getName(songList[i][j]) + "\n";
                }
            }
        }
        return string;
    }
    public int getRating(MySong song){
        return song.rating;
    }
    public String getName(MySong song){
        return song.name;
    }
    public String toString(){
        String output = "";
        for(int i = 0; i < songList.length; i++){
            for(int j = 0; j < songList[i].length; j++){
                output += "Song " + (int)(i + j) + ". " + getName(songList[i][j]) + "  " + getRating(songList[i][j]) + "\n";
            }
        }
        output += PlaySongOfRating(6);
        return output;
    }
}

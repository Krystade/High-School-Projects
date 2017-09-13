public class MichaelJackson{
    public static void main(String[] args){
        String [] musicians = {"Freddie Mercury","Elvis Presly","Jimi Hendrix"};
        int random = (int)(Math.random() * 3);
        for (int i = 0; i < 3; i++){
            System.out.println(musicians[i]);
        }
        musicians[random] = "Michael Jackson";
        for (int i = 0; i < 3; i++){
            if (musicians[i] != "Michael Jackson"){
            System.out.println("No Michael in music(" + i + ")");
            }if (musicians[i] == "Michael Jackson"){
            System.out.println("We found Michael.");
            }
            for (i = 0; i < 3; i++){
            System.out.println(musicians[i]);
        }
        }
    }
}


public class CardDriver{
    public static void main(String[] args){
        Card blank = new Card();
        Card number = new Card(2, "diamond");
        Card face = new Card(11, "Spades");
        Card[] myHand = new Card[3];
        myHand[0] = blank;
        myHand[1] = number;
        myHand[2] = face;
        for(int i = 0; i < 3; i++){
            System.out.println(myHand[i]);
        }
    }
}

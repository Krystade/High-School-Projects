
public class Card{
    int value;
    String suit;
    public Card(){
        value = 5;
        suit = "hearts";
    }
    public Card(int valueNew, String suitNew){
        value = valueNew;
        suit = suitNew;
    }
    public String toString(){
        String output = "value of card = " + value + "\nSuit of card = " + suit + "\n";
        return output;
    }
}

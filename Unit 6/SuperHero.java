//Jack Schmid
public abstract class SuperHero{
    private String suitColor;
    private boolean hasCape;
    private String name;
    public SuperHero(){
        suitColor = "";
        hasCape = false;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public String getSuitColor(){
        return suitColor;
    }
    public void setSuitColor( String color){
        this.suitColor = color;
    }
    public boolean isCaped(){
        return hasCape;
    }
    public void setCape(boolean hasCape){
        this.hasCape = hasCape;
    }
    public abstract String catchphrase();
    public String toString(){
        return "Name: " + name + "\tSuit Color: " + suitColor + "\nHas a Cape: " + hasCape + "\tCatchphrase: \"" + catchphrase() + "\"\n";
    }
}

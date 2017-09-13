
public class Quadratic{
    private int a;
    private int b;
    private int c;
    public Quadratic(){
        a = 0;
        b = 0;
        c = 0;
    }
    public Quadratic(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public int getB(){
        return b;
    }
    public int setB( int b){
        this.b = b;
        return b;
    }
    public int calcDiscriminant(){
        int discriminant = (b * b) - (4 * a * c);
        return discriminant;
    }
    public int calcRoot1(){
        int answer =(int) ( ((-1 * b) + ((Math.sqrt( (calcDiscriminant())) )/(2 * a) ) ) );
        return answer;
    }
    public int calcRoot2(){
        int answer =(int) ( ((-1 * b) - ((Math.sqrt( (calcDiscriminant())) )/(2 * a) ) ) );
        return answer;
    }
    public String toString(){
        if(calcDiscriminant() <= 0){
            String output = "The Quadratic Equation is: " + a + "x^2 + " + b + "x + " + c + " = 0" +
            "\nThe value of the Discriminant is: " + calcDiscriminant() +
            "\nThere are no real roots\n";
            return output;
        }else{
            String output = "The Quadratic Equation is: " + a + "x^2 + " + b + "x + " + c + " = 0" +
            "\nThe value of the Discriminant is: " + calcDiscriminant() +
            "\nRoot 1 is: " + calcRoot1() +
            "\nRoot 2 is: " + calcRoot2() + "\n";
            return output;
        }
    }
}

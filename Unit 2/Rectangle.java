
public class Rectangle{
    double length;
    double width;
    double area;
    public Rectangle(){
        length = 10.5;
        width = 4.5;
    }
    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    public double getLength(){
        return length;
    }
    public double getWidth(){
        return width;
    }
    public void setLength(double length){
        this.length = length;
    }
    public double calcArea(){
        double area = length * width;
        return area;
    }
    public double calcPerimeter (){
        double perimeter = 2 * (length + width);
        return perimeter;
    }
    public String toString(){
        String output = "The length is " + length + "\nThe Width is " + width + "\nthe perimeter is " 
        + calcPerimeter() + "\nThe area is "+ calcArea() + "\n";
        return output;
    }
}

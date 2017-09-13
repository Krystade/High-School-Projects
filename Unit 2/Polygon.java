
public class Polygon{
    String name;
    int numOfSides;
    double sideLength;
    double perimeter;
    double centralAngle;
    int interiorAngle;
    public Polygon(){
        name = "Quadrilateral";
        numOfSides = 4;
        sideLength = 2.0;
        interiorAngle = 360 / numOfSides;
        centralAngle = (numOfSides - 2) * 180;
        perimeter = numOfSides * sideLength;
    }
    public Polygon(String newName, int newNumOfSides, double newSideLength){
        name = newName;
        numOfSides = newNumOfSides;
        sideLength = newSideLength;
        interiorAngle = 360 / numOfSides;
        centralAngle = (numOfSides - 2) * 180;
        perimeter = numOfSides * sideLength;
    }
    public double getPerimeter (int numOfSides, double sideLength ){
        double perimeter = numOfSides * sideLength;
        return perimeter;
    }
    public String toString(){
        String output = "Polygon name = " + name + "\nTotal Number of Sides = " + 
        numOfSides + "Length of Sides = " + sideLength + "\nPerimeter = " + perimeter + "\nCentral Angle = " + centralAngle + "\nInterior Angle = " + interiorAngle;
        return output;
    }
}


public class PolygonDriver{
    public static void main(String[] args){
        Polygon quadrilateral = new Polygon();
        System.out.println("Quadrilateral: \n" + quadrilateral);
        Polygon triangle = new Polygon("Triangle", 3, 1.5);
        System.out.println("\nTriangle: \n" + triangle);
        Polygon pentagon = new Polygon("Pentagon", 5, 5.3);
        System.out.println("\nPentagon: \n" + pentagon);
    }
}

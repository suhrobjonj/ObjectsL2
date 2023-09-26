
public class Circle {

    private double radius;

    // the constructor used to create Rectangle objects:
    // instance variables are set here using the values passed as arguments
    public Circle(double r) {
        radius = r;
    }

    // a method (object behavior) that calculates and prints area:
    public void printArea() {
        double area = (radius * radius) * Math.PI;
        System.out.println("A circle with a radius of " + radius + " has an area of " + area);
    }

}

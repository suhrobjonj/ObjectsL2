
public class Point {

    // instance variables
    private int x;
    private int y;

    // constructor to create a Point object with a particular y and x
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // constructor to create a Point object with equal y and x (a square)
    public Point(int coordinate) {
        x = coordinate;
        y = coordinate;
    }

    // "no-argument" constructor which creates a Point object with default values
    public Point() {
        x = 0;
        y = 0;
    }

    // "getter" method that returns the x of the Point
    public int getX() {
        return x;
    }

    // "setter" methods that sets the x of the Point to a new x
    public void setX(int newx) {
        x = newx;
    }

    // "getter" method that returns the y of the Point
    public int getY() {
        return y;
    }

    // "setter" methods that sets the y of the Point to a new y
    public void setY(int newy) {
        y = newy;
    }

    // calculates and returns the area of the Point
    public String coordinate() {
        return "(" + x + ", " + y +")";
    }

    public String quadrant() {
        if (x > 0 && y > 0) {
            return "I";
        } else if (x < 0 && y < 0) {
            return "III";
        } else if (x < 0 && y > 0) {
            return "II";
        } else if (x > 0 && y < 0) {
            return "IV";
        } else if ((x != 0 && y == 0) || (x == 0 && y != 0)) {
            return "on an axis";
        }  else if (x == 0 && y == 0) {
            return "origin";
        }
        return "";

    }
}





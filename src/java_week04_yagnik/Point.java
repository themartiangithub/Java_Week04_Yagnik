package java_week04_yagnik;

public class Point {
     int x;
     int y;

    // Default constructor
    public Point() {
        x = 0;
        y = 0;
    }

    // Constructor with parameters
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Method to get the value of x
    public int getX() {
        return x;
    }

    // Method to get the value of y
    public int getY() {
        return y;
    }

    // Method to set the value of x
    public void setX(int x) {
        this.x = x;
    }

    // Method to set the value of y
    public void setY(int y) {
        this.y = y;
    }

    // Method to calculate the distance between this Point and Point 0,0
    public double distance() {
        return Math.sqrt((x - 0) * (x - 0) + (y - 0) * (y - 0));
    }

    // Method to calculate the distance between this Point and Point x,y
    public double distance(int x, int y) {
        return Math.sqrt((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y));
    }

    // Method to calculate the distance between this Point and another Point
    public double distance(Point another) {
        return Math.sqrt((this.x - another.x) * (this.x - another.x) + (this.y - another.y) * (this.y - another.y));
    }

    // Test code
    public static void main(String[] args) {
        Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Point point = new Point();
        System.out.println("distance()= " + point.distance());
    }
}

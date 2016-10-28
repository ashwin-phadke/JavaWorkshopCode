public class Point {
    public double x = 0;
    public double y = 0;

    public Point() {}
    
    //implemented
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public boolean equals(Point other) {
        // implementated
        if(this.x == other.x && this.y == other.y)
            return true;
        else
            return false;
    }

    public double distance(Point other) {
        return Math.hypot(this.x-other.x, this.y-other.y);
    }
    public String toString() {
        return "(" + this.x + ", " + this.y + ")";
    }

    public static void main(String[] args) {
        Point a = new Point(3, 4);
        Point b = new Point(5, 6);
        // Point c = a;

        // c.x = 42;

        System.out.println(a);
        System.out.println(b);
        
        System.out.println("Distance between 2 points is " + a.distance(b));

        if ( a.equals(b) ) {
            System.out.println("Equals");
        } else {
            System.out.println("Unequals");
        }
    }
}

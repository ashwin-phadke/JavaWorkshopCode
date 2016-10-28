public class ColorPoint extends Point {
    private StringBuffer color = new StringBuffer();

    ColorPoint() {
        super();
        color.append("White");
    }
    
    ColorPoint(double x, double y, String newColor) {
        // implementation
        this.x = x;
        this.y = y;
        color.append(newColor);
    }
    
    public String getColor() {
        return color.toString();
        
    }
    
    public boolean equals(ColorPoint cp) {
        // implementation
        if(this.x == cp.x && this.y == cp.y && this.getColor().equals(cp.getColor()))
            return true;
        else
            return false;
    }
    
    public String toString() {
        // implementation
        return ""+color;
    }

    public static void main(String[] args) {
        ColorPoint a = new ColorPoint(2.1, 4.1, "Black");
        ColorPoint b = new ColorPoint();
        ColorPoint c = new ColorPoint();

        //System.out.println(a.getColor());
        System.out.println("ColorPoint a: " + a);
        System.out.println("ColorPoint b: " + b);

        System.out.println("The points are equal? " + a.equals(b));
    }

}
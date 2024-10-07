public class MyPoint {
    // Attributes
    private int x;
    private int y;

    // Constructors
    public MyPoint() {
        x = 0;
        y = 0;
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Getters & Setters
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Methods
    public String toString() {
        return "(" + this.x + ", " + this.y + ")";
    }

    public double distance(int x, int y) {
        return Math.sqrt((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y));
    }

    public double distance(MyPoint another) {
        return distance(another.x, another.y);
    }

    public double distance() {
        return distance(0, 0);
    }
}

public class MyRectangle {
    
    // Attributes
    private MyPoint topLeft;
    private MyPoint bottomRight;
    
    // Getters & Setters
    public MyPoint getTopLeft() {
        return topLeft;
    }
    public void setTopLeft(MyPoint topLeft) {
        this.topLeft = topLeft;
    }
    public MyPoint getBottomRight() {
        return bottomRight;
    }
    public void setBottomRight(MyPoint bottomRight) {
        this.bottomRight = bottomRight;
    }
    
    // Constructors
    public MyRectangle(int x1, int y1, int x2, int y2) {
        topLeft = new MyPoint(x1, y1);
        bottomRight = new MyPoint(x2, y2);
    }

    public MyRectangle() {
        topLeft = new MyPoint();
        bottomRight = new MyPoint();
    }

    public int getArea() {
        return (bottomRight.getX() - topLeft.getX()) * (bottomRight.getY() - topLeft.getY());
    }
}

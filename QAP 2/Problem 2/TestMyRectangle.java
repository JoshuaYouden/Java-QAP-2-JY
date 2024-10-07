public class TestMyRectangle {
    public static void main(String[] args) {
        
        // Create two rectangles with different corners
        MyRectangle r1 = new MyRectangle(3, 4, 6, 8);
        MyRectangle r2 = new MyRectangle(10, 12, 5, 6);
        
        // Get the area of the two rectangles
        int area1 = r1.getArea();
        int area2 = r2.getArea();
        
        // Print out the area of the two rectangles
        System.out.println();
        System.out.println("Area of rectangle 1: " + area1);
        System.out.println("Area of rectangle 2: " + area2);
}
}
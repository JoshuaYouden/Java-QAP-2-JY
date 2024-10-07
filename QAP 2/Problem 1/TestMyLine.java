public class TestMyLine {
    public static void main(String[] args) {
        // Create three lines with different slopes and intercepts
        MyLine l1 = new MyLine(34, 4, 36, 5);
        MyLine l2 = new MyLine(30, 7, 26, 2);
        MyLine l3 = new MyLine(15, 2, 17, 3);

        System.out.println();

        // Get the length of line 1
        double length1 = l1.getLength();
        System.out.println("Line 1 = " + l1 + ", length = " + length1);

        // Get the gradient of line 2
        double gradient2 = l2.getGradient();
        System.out.println("Line 2 = " + l2 + ", gradient = " + gradient2);

        // Just print out line 3 as is
        System.out.println("Line 3 = " + l3);
}
}

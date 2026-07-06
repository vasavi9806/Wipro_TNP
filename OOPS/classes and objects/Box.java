// Box.java
public class Box {
    private double width;
    private double height;
    private double depth;
    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    public double getVolume() {
        return this.width * this.height * this.depth;
    }
    public static void main(String[] args) {
        Box myBox = new Box(10.5, 5.0, 4.2); 
        double volume = myBox.getVolume();
        System.out.println("The volume of the box is: " + volume);
    }
}
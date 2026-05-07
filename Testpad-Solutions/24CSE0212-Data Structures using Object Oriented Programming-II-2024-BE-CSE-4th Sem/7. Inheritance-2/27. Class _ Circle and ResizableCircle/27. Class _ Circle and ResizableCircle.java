class Circle implements GeometricObject {
    protected double radius;
    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }
    // Perimeter
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
    // Area
    public double getArea() {
        return Math.PI * radius * radius;
    }
    // toString()
    public String toString() {
        return "Circle[radius=" + radius + "]";
    }
}
class ResizableCircle extends Circle implements Resizable {
    // Constructor
    public ResizableCircle(double radius) {
        super(radius);
    }
    // Resize method
    public void resize(int percent) {
        radius = radius * percent / 100.0;
    }
}
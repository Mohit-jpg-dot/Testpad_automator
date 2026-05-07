class Circle {
    private double radius;
    // constructor
    public Circle(double r) {
        this.radius = r;
    }
    // area upto 2 decimal places
    public double area() {
        double val = Math.PI * radius * radius;
        return Math.round(val * 100.0) / 100.0;
    }
    // circumference upto 2 decimal places
    public double circumference() {
        double val = 2 * Math.PI * radius;
        return Math.round(val * 100.0) / 100.0;
    }
    // radius upto 1 decimal place
    public double getRadius() {
        return Math.round(radius * 10.0) / 10.0;
    }
    // string representation
    public String toString() {
        return "Circle{radius=" + getRadius() + "}";
    }
}
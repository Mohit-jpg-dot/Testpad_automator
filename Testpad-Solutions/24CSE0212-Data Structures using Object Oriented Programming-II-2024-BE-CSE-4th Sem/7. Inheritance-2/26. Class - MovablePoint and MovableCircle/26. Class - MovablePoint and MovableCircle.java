class MovablePoint implements Movable {
    int x, y, xSpeed, ySpeed;
    // Constructor
    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    // Implement methods
    public void moveUp() {
        y -= ySpeed;
    }
    public void moveDown() {
        y += ySpeed;
    }
    public void moveLeft() {
        x -= xSpeed;
    }
    public void moveRight() {
        x += xSpeed;
    }
    // toString
    public String toString() {
        return "[X=" + x + ", Y=" + y + "]";
    }
}
class MovableCircle implements Movable {
    private MovablePoint center;
    private int radius;
    // Constructor
    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }
    // Implement methods
    public void moveUp() {
        center.y -= center.ySpeed;
    }
    public void moveDown() {
        center.y += center.ySpeed;
    }
    public void moveLeft() {
        center.x -= center.xSpeed;
    }
    public void moveRight() {
        center.x += center.xSpeed;
    }
    // toString
    public String toString() {
        return "[X=" + center.x + ", Y=" + center.y + ", radius=" + radius + "]";
    }
}
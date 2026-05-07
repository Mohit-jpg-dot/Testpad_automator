// Create classes Car and Bike here as specified.
class Car implements Vehicle {
    int gear;
    int speed;
    public void changeGear(int a) {
        gear = a;
    }
    public void speedUp(int a) {
        speed = speed + a;
    }
    public void applyBrakes(int a) {
        speed = speed - a;
    }
    public String toString() {
        return speed + "kmph";
    }
}
class Bike implements Vehicle {
    int gear;
    int speed;
    public void changeGear(int a) {
        gear = a;
    }
    public void speedUp(int a) {
        speed = speed + a;
    }
    public void applyBrakes(int a) {
        speed = speed - a;
    }
    public String toString() {
        return speed + "kmph";
    }
}
class Person{
    String name;
    String color;
    int eyes;
    int year;
    Person(String name, String color, int eyes, int year) {
        this.name = name;
        this.color = color;
        this.eyes = eyes;
        this.year = year;
    }
}
class Actor extends Person {
    Actor(String name, String color, int eyes, int year) {
        super(name, color, eyes, year);
    }
    public String toString() {
        return "The person " + name + " is an Actor. He is " + color +
               " in color, has " + eyes + " eyes and debut in " + year;
    }
}
class Actress extends Person {
    Actress(String name, String color, int eyes, int year) {
        super(name, color, eyes, year);
    }
    public String toString() {
        return "The person " + name + " is an Actress. She is " + color +
               " in color, has " + eyes + " eyes and debut in " + year;
    }
}
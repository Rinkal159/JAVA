package OOP;
class Pen {
    String color;

    public void printInfo() {
        System.out.println("Information");
    }
    public void printColor() {
        System.out.println("color : " + this.color);
    }

    Pen() {
        System.out.println("Default constructor");
    }

    Pen(String color) {
        this.color = color;
    }
}

public class BasicConstructor {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.printInfo();

        Pen p2 = new Pen("pink");
        p2.printColor();
    }
}

package OOP;
class Pen {
    String color;

    public String printPenWithColor() {
        return this.color + " pen";
    }

    // copy constructor
    Pen(Pen p2) {
        this.color = p2.color;
    }

    // parameterized constructor
    Pen(String color) {
        this.color = color;
    }
}

public class B_CopyConstructor {
    public static void main(String[] args) {
        Pen p1 = new Pen("pink");
        Pen p2 = new Pen(p1);

        System.out.println(p1.printPenWithColor());
        System.out.println(p2.printPenWithColor());

    }
}

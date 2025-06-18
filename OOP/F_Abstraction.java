package OOP;

abstract class Shape {
    String color;
    public abstract void printColor();
}

class Circle extends Shape {
    @Override
    public void printColor() {
        System.out.println(this.color);
    }

    Circle(String c) {
        this.color = c;
    }
}                                       

public class F_Abstraction {
    public static void main(String[] args) {
        Shape c1 = new Circle("pink");
        c1.printColor();
    }
}

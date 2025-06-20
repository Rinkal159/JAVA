package OOP;

abstract class Shape {
    String color;
    public abstract void printColor();

    Shape() {
        this.color = "red";
    }
}

class Circle extends Shape {
    @Override
    public void printColor() {
        System.out.println(this.color);
    }

}                                       

public class F_Abstraction {
    public static void main(String[] args) {
        Shape c1 = new Circle();
        c1.color = "pink";
        c1.printColor();
    }
}

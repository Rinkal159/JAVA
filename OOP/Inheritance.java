package OOP;

class Shape {
    double width;
    double length;
    double area;
}

class Square extends Shape {
    public double printArea() {
        this.area = this.length * this.length;
        return area;
    }

    Square(double l, double a) {
        this.length = l;
        this.area = a;
    }
}
class Rectangle extends Square {
    @Override
    public double printArea() {
        this.area = this.length * this.width;
        return area;
    }

    Rectangle(double l, double a, double w) {
        super(l, a);
        this.width = w;
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Square c1 = new Square(4, 0);
        Rectangle r1 = new Rectangle(4, 0, 8);
        System.out.println("Square area : " + c1.printArea());
        System.out.println("Rectangle area : " + r1.printArea());
    }
}

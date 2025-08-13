package OOP;

class Area {
    public static void calcArea(int r) {
        System.out.println("Area of given radius " + r + " is " + Math.PI * r * r);
    }
}

public class J_StaticMethod {
    public static void main(String[] args) {
        Area.calcArea(1);
        Area.calcArea(2);
        Area.calcArea(3);
        Area.calcArea(4);
        Area.calcArea(5);
    }
}

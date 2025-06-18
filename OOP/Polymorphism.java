package OOP;

class Parent {
    public void printParent() {
        System.out.println("parent");
    }
}

class Child extends Parent {
    @Override
    public void printParent() {
        System.out.println("child");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Parent p1 = new Parent();
        Child c1 = new Child();

        p1.printParent();
        c1.printParent();
    }
}

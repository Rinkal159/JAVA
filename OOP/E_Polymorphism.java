package OOP;

class Parent {
     void printParent() {
        System.out.println("parent");
    }
}

class Child extends Parent {
    @Override
    protected void printParent() {
        System.out.println("child");
    }
}

public class E_Polymorphism {
    public static void main(String[] args) {
        // Parent p1 = new Parent();
        Parent c1 = new Child();

        // p1.printParent();
        c1.printParent();
    }
}

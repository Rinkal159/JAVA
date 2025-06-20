package OOP;

class Student {
    public static String school;
    String name;
    int age;

    public void printInfo() {
        System.out.println("Name of school : " + school);
        System.out.println("Name of student : " + this.name);
        System.out.println("age : " + this.age);
    }

    Student(String n, int a) {
        this.name = n;
        this.age = a;
    }
}

public class I_StaticVariable {
    public static void main(String[] args) {
        Student.school = "Progressive high school";

        Student s1 = new Student("krina", 23);
        Student s2 = new Student("rinkal", 18);
        Student s3 = new Student("nimisha", 18);
        Student s4 = new Student("sifa", 19);

        s1.printInfo();
        s2.printInfo();
        s3.printInfo();
        s4.printInfo();
    }
}

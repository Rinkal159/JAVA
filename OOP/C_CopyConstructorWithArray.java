package OOP;

class Student {
    int[] marks;
    String name;

    public void printMarks() {
        System.out.println(this.name);
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);

        }    
    }

    Student(String n) {
        this.marks = new int[3];
        this.name = n;
    }

    Student(Student s1) {
        this.marks = s1.marks; //shallow copy

        // { //deep copy
        //     this.marks = new int[s1.marks.length];
        //     for (int i = 0; i < marks.length; i++) {
        //         this.marks[i] = s1.marks[i];
        //     }
        // }
        this.name = s1.name;
    }
}

public class C_CopyConstructorWithArray {
    public static void main(String[] args) {
        Student s1 = new Student("rinkal");
        s1.marks[0] = 12;
        s1.marks[1] = 20;
        s1.marks[2] = 30;

        Student s2 = new Student(s1);

        s1.printMarks();
        s1.marks[0] = 13; // will change because of pass by reference
        s1.name = "priyanka"; // won't change because of pass by value
        s2.printMarks();
    }
}
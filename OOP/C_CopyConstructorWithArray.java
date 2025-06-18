package OOP;

class Student {
    int[] marks;

    public void printMarks() {
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);

        }
    }

    Student() {
        this.marks = new int[3];
    }

    Student(Student s1) {
        this.marks = s1.marks;
    }
}

public class C_CopyConstructorWithArray {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.marks[0] = 12;
        s1.marks[1] = 20;
        s1.marks[2] = 30;

        Student s2 = new Student(s1);

        s1.printMarks();
        s1.marks[0] = 13;
        s2.printMarks();
    }
}
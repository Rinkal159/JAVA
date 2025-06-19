package OOP;

import java.text.DecimalFormat;

class Student {
    public static String calcPercentage(double math, double chem, double phy) {
        DecimalFormat df = new DecimalFormat("#.##");
        String res = df.format((math + chem + phy) / 3);

        return res;
    }

}

public class J_StaticMethod {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println("Percentage : " + s1.calcPercentage(65, 94, 64));
        Student s2 = new Student();
        System.out.println("Percentage : " + s1.calcPercentage(100, 94, 44));
        Student s3 = new Student();
        System.out.println("Percentage : " + s1.calcPercentage(89, 10, 66));
        Student s4 = new Student();
        System.out.println("Percentage : " + s1.calcPercentage(76, 94, 64));

    }
}

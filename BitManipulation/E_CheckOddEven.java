package BitManipulation;

public class E_CheckOddEven {
    public static String checkOddEven(int a) {
        if((a & 1) != 0) {
            return "Odd";
        } else {
            return "Even";
        }
    }
    public static void main(String[] args) {
        int a = 621879;

        System.out.println(checkOddEven(a));
    }
}

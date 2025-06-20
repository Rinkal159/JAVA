package BitManipulation;

public class H_CheckPowerOfTwo {
    public static String checkPower(int n) {
        if((n & (n-1)) == 0) {
            return "power";
        } else {
            return "not a power";
        }
    }
    public static void main(String[] args) {
        int n = 100;

        System.out.println(checkPower(n));
    }
}

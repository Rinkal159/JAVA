package BasicMathFunctions;
public class C_MakeREVERSE {
    public static void main(String[] args) {
        int n = 10899;
        int div = 1;
        int middleware = 0;

        while(n>0) {
            div =n%10;
            n/=10;
            middleware = (middleware*10) + div;
        }
        n = middleware;
        System.out.println(n);
    }
}
package BitManipulation;

public class F_ClearLastTwo {
    public static void clear(int a) {
        System.out.println((-1 << 2) & a);

    }
    public static void main(String[] args) {
        int a = 15;
    
        clear(a);
    }
}

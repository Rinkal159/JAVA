import java.util.ArrayList;
import java.util.Collections;

public class A_Collections {
    public static void main(String[] args) {
        ArrayList <Integer> arr = new ArrayList<>(10);

        arr.add(1);
        arr.add(5);
        arr.add(9);
        arr.add(3);
        arr.add(10);

        // ascending order
        Collections.sort(arr);
        System.out.print(arr + " ");

        System.out.println();

        // descending order
        Collections.sort(arr, Collections.reverseOrder());
        System.out.print(arr + " ");

    }
}

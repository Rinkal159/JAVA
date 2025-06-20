import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class B_Comparator {
    public static void main(String[] args) {
        ArrayList <Integer> arr = new ArrayList<>(Arrays.asList(1, 5, 9, 3, 10));

        // ascending order
        arr.sort(Comparator.naturalOrder());
        System.out.println(arr);

        // descending order
        arr.sort(Comparator.reverseOrder());
        System.out.println(arr);

    }
}

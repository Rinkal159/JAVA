import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class C_AvoidCase {
    public static void main(String[] args) {
        ArrayList <String> arr = new ArrayList<>(Arrays.asList("ab", "Bcd", "a"));

        // to avoid case (not using comparator, directly sorting)
        arr.sort(String.CASE_INSENSITIVE_ORDER);
        System.out.println(arr);
        
        // sort according to the length of elements
        arr.sort(Comparator.comparing(String::length));
        System.out.println(arr);

    }
}

package Sorting;

import java.util.Arrays;
import java.util.Collections;

public class D_InbuitSort {
    public static void main(String[] args) {

        // ASCENDING : import java.util.Arrays;
        //-------------------------------------

        int[] arr1 = { 5, 2, 3, 1, 4 };
        Arrays.sort(arr1); //to sort all the elements
        Arrays.sort(arr1, 0, 3);  //to sort specific elements, arguments : arr, starting index, ending index



        // DESCENDING : import java.util.Collections;
        //-------------------------------------------

        Integer[] arr2 = {5, 2, 3, 1, 4};
        Arrays.sort(arr2, Collections.reverseOrder());  //to sort all the elements
        Arrays.sort(arr2, 0, 3, Collections.reverseOrder());  //to sort specific elements, arguments : arr, starting index, ending index


        // print asecnding
        for (int i : arr1) {
            System.out.print(i + " ");
        }

        System.out.println();

        // print descending
        for (int i : arr2) {
            System.out.print(i + " ");
        }

    }
}

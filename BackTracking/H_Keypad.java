package BackTracking;

public class H_Keypad {
    public static void printComb(char[][] arr, String dial) {
        int n = dial.length();
        if (n == 0) {
            System.out.println("");
            return;
        }
        makeComb(arr, 0, n, dial, new StringBuilder());
    }

    public static void makeComb(char[][] arr, int i, int n, String dial, StringBuilder sb) {
        if (i == n) {
            System.out.print(sb.toString() + " ");
            return;
        }

        char[] extractedArray = arr[Character.getNumericValue(dial.charAt(i))];

        for (int j = 0; j < extractedArray.length; j++) {
            makeComb(arr, i + 1, n, dial, new StringBuilder(sb).append(extractedArray[j]));
        }

    }

    public static void main(String[] args) {
        char[][] arr = { {}, {}, { 'a', 'b', 'c' }, { 'd', 'e', 'f' }, { 'g', 'h', 'i' }, { 'j', 'k', 'l' },
                { 'm', 'n', 'o' }, { 'p', 'q', 'r', 's' }, { 't', 'u', 'v' }, { 'w', 'x', 'y', 'z' } };

        String dial = "23";

        System.out.println("Possible keypad combinations : ");
        printComb(arr, dial);
    }
}

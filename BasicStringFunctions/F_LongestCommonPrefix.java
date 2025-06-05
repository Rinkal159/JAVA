package BasicStringFunctions;

public class F_LongestCommonPrefix {

    public static Boolean printPrefix(String[] arr, StringBuilder sb) {

        // validations
        if (arr == null || arr[0] == null || arr.length == 0) {
            System.out.println("Invalid input");
            return false;
        }

        // length of the smallest string in the array
        int min = arr[0].length();

        for (int i = 1; i < arr.length; i++) {
            if (arr[i].length() < min) {
                min = arr[i].length();
            }
        }

        for (int j = 0; j < min; j++) {
            char ch = arr[0].charAt(j);

            for (int i = 1; i < arr.length; i++) {

                if (arr[i].charAt(j) != ch) {
                    System.out.println("Longest common prefix : " + sb);
                    return false;
                }
            }
            sb.append(ch);
        }

        return true;

    }

    public static void main(String[] args) {
        String[] arr = { "fly", "flower", "flyover" };
        StringBuilder sb = new StringBuilder("");

        if (printPrefix(arr, sb)) {
            System.out.println("Longest common prefix : " + sb);
        }
    }
}

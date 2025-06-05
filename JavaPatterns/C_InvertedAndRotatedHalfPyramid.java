package JavaPatterns;

public class C_InvertedAndRotatedHalfPyramid {
    public static void main(String[] args) {
        int n= 4;

        // HOLLOW
        for (int i=n; i>=1 ; i--) {
            for (int j = 1; j<=n; j++) {
                if(j==n || i==1 || j==i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
 

        // SOLID
        for(int i=1; i<=n; i++) {
            // for space
            for (int j=n-1; j>=i; j--) {
                System.out.print(" ");
            }

            // for star
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

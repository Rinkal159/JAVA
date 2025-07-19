package BackTracking;

// tiem complexity : O(n^(n+m))

public class E_GridWay {
    public static int gridWays(int i, int j, int n, int m) {
        if(i==n-1 && j==m-1) {
            return 1;
        } else if(i==n || j==m) {
            return 0;
        }

        int wayDown = gridWays(i+1, j, n, m); 
        int wayRight = gridWays(i, j+1, n, m);

        return wayDown + wayRight;
    }
    public static void main(String[] args) {
         int n = 4;
         int m = 3;

         System.out.println("Grid ways total : " + gridWays(0, 0, n, m));
    }
}

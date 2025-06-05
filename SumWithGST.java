import java.util.*;

public class SumWithGST {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
    
        float[] arr = new float[3];

        System.out.println("Price of pencile, pen and eraser respectively : ");

        for (int i=0; i<arr.length; i++) {
            arr[i] = x.nextFloat();
        }

        int sum =0;

        for(int i=0; i<arr.length;i++) {
            sum += arr[i];
        }
        
        float gst = sum * 0.18f;

        System.out.println("Sum of pen, pencil and erase (After adding 18% gst tax) : " + (sum+gst));

            

    }
}

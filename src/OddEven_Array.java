/*
In this section we see how we can find odd and even number using array:
 */
import java.util.Scanner;
public class OddEven_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE LENGTH OF ARRAY : ");
        int a = sc.nextInt();
        int[] arr = new int[a];
        System.out.println("ENTER THE VALUE OF ARRAY : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            System.out.print(" " + arr[i]);
        }
        System.out.println();
        System.out.println("NOW PRINTING THE VALUE OF ODD AND EVEN : ");
        for (int j : arr) {
            if (j % 2 == 0) {
                System.out.println(" " + j);
            } else
                System.out.print(" " + j);
        }
    }
}


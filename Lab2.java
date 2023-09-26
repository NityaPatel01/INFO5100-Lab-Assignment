
// Lab 2 Assignment from HackerRank :  Introduction to Java and Data Structures 
// Submitted by: Nitya Patel
import java.math.*;
import java.util.*;

public class Lab2 {
    public static void main(String[] args) {

        int[][] arr = new int[6][6];
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter Value in the array");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                int a = sc.nextInt();
                if (a >= -9 & a <= 9) {
                    arr[i][j] = a;
                } else {
                    // System.out.println("Invalid Input");
                    j--;
                }
            }
        }

        // for (int i = 0; i < 6; i++) {
        // for (int j = 0; j < 6; j++) {
        // System.out.print(arr[i][j] + " ");
        // }
        // System.out.println();
        // }
        int[][] sum = new int[4][4];
        for (int i = 0; i <= 3; i++) {

            for (int j = 0; j <= 3; j++) {
                sum[i][j] = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 1] + arr[i + 2][j]
                        + arr[i + 2][j + 1] + arr[i + 2][j + 2];

            }
        }

        int max = sum[0][0];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (max < sum[i][j]) {
                    max = sum[i][j];
                }
            }
        }

        System.out.println(max);

    }
}

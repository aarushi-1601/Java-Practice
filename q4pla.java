//find the missing number in given array
//[4,2,1,3,6], missing is 5, print that

import java.io.*;
import java.util.*;

public class q4pla {
    public static void findMissing(int arr[], int N)
    {
        int i;
        int temp[] = new int[N + 1];
        for (i = 0; i <= N; i++) {
            temp[i] = 0;
        }
 
        for (i = 0; i < N; i++) {
            temp[arr[i] - 1] = 1;
        }
 
        int ans = 0;
        for (i = 0; i <= N; i++) {
            if (temp[i] == 0)
                ans = i + 1;
        }
        System.out.printf("The missing number in the array is: ");

        System.out.println(ans);
    }

    public static void main(String[] args)
    {
        int arr[] = { 4,2,1,3,6 };
        int n = arr.length;
 
        // Function call
        findMissing(arr, n);
    }
}


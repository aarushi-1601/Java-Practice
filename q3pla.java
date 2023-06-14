//array is there, find the sum of odd and even numbers
//[2,4,6,7,-1,3,6]

import java.io.*;

public class q3pla {
    public static void main(String args[]){
        int sumEven=0, sumOdd=0;
        int arr[]= {2,4,6,7,-1,3,6};
      
      int n = arr.length;

      //logic implementation
      for(int i = 0; i < n; i++){
         if(arr[i] % 2 == 0){

            
            sumEven = sumEven + arr[i];
         } else {
         
            sumOdd = sumOdd + arr[i];
         }
      }
      
      // printing sum of even and odd numbers
      System.out.println("Sum of Even Numbers:"+sumEven);
      System.out.println("Sum of Odd Numbers:"+sumOdd);

      //checking if sum of even is smaller or sum of odd is smaller
      if(sumEven > sumOdd){
         System.out.println("Sum of odd numbers is smaller");
      } else {
         System.out.println("Sum of Even number is smaller");
      }
   }
}
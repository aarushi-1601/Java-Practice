//array is there, find the sum of odd and even numbers
//[2,4,6,7,-1,3,6]

public class q3pla {
    public static void main(String args[]){
        int sumEven=0, sumOdd=0;
        int arr[]= {2,4,6,7,-1,3,6};
      
      int n = arr.length;

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
   }
}
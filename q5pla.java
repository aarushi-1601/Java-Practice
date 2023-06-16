// range is given, take it on your own and then find the prime numbers between that and print them in form of pairs with the difference of 6 between them

public class q5pla{
   public static void main (String args[]) {

    int lower=1, upper=100;
    for (int i=lower; i<=upper; i++)
       if (isPrime (i))
       System.out.println(i);

   }
   static boolean isPrime (int n)
   {
     int count = 0;

     if (n < 2)
       return false;

     for (int i = 2; i < n; i++)
       {
     if (n % i == 0)
        return false;
       }

     return true;
   }
 }
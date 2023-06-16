// range is given, take it on your own and then find the prime numbers between that and 
//print them in form of pairs with the difference of 6 between them.

import java.util.*;
 
class q5pla{

static void findPrimeNos(int L, int R,Map<Integer,Integer> M,int K)
{
  
  for (int i = L; i <= R; i++)
  {
    if(M.get(i) != null)
      M.put(i, M.get(i) + 1);
    else
      M.put(i, 1);
  }
 
  if (M.get(1) != null)
  {
    M.remove(1);
  }
 
  for (int i = 2;
           i <= Math.sqrt(R); i++)
  {
    int multiple = 2;
     
    while ((i * multiple) <= R)
    {

      if (M.get(i * multiple) != null)
      {
    
        M.remove(i * multiple);
      }
 
      multiple++;
    }
  }
 
  for (Map.Entry<Integer,Integer> entry :
       M.entrySet()) 
  {
    
    if (M.get(entry.getKey() + K) != null)
    {
      System.out.print("(" + entry.getKey() +", " + (entry.getKey() +K) + ") ");
    }
  }
}
 
static void getPrimePairs(int L,int R, int K)
{
  Map<Integer,
      Integer> M = new HashMap<Integer,Integer>(); 
 
  findPrimeNos(L, R, M, K);
}
 
// Driver Code
public static void main(String args[])
{
  int L = 4, R = 30;
 
  int K = 6;
 
  // Function Call
  getPrimePairs(L, R, K);
}
}
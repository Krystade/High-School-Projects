
public class PrimeDecompositions{
    public static void main (String[] args){
        
    }
        
  /**
     Return value: List of all prime factors of a given number n
  */
  public static Long[] getAllPrimeFactors(long n) {
    return new Long[] {};
  }
  /**
     Return value: List containing two lists, first containg all prime factors without duplicates,
     second containing the count, how often each prime factor occured.
     Return code always contains two lists.
     
     e.g.: getUniquePrimeFactorsWithCount(100) = {{2,5},{2,2}) // prime 2 occurs 2 times, prime 2 occurs 5 times, 
  */
  public static Long[][] getUniquePrimeFactorsWithCount(long n) {
    return new Long[][] {{},{}};
  }
  /**
     Return value: List containing product of same prime factors,
     e.g.: 45 = 3*3*5 ==>  {3^2,5^1} == {9,5}
     e.g.: getUniquePrimeFactorsWithCount(100) = {{2,5},{2,2}) // prime 2 occurs 2 times, prime 2 occurs 5 times, 
  */
  public static Long[] getPrimeFactorPotencies(long n) {
    return new Long[] {};
    }
}

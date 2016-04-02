import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by albert on 2/4/16.
 */
public class PrimeFactors {
  public static void generate (int n) {
    int[] startList = {1};
    int[] primeFactors = findFactors(n, startList);
    int[] uniquePrimeFactors = getUniquePrimeFactors(primeFactors);
    System.out.println(Arrays.toString(uniquePrimeFactors));
  }

  private static int[] findFactors (int num, int[] factors) {
    if (num <= 1) return factors;
    else {
      int f;
      for (f = (factors[factors.length - 1] > 1) ? factors[factors.length - 1] : 2; num % f > 0; f++) ;
      int[] newFactors = addElement(factors, f);
      return findFactors(num / f, newFactors);
    }
  }

  private static int[] addElement (int[] array, int num) {
    int[] newArray = Arrays.copyOf(array, array.length + 1);
    newArray[newArray.length - 1] = num;
    return newArray;
  }

  private static int[] getUniquePrimeFactors (int[] array) {
    int[] uniquePrimeFactors = {};
    for (int i = 0; i < array.length; i++) {
      if (uniquePrimeFactors.length == 0) {
        uniquePrimeFactors = addElement(uniquePrimeFactors, array[i]);
      }
      else if (array[i] != uniquePrimeFactors[uniquePrimeFactors.length - 1]) {
        uniquePrimeFactors = addElement(uniquePrimeFactors, array[i]);
      }
    }
    return uniquePrimeFactors;
  }
}

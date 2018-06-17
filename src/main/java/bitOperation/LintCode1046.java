package bitOperation;


//Link: https://www.lintcode.com/problem/prime-number-of-set-bits-in-binary-representation/description
//Title: Prime Number of Set Bits in Binary Representation
//Difficulty: Easy
public class LintCode1046 {
  /**
   * @param L: an integer
   * @param R: an integer
   * @return: the count of numbers in the range [L, R] having a prime number of set bits in their binary representation
   */
  public int countPrimeSetBits(int L, int R) {
    int primeCount = 0;
    for (int i = L; i <= R; i++) {
      int count = numberOfOnes(i);
      if (isPrime(count)) {
        primeCount++;
      }
    }
    return primeCount;
  }

  private int numberOfOnes(int number) {
    int count = 0;
    while (number != 0) {
      number = number & (number - 1);
      count++;
    }
    return count;
  }

  private boolean isPrime(int number) {
    if (number < 2) {
      return false;
    }

    for (int i = 2; i * i <= number; i++) {
      if (number % i == 0) {
        return false;
      }
    }
    return true;
  }
}

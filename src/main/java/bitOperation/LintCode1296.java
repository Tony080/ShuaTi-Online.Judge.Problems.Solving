package bitOperation;

import java.util.Arrays;

//Link: https://www.lintcode.com/problem/maximum-product-of-word-lengths/description
//Title: Maximum Product of Word Lengths
//Difficulty: Medium
public class LintCode1296 {
  public int maxProduct(String[] words) {
    int[] compressedSet = new int[words.length];
    Arrays.fill(compressedSet, -1);
    int max = 0;
    for (int i = 0; i < words.length - 1; i++) {
      if (compressedSet[i] == -1) {
        putWordIntoSet(compressedSet, words[i], i);
      }

      for (int j = i + 1; j < words.length; j++) {
        if (compressedSet[j] == -1) {
          putWordIntoSet(compressedSet, words[j], j);
        }

        if((compressedSet[i] & compressedSet[j]) == 0) {
          int length = words[i].length() * words[j].length();
          max = Math.max(max, length);
        }
      }
    }
    return max;
  }

  private void putWordIntoSet(int[] set, String word, int pos) {
    set[pos] = 0;
    for (char c : word.toCharArray()) {
      set[pos] |= (1 << (c - 'a'));
    }
  }
}

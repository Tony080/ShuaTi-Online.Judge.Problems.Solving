package bitOperation;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//Link: https://www.lintcode.com/problem/repeated-dna/description
//Title: Repeated DNA
//Difficulty: Medium
public class LintCode774 {
  public List<String> findRepeatedDna(String s) {
    int bits = 0;
    int length = s.length();
    Set<Integer> set = new HashSet<>();
    Set<Integer> secondSet = new HashSet<>();
    List<String> result = new ArrayList<>();

    for (int i = 0; i < 10 && i < length; i++) {
      bits = convertStringToBits(bits, s.charAt(i));
    }
    set.add(bits);

    for (int i = 10; i < length; i++) {
      bits = convertStringToBits(bits, s.charAt(i));
      if (!set.add(bits) && secondSet.add(bits)) {
        result.add(s.substring(i - 9, i + 1));
      }
    }
    return result;
  }

  private int convertStringToBits(int bits, char c) {
    int convertBits;
    switch(c) {
      default:
      case 'A':
        convertBits = 0;
        break;
      case 'G':
        convertBits = 1;
        break;
      case 'C':
        convertBits = 2;
        break;
      case 'T':
        convertBits = 3;
    }

    return ((bits << 2) | convertBits) & 0xF_FFFF;
  }
}

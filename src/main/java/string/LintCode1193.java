package string;

//Link: https://www.lintcode.com/problem/detect-capital/description
//Title: Detect Capital
//Difficulty: Easy
public class LintCode1193 {
  /**
   * @param word: a string
   * @return: return a boolean
   */
  public boolean detectCapitalUse(String word) {
    int length = word.length();
    boolean hasCapitalInMiddle = false;
    boolean allCapitalized = Character.isUpperCase(word.charAt(0));

    for (int i = 1; i < length; i++) {
      char c = word.charAt(i);
      boolean capitalized = Character.isUpperCase(word.charAt(i));

      hasCapitalInMiddle = hasCapitalInMiddle | capitalized;
      allCapitalized = allCapitalized & capitalized;
      if (hasCapitalInMiddle && !allCapitalized) {
        return false;
      }
    }
    return true;
  }
}

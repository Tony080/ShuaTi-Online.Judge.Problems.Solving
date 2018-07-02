package string;

//Link: https://www.lintcode.com/problem/binary-representation/description
//Title: Binary Representation
//Difficulty: Hard
public class LintCode180 {
  public String binaryRepresentation(String n) {
    StringBuilder sb = new StringBuilder();
    int intPart = 0;
    int i = 0;
    while (n.charAt(i) != '.') {
      intPart = intPart * 10 + (n.charAt(i) - '0');
      i++;
    }

    if (!parseFracPart(i, sb, n)) {
      return "ERROR";
    }
    parseIntPart(intPart, sb);

    return sb.toString();
  }

  private boolean parseFracPart(int i, StringBuilder sb, String n) {
    int length = n.length();
    long multiplexer = 5;
    long fracPart = 0;
    boolean allZero = true;

    //Read and parse from input string n
    for (i++; i < length; i++) {
      fracPart = fracPart * 10 + (n.charAt(i) - '0');
      if (fracPart != 0) {
        allZero = false;
      }
      if (fracPart >= multiplexer) {
        fracPart -= multiplexer;
        sb.append('1');
      } else{
        sb.append('0');
      }
      multiplexer *= 5;
    }

    //Continue parsing the rest of fracPart
    while (sb.length() < 32 && fracPart != 0) {
      fracPart = fracPart * 10;
      if (fracPart >= multiplexer) {
        fracPart -= multiplexer;
        sb.append('1');
      } else {
        sb.append('0');
      }
      multiplexer *= 5;
    }
    if (sb.length() >= 32) {
      return false;
    }

    if (allZero) {
      sb.setLength(0);
    } else {
      sb.insert(0, '.');
    }
    return true;
  }

  private void parseIntPart(int intPart, StringBuilder sb) {
    if (intPart == 0) {
      sb.insert(0, '0');
      return;
    }

    while (intPart != 0) {
      int reminder = intPart & 1;
      sb.insert(0, reminder);
      intPart /= 2;
    }
  }
}

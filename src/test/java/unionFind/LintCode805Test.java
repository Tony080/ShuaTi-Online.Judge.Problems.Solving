package unionFind;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class LintCode805Test {

  @Test
  public void maximumAssociationSet() {
    String[] t1List1 = new String[] {"abc","abc","abc"};
    String[] t1List2 = new String[] {"bcd","acd","def"};
    String[] t2List1 = new String[] {"a","b","d","e","f"};
    String[] t2List2 = new String[] {"b","c","e","g","g"};
    String[] t3List1 = new String[] {"a","b","c", "d","f","h"};
    String[] t3List2 = new String[] {"b","a","a", "e","g","i"};

    LintCode805 lintCode805 = new LintCode805();
    Set<String> result1Set = createResult1Set();
    for (String str : lintCode805.maximumAssociationSet(t1List1, t1List2)) {
      assertTrue(result1Set.contains(str));
    }

    Set<String> result2Set = createResult2Set();
    for (String str : lintCode805.maximumAssociationSet(t2List1, t2List2)) {
      assertTrue(result2Set.contains(str));
    }

    Set<String> result3Set = createResult3Set();
    for (String str : lintCode805.maximumAssociationSet(t3List1, t3List2)) {
      assertTrue(result3Set.contains(str));
    }
  }

  private Set<String> createResult1Set() {
    Set<String> result1Set = new HashSet<>();
    result1Set.add("abc");
    result1Set.add("acd");
    result1Set.add("bcd");
    result1Set.add("def");
    return result1Set;
  }

  private Set<String> createResult2Set() {
    Set<String> result2Set = new HashSet<>();
    result2Set.add("d");
    result2Set.add("e");
    result2Set.add("f");
    result2Set.add("g");
    return result2Set;
  }

  private Set<String> createResult3Set() {
    Set<String> result3Set = new HashSet<>();
    result3Set.add("a");
    result3Set.add("b");
    result3Set.add("c");
    return result3Set;
  }
}
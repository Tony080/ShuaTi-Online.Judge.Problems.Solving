# Binary Search
## 1. Find the nearest target
<div>
    <p>
        1. 
        <a href="https://www.lintcode.com/problem/find-smallest-letter-greater-than-target/description">LintCode 1056</a>:  
        <a href="https://github.com/Tony-Hu/ShuaTi-Online.Judge.Problems.Solving/blob/master/src/main/java/array/LintCode1056.java">Answer</a>, 
        <a href="https://github.com/Tony-Hu/ShuaTi-Online.Judge.Problems.Solving/blob/master/src/test/java/array/LintCode1056Test.java">Test</a>
    </p>
    <p><b>Description: </b>The core idea is to find smallest character that larger than target. So, the idea is to use <code>left</code> as the index to indicate the potential smallest character that near the target. Notice that, the character pointed by <code>left</code> could smaller or equals to the target, that's why
    another <code>while</code> loop is needed for truely find the "larger" target.</p>
</div>

<div>
    <p>
        2. 
        <a href="https://www.lintcode.com/problem/search-insert-position/description">LintCode 60</a>:  
        <a href="https://github.com/Tony-Hu/ShuaTi-Online.Judge.Problems.Solving/blob/master/src/main/java/array/LintCode60.java">Answer</a>, 
        <a href="https://github.com/Tony-Hu/ShuaTi-Online.Judge.Problems.Solving/blob/master/src/test/java/array/LintCode60Test.java">Test</a>
    </p>
    <p><b>Description: </b>Similar to the previous problem. Use <code>start</code> to indicate the potential place for insertion. And, since the problem assumes that there is no duplicate element. There is only need to compare with 2 elements in the array to decide where to insert: <code>A[start]</code> and <code>A[start + 1]</code>.</p>
</div>

## 2. Find # in rotated array
<div>
    <p>
        1. 
        <a href="https://www.lintcode.com/problem/search-in-rotated-sorted-array/description">LintCode 62</a>:  
        <a href="https://github.com/Tony-Hu/ShuaTi-Online.Judge.Problems.Solving/blob/master/src/main/java/array/LintCode62.java">Answer</a>, 
        <a href="https://github.com/Tony-Hu/ShuaTi-Online.Judge.Problems.Solving/blob/master/src/test/java/array/LintCode62Test.java">Test</a>
    </p>
    <p><b>Description: </b>In practice, the binary search algorithm is separated into 3 part:<br>
    a) <code>A[mid] == target</code><br>
    b) <code>A[mid] < target</code><br>
    c) <code>A[mid] > target</code><br>
    However, there are some difference in rotated array. Instead of getting rid of left part directly when meets the <code>b)</code> situation. We need to consider whether the <code>target >= start > mid</code>. If yes, that's means the target is potentially in the left part rather than right part.<br>
    On the other hand, when we are facing <code>c)</code> situation, we can't simply ignore the right part. Since when <code>mid > target >= end</code>, we shall search the target in the right part.</p>
</div>
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
# Dynamic Programming
wiki: https://en.wikipedia.org/wiki/Dynamic_programming
## 1. O(n) space 1-D DP
<div>
    <p>
        1. 
        <a href="https://www.lintcode.com/problem/counting-bits/description">LintCode 664</a>:  
        <a href="https://github.com/Tony-Hu/ShuaTi-Online.Judge.Problems.Solving/blob/master/src/main/java/dp/LintCode664.java">Answer</a>, 
        <a href="https://github.com/Tony-Hu/ShuaTi-Online.Judge.Problems.Solving/blob/master/src/test/java/dp/LintCode664Test.java">Test</a>
    </p>
    <p><b>Description: </b>Iterate through 0 to num, counting 1's in each number. From binary perspective, since we know that <code>0</code> contains no 1. So, <code>1</code> should contains <code>0 + 1 % 2</code> 1's. And <code>2</code> should contains <code>number of 1's from [1] + 2 % 2</code>. And etc.<br>
    Another solution is to use <b><a href="https://github.com/Tony-Hu/ShuaTi-Online.Judge.Problems.Solving/tree/master/src/main/java/bitOperation#1-count-1-in-a-number">Bit Operation</a></b> to solve the problem.</p>
</div>
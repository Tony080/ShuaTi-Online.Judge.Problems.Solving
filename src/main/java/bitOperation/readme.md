# Bitwise operation
wiki: https://en.wikipedia.org/wiki/Bitwise_operation

## 1. Count 1 in a number
<div>
    <p>
        1. 
        <a href="https://www.lintcode.com/problem/count-1-in-binary/description">LintCode 365</a>:  
        <a href="https://github.com/Tony-Hu/ShuaTi-Online.Judge.Problems.Solving/blob/master/src/main/java/bitOperation/LintCode365.java">Answer</a>, 
        <a href="https://github.com/Tony-Hu/ShuaTi-Online.Judge.Problems.Solving/blob/master/src/test/java/bitOperation/LintCode365Test.java">Test</a>
    </p>
    <p><b>Description: </b>Time complexity O(m) where m is the # of 1's.</p>
</div>
<div>
    <p>
        2. 
        <a href="https://www.lintcode.com/problem/prime-number-of-set-bits-in-binary-representation/description">LintCode 1046</a>:  
        <a href="https://github.com/Tony-Hu/ShuaTi-Online.Judge.Problems.Solving/blob/master/src/main/java/bitOperation/LintCode1046.java">Answer</a>, 
        <a href="https://github.com/Tony-Hu/ShuaTi-Online.Judge.Problems.Solving/blob/master/src/test/java/bitOperation/LintCode1046Test.java">Test</a>
    </p>
    <p><b>Description: </b>Iterate from <code>L</code> to <code>R</code>.
    First count # of 1's in that number. Then judge if the # of 1's is a prime number. Finally, return how many # of 1s are prime. The total time complexity is <img src="http://chart.googleapis.com/chart?cht=tx&chl=O(n\sqrt{n})" /></p>
</div>
# Bitwise operation
wiki: https://en.wikipedia.org/wiki/Bitwise_operation

## 1. Count 1 in a number
Any number can be converted to binary format. This kind of questions will ask you to 
count # of 1's in a number.<br>
Like ``32(100000)`` has only one 1's in it's binary representation. While ``31(11111)`` contains five 1's.
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
<div>
    <p>
        3. 
        <a href="https://www.lintcode.com/problem/flip-bits/description">LintCode 181</a>:  
        <a href="https://github.com/Tony-Hu/ShuaTi-Online.Judge.Problems.Solving/blob/master/src/main/java/bitOperation/LintCode181.java">Answer</a>, 
        <a href="https://github.com/Tony-Hu/ShuaTi-Online.Judge.Problems.Solving/blob/master/src/test/java/bitOperation/LintCode181Test.java">Test</a>
    </p>
    <p><b>Description: </b>First, use XOR operation to calculate the different of given two numbers and store in <code>c</code>. Then, convert the question to count # of 1's in a number.</p>
</div>
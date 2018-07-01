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
    <p><b>Description: </b>First, use XOR operation to calculate the difference of given two numbers and store in <code>c</code>. Then, convert the question to count # of 1's in a number.</p>
</div>
<div>
    <p>
        4. 
        <a href="https://www.lintcode.com/problem/o1-check-power-of-2/description">LintCode 142</a>:  
        <a href="https://github.com/Tony-Hu/ShuaTi-Online.Judge.Problems.Solving/blob/master/src/main/java/bitOperation/LintCode142.java">Answer</a>, 
        <a href="https://github.com/Tony-Hu/ShuaTi-Online.Judge.Problems.Solving/blob/master/src/test/java/bitOperation/LintCode142Test.java">Test</a>
    </p>
    <p><b>Description: </b>If a number is the power of 2, there should only contain one 1 in the number. For example, <code>8(1000)</code> is 2<sup>3</sup>. And 8-1 is <code>7(0111)</code>. Thje result of <code>8&7</code> is 0, accept.
    On the other hand, <code>6(110)</code> is not the power of 2, and 6-1 is <code>5(101)</code>, <code>6&5!=0</code>, reject. It's done in <code>O(1)</code> time.</p>
</div>

## 2. Get highest bit
<div>
    <p>
        1. 
        <a href="https://www.lintcode.com/problem/number-complement/description">LintCode 1218</a>:  
        <a href="https://github.com/Tony-Hu/ShuaTi-Online.Judge.Problems.Solving/blob/master/src/main/java/bitOperation/LintCode1218.java">Answer</a>, 
        <a href="https://github.com/Tony-Hu/ShuaTi-Online.Judge.Problems.Solving/blob/master/src/test/java/bitOperation/LintCode1218Test.java">Test</a>
    </p>
    <p><b>Description: </b>First calculate a number with the same highest 1 followed by 0s. For example, given <code>5(101)</code>. Calculate the the numberwith the highest bit 1: <code>4(100)</code>. Then, fill the number with 1s: <code>7(111)</code>. Then, do XOR operation to find complement.</p>
</div>

## 3. Get even bits, odd bits
<div>
    <p>
        1. 
        <a href="https://www.lintcode.com/problem/swap-bits/description">LintCode 236</a>:  
        <a href="https://github.com/Tony-Hu/ShuaTi-Online.Judge.Problems.Solving/blob/master/src/main/java/bitOperation/LintCode236.java">Answer</a>, 
        <a href="https://github.com/Tony-Hu/ShuaTi-Online.Judge.Problems.Solving/blob/master/src/test/java/bitOperation/LintCode236Test.java">Test</a>
    </p>
    <p><b>Description: </b>Use mask <code>0xAAAAAAAA</code> and <code>0x55555555</code> to extract odd bits and even bits. And then, use <code><<</code>, <code>>>></code> and <code>|</code> to swap bits.</p>
</div>
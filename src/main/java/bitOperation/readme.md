# Bitwise operation
wiki: https://en.wikipedia.org/wiki/Bitwise_operation

## 1. Count 1 in a number - ``&``
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
        <a href="https://www.lintcode.com/problem/number-of-1-bits/description">LintCode 1332</a>:  
        <a href="https://github.com/Tony-Hu/ShuaTi-Online.Judge.Problems.Solving/blob/master/src/main/java/bitOperation/LintCode1332.java">Answer</a>, 
        <a href="https://github.com/Tony-Hu/ShuaTi-Online.Judge.Problems.Solving/blob/master/src/test/java/bitOperation/LintCode1332Test.java">Test</a>
    </p>
    <p><b>Description: </b>Same as LintCode 365.</p>
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
        <a href="https://www.lintcode.com/problem/counting-bits/description">LintCode 664</a>:  
        <a href="https://github.com/Tony-Hu/ShuaTi-Online.Judge.Problems.Solving/blob/master/src/main/java/bitOperation/LintCode664.java">Answer</a>, 
        <a href="https://github.com/Tony-Hu/ShuaTi-Online.Judge.Problems.Solving/blob/master/src/test/java/bitOperation/LintCode664Test.java">Test</a>
    </p>
    <p><b>Description: </b>Iterate through 0 to num, counting 1's in each number. Another solution is to use <b><a href="https://github.com/Tony-Hu/ShuaTi-Online.Judge.Problems.Solving/tree/master/src/main/java/dp#1-on-space-1-d-dp">Dynamic Programming</a></b> to solve the problem. </p>
</div>

## 2. Get highest bit - ``>>, <<, |``
<div>
    <p>
        1. 
        <a href="https://www.lintcode.com/problem/number-complement/description">LintCode 1218</a>:  
        <a href="https://github.com/Tony-Hu/ShuaTi-Online.Judge.Problems.Solving/blob/master/src/main/java/bitOperation/LintCode1218.java">Answer</a>, 
        <a href="https://github.com/Tony-Hu/ShuaTi-Online.Judge.Problems.Solving/blob/master/src/test/java/bitOperation/LintCode1218Test.java">Test</a>
    </p>
    <p><b>Description: </b>First calculate a number with the same highest 1 followed by 0s. For example, given <code>5(101)</code>. Calculate the the numberwith the highest bit 1: <code>4(100)</code>. Then, fill the number with 1s: <code>7(111)</code>. Then, do XOR operation to find complement.</p>
</div>

## 3. Get even bits, odd bits - ``&, 0xAAAA_AAAA, 0x5555_5555``
<div>
    <p>
        1. 
        <a href="https://www.lintcode.com/problem/swap-bits/description">LintCode 236</a>:  
        <a href="https://github.com/Tony-Hu/ShuaTi-Online.Judge.Problems.Solving/blob/master/src/main/java/bitOperation/LintCode236.java">Answer</a>, 
        <a href="https://github.com/Tony-Hu/ShuaTi-Online.Judge.Problems.Solving/blob/master/src/test/java/bitOperation/LintCode236Test.java">Test</a>
    </p>
    <p><b>Description: </b>Use mask <code>0xAAAA AAAA</code>(<code>(A)<sub>16</sub>=(1010)<sub>2</sub></code>) and <code>0x5555 5555</code>(<code>(5)<sub>16</sub>=(0101)<sub>2</sub></code>) to extract odd bits and even bits. And then, use <code><<</code>, <code>>>></code> and <code>|</code> to swap bits.</p>
</div>
<div>
    <p>
        2. 
        <a href="https://www.lintcode.com/problem/binary-number-with-alternating-bits/description">LintCode 987</a>:  
        <a href="https://github.com/Tony-Hu/ShuaTi-Online.Judge.Problems.Solving/blob/master/src/main/java/bitOperation/LintCode987.java">Answer</a>, 
        <a href="https://github.com/Tony-Hu/ShuaTi-Online.Judge.Problems.Solving/blob/master/src/test/java/bitOperation/LintCode987Test.java">Test</a>
    </p>
    <p><b>Description: </b>If a number is formed by alternating bits, it must has all the bits in even or odd.</p>
</div>

## 4. Power of x. x = 2, 4, 8, 16... - ``&``
See [here](https://github.com/Tony-Hu/ShuaTi-Online.Judge.Problems.Solving/tree/master/src/main/java/mathematics#1-power-of-x-x--2-4-8-16) for power of x, x != 2, 4, 8, 16...
<div>
    <p>
        1. 
        <a href="https://www.lintcode.com/problem/o1-check-power-of-2/description">LintCode 142</a>:  
        <a href="https://github.com/Tony-Hu/ShuaTi-Online.Judge.Problems.Solving/blob/master/src/main/java/bitOperation/LintCode142.java">Answer</a>, 
        <a href="https://github.com/Tony-Hu/ShuaTi-Online.Judge.Problems.Solving/blob/master/src/test/java/bitOperation/LintCode142Test.java">Test</a>
    </p>
    <p><b>Description: </b>If a number is the power of 2, there should only contain one 1 in the number. For example, <code>8(1000)</code> is 2<sup>3</sup>. And 8-1 is <code>7(0111)</code>. The result of <code>8&7</code> is 0, accept.
    On the other hand, <code>6(110)</code> is not the power of 2, and 6-1 is <code>5(101)</code>, <code>6&5!=0</code>, reject. It's done in <code>O(1)</code> time.</p>
</div>
<div>
    <p>
        2. 
        <a href="https://www.lintcode.com/problem/power-of-four/description">LintCode 1285</a>:  
        <a href="https://github.com/Tony-Hu/ShuaTi-Online.Judge.Problems.Solving/blob/master/src/main/java/bitOperation/LintCode1285.java">Answer</a>, 
        <a href="https://github.com/Tony-Hu/ShuaTi-Online.Judge.Problems.Solving/blob/master/src/test/java/bitOperation/LintCode1285Test.java">Test</a>
    </p>
    <p><b>Description: </b>A number is a power of 4 has to fufill the following description: 1. The number is the power of 2; 2. The only <code>1</code> can only appear at <b>even</b> position in binary representation. That means, <code>8(100)</code> is not the power of 4. But <code>16(1000)</code> is the power of 4.</p>
</div>

## 5. Mask specified bit(s) - ``<<, ~, |, &``
<div>
    <p>
        1. 
        <a href="https://www.lintcode.com/problem/update-bits/description">LintCode 179</a>:  
        <a href="https://github.com/Tony-Hu/ShuaTi-Online.Judge.Problems.Solving/blob/master/src/main/java/bitOperation/LintCode179.java">Answer</a>, 
        <a href="https://github.com/Tony-Hu/ShuaTi-Online.Judge.Problems.Solving/blob/master/src/test/java/bitOperation/LintCode179Test.java">Test</a>
    </p>
    <p><b>Description: </b>The mask is made by 2 parts, the input <code>i</code> and <code>j</code> are the indices start from 0: <br>
    <b>1) Higher bits mask</b>: Operation <code>~((1L << (j + 1)) - 1)</code> makes the bits lower than j to be <code>0</code>(include j bit), and higher than j to be <code>1</code>(exclude j bit). For example, <code>j=6</code>. The result of the operation will be <code>0xFFFF FF80</code>. <br>
    <b>2) Lower bits mask</b>: Operation <code>(1L << i) - 1</code> makes the bits lower than i to be <code>1</code>(exclude i bit). For example, <code>i=2</code>. The result of the operation will be <code>0b11</code>.<br>
    Then, connect the higher bits mask and lower bits mask together. And do an and(<code>&</code>) operation with input n. For example, we have <code>n=2047(111 1111 1111)</code>, the result after do & with mask is <code>1923(111 1000 0011)</code>.<br>
    Suppose we have <code>m=3(11)</code>, the final result would be <code>1935(111 1000 <b><i>11</i></b>11)</code>.</p>
</div>

## 6. Check valid bit(s) - ``>>>``
Use <code>&</code>,<code>>>></code> to fast check if the given number is valid from some certain conditions.
<div>
    <p>
        1. 
        <a href="https://www.lintcode.com/problem/utf-8-validation/description">LintCode 1262</a>:  
        <a href="https://github.com/Tony-Hu/ShuaTi-Online.Judge.Problems.Solving/blob/master/src/main/java/bitOperation/LintCode1262.java">Answer</a>, 
        <a href="https://github.com/Tony-Hu/ShuaTi-Online.Judge.Problems.Solving/blob/master/src/test/java/bitOperation/LintCode1262Test.java">Test</a>
    </p>
    <p><b>Description: </b>Iterate through the given data sets. Notice that, there may have more than 1 UTF-8 charater in the given dataset. And finally, it shall check if there have enough <code>10xxxxxx</code> to match with if the given UTF-8 charater is more than 1 byte long.</p>
</div>

## 7. Use integer array as a compressed set for string - ``|, <<``
Assume the set is only made by lower case letters, there are 26 letters and an integer has 32 bits. It's enough for an integer to save the existence of each character in a word.
<div>
    <p>
        1. 
        <a href="https://www.lintcode.com/problem/maximum-product-of-word-lengths/description">LintCode 1296</a>:  
        <a href="https://github.com/Tony-Hu/ShuaTi-Online.Judge.Problems.Solving/blob/master/src/main/java/bitOperation/LintCode1296.java">Answer</a>, 
        <a href="https://github.com/Tony-Hu/ShuaTi-Online.Judge.Problems.Solving/blob/master/src/test/java/bitOperation/LintCode1296Test.java">Test</a>
    </p>
    <p><b>Description: </b>Use an integer to save the existance of characters from a string. Use the same size integer array to save the character existance from input words array. Then use and(<code>&</code>) operation to check if there are common charater(s) in different words. 
    If not, check with the length and update if bigger than existing <code>max</code>.</p>
</div>

## 8. Use integer like hash code with bit operations - ``<<, |, &``
If given input can be fulfilled in an integer, we can use the integer as the hash code with bit operations.
<div>
    <p>
        1. 
        <a href="https://www.lintcode.com/problem/repeated-dna/description">LintCode 774</a>:  
        <a href="https://github.com/Tony-Hu/ShuaTi-Online.Judge.Problems.Solving/blob/master/src/main/java/bitOperation/LintCode774.java">Answer</a>, 
        <a href="https://github.com/Tony-Hu/ShuaTi-Online.Judge.Problems.Solving/blob/master/src/test/java/bitOperation/LintCode774Test.java">Test</a>
    </p>
    <p><b>Description: </b>We can use a simple map:<br>
    <code>0(00)</code> - <code>A</code><br>
    <code>1(01)</code> - <code>G</code><br>
    <code>2(10)</code> - <code>C</code><br>
    <code>3(11)</code> - <code>T</code><br>
    And the given input only has 10 length. So the total length for each hash code would be 20 bits. It's acceptable to use the integer to save it. And we can use bit manipulation to do the operation. <br>
    What's more, 2 sets are used. One for check if it's already met before, and another is used to check if it's already added to the result list. <code>set.add(value)</code> method will return <code>false</code> if the value has already in the set.</p>
</div>

##9. [Hamming distance](https://en.wikipedia.org/wiki/Hamming_distance) - ``^, >>>, &``
<div>
    <p>
        1. 
        <a href="https://www.lintcode.com/problem/hamming-distance/description">LintCode 835</a>:  
        <a href="https://github.com/Tony-Hu/ShuaTi-Online.Judge.Problems.Solving/blob/master/src/main/java/bitOperation/LintCode835.java">Answer</a>, 
        <a href="https://github.com/Tony-Hu/ShuaTi-Online.Judge.Problems.Solving/blob/master/src/test/java/bitOperation/LintCode835Test.java">Test</a>
    </p>
    <p><b>Description: </b>Do an XOR(<code>^</code>) operation with each pair. This is done in O(m) time. Where m is the max # of 1's through all the input numbers.</p>
</div>
Follow up question:<br>
<div>
    <p>
        2. 
        <a href="https://www.lintcode.com/problem/total-hamming-distance/description">LintCode 1217</a>:  
        <a href="https://github.com/Tony-Hu/ShuaTi-Online.Judge.Problems.Solving/blob/master/src/main/java/bitOperation/LintCode1217.java">Answer</a>, 
        <a href="https://github.com/Tony-Hu/ShuaTi-Online.Judge.Problems.Solving/blob/master/src/test/java/bitOperation/LintCode1217Test.java">Test</a>
    </p>
    <p><b>Description: </b>To calculate the total hamming distance, instead of iterate through each pair in O(n<sup>2</sup>) time, just calculate 1's and 0's through each bits with all the numbers. And the total distance in that bit would be <code># of 0's</code> * <code># of 1's</code>.<br>
    Sum up all the distance bit by bit. And we got the total distance. This is done in O(n) time. <br>
    On the other hand, the easiest way to think is to iterate each pair, and do a XOR(<code>^</code>) operation with each pair. This is done in O(n<sup>2</sup>m) time. Where m is the max # of 1's through all the input numbers.</p>
</div>
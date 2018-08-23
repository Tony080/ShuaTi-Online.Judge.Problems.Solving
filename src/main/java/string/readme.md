# String manipulation
wiki: https://en.wikipedia.org/wiki/Category:String_manipulation_templates

## 1. String detection
<div>
    <p>
        1. 
        <a href="https://www.lintcode.com/problem/detect-capital/description">LintCode 1193</a>:  
        <a href="https://github.com/Tony-Hu/ShuaTi-Online.Judge.Problems.Solving/blob/master/src/main/java/string/LintCode1193.java">Answer</a>, 
        <a href="https://github.com/Tony-Hu/ShuaTi-Online.Judge.Problems.Solving/blob/master/src/test/java/string/LintCode1193Test.java">Test</a>
    </p>
    <p><b>Description: </b>String detection using <a href="https://github.com/Tony-Hu/ShuaTi-Online.Judge.Problems.Solving/tree/master/src/main/java/bitOperation">bit wise manipulation</a>. 
    If there has upper case in the middle while the entire word are not all in upper case, return <code>False</code>. Otherwise, return <code>True</code>.</p>
</div>

## 2. String contains
Given 2 strings, decide if one string is in another string via some operations(eg. deletion, addition, subset).<br>
<div>
    <p>
        1. 
        <a href="https://www.lintcode.com/problem/delete-characters/description">LintCode 1445</a>:  
        <a href="https://github.com/Tony-Hu/ShuaTi-Online.Judge.Problems.Solving/blob/master/src/main/java/string/LintCode1445.java">Answer</a>, 
        <a href="https://github.com/Tony-Hu/ShuaTi-Online.Judge.Problems.Solving/blob/master/src/test/java/string/LintCode1445Test.java">Test</a>
    </p>
    <p><b>Description: </b>Use two pointers on each string to decide if the first string <code>s</code> can change to the second string <code>t</code>
    via deletion.</p>
</div>

## 3. String sorting
<div>
    <p>
        1. 
        <a href="https://www.lintcode.com/problem/log-sorting/description">LintCode 1380</a>:  
        <a href="https://github.com/Tony-Hu/ShuaTi-Online.Judge.Problems.Solving/blob/master/src/main/java/string/LintCode1380.java">Answer</a>, 
        <a href="https://github.com/Tony-Hu/ShuaTi-Online.Judge.Problems.Solving/blob/master/src/test/java/string/LintCode1380Test.java">Test</a>
    </p>
    <p><b>Description: </b>Use the <code>Arrays.sort()</code> to sort the string array. <b>Lambda</b> is introduced to replace the traditional <code>Comparator</code>.</p>
</div>

## 4. String reverse
<div>
    <p>
        1. 
        <a href="https://www.lintcode.com/problem/reverse-words-in-a-string/description">LintCode 53</a>:  
        <a href="https://github.com/Tony-Hu/ShuaTi-Online.Judge.Problems.Solving/blob/master/src/main/java/string/LintCode53.java">Answer</a>, 
        <a href="https://github.com/Tony-Hu/ShuaTi-Online.Judge.Problems.Solving/blob/master/src/test/java/string/LintCode53Test.java">Test</a>
    </p>
    <p><b>Description: </b><code>Stack</code> is considering used in this question. But actually use two <code>StringBuilder</code> to do the stuff. 
    <code>StringBuilder.insert(index, content)</code> is used to act as a stack.</p>
</div>
<b>Follow up question</b>:<br>
<div>
    <p>
        2. 
        <a href="https://www.lintcode.com/problem/reverse-words-in-a-string-iii/description">LintCode 1173</a>:  
        <a href="https://github.com/Tony-Hu/ShuaTi-Online.Judge.Problems.Solving/blob/master/src/main/java/string/LintCode1173.java">Answer</a>, 
        <a href="https://github.com/Tony-Hu/ShuaTi-Online.Judge.Problems.Solving/blob/master/src/test/java/string/LintCode1173Test.java">Test</a>
    </p>
    <p><b>Description: </b>Reverse each word separated by space. Use 2 <code>StringBuilder</code> to do the string reverse.</p>
</div>

## 5. String palindrome
<div>
    <p>
        1. 
        <a href="https://www.lintcode.com/problem/longest-palindromic-substring/description">LintCode 200</a>:  
        <a href="https://github.com/Tony-Hu/ShuaTi-Online.Judge.Problems.Solving/blob/master/src/main/java/string/LintCode200.java">Answer</a>, 
        <a href="https://github.com/Tony-Hu/ShuaTi-Online.Judge.Problems.Solving/blob/master/src/test/java/string/LintCode200Test.java">Test</a>
    </p>
    <p><b>Description: </b>Iterate through each charater in string. Treat the selected charater as the mid point of palindrome. Find the maximum length of the palindrome based on the spcified charater. Return the largest one.</p>
</div>

## 6. String to fractional binary
<div>
    <p>
        1. 
        <a href="https://www.lintcode.com/problem/binary-representation/description">LintCode 180</a>:  
        <a href="https://github.com/Tony-Hu/ShuaTi-Online.Judge.Problems.Solving/blob/master/src/main/java/string/LintCode180.java">Answer</a>, 
        <a href="https://github.com/Tony-Hu/ShuaTi-Online.Judge.Problems.Solving/blob/master/src/test/java/string/LintCode180Test.java">Test</a>
    </p>
    <p><b>Description: </b>Separated into 2 parts:<br>
    <b>1) Integer part</b>: Collect number from String, and do division and modification(Use <code>&</code> for higher performance) in reverse order to get it's binary representation. 
    Notice that, do fractional part first in case of it returns an <code>"ERROR"</code> and thus the program calculates the integer binary in vain.<br>
    <b>2) Fractional Part</b>: Collect the number, compare with the multiplexer <code>5, 25, 125, ...</code> step by step to get the fracional part. If the fractional part is greater equal than the current multiplexer, substract the fractional part with multiplexer, and record an <code>1</code>. Otherwise, record a <code>0</code>.
    If the length of fractional part is greater than 32, and there are remainning in fractional part, it's not accurately stored in memory, return <code>"ERROR"</code>. If there are <b>all zeros</b> in fractional part, ignore the <code>.</code>.</p>
</div>

## 7. String sequence
<div>
    <p>
        1. 
        <a href="https://www.lintcode.com/problem/count-and-say/description">LintCode 420</a>:  
        <a href="https://github.com/Tony-Hu/ShuaTi-Online.Judge.Problems.Solving/blob/master/src/main/java/string/LintCode420.java">Answer</a>, 
        <a href="https://github.com/Tony-Hu/ShuaTi-Online.Judge.Problems.Solving/blob/master/src/test/java/string/LintCode420Test.java">Test</a>
    </p>
    <p><b>Description: </b>The count and say is the problem that solves string sequence problem. The initial situation is <code>1</code>, count and say <code>1</code>, and get the result <code>one one(11)</code>. And then count and say <code>11</code> toe get the result <code>two one(21)</code>, and etc..</p>
</div>

## 8. Get next greater number with string(char array)
<div>
    <p>
        1. 
        <a href="https://www.lintcode.com/problem/next-greater-element-iii/description">LintCode 1174</a>:  
        <a href="https://github.com/Tony-Hu/ShuaTi-Online.Judge.Problems.Solving/blob/master/src/main/java/string/LintCode1174.java">Answer</a>, 
        <a href="https://github.com/Tony-Hu/ShuaTi-Online.Judge.Problems.Solving/blob/master/src/test/java/string/LintCode1174Test.java">Test</a>
    </p>
    <p><b>Description: </b>To get the next greater number, the first step is convert the integer to char array. Then, look up from the end, find the ascending sequence and exchange the most smallest one in the sequence of two  as the smallest one with the second smallest number afterwards through the number. For example:<br>
    1321 -> 1 & 3 is the only ascending sequence -> select 1 as the smallest number, look up through 321, we find 2 is the second smallest number -> exchange 1 & 2 -> 2311<br>
    Then, the next step is sort the rest element, which is <code>311</code> in the example above. And compare with <code>Integer.MAX_VALUE</code>.</p>
</div>
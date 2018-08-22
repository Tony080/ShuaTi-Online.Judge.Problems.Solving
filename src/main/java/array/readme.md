# Array operations
## 1. Iterate 2-D array, check with up, down, left and right
<div>
    <p>
        1. 
        <a href="https://www.lintcode.com/problem/island-perimeter/description">LintCode 1225</a>:  
        <a href="https://github.com/Tony-Hu/ShuaTi-Online.Judge.Problems.Solving/blob/master/src/main/java/array/LintCode1225.java">Answer</a>, 
        <a href="https://github.com/Tony-Hu/ShuaTi-Online.Judge.Problems.Solving/blob/master/src/test/java/array/LintCode1225Test.java">Test</a>
    </p>
    <p><b>Description: </b>Basically, each <code>1</code> holds 4 perimeter. Check if there exists 1 in near four blocks for each <code>1</code> from data. If exists, decrease the primeter the 1 holds.</p>
</div>

## 2. Count and change
<div>
    <p>
        1. 
        <a href="https://www.lintcode.com/problem/can-place-flowers/description">LintCode 1138</a>:  
        <a href="https://github.com/Tony-Hu/ShuaTi-Online.Judge.Problems.Solving/blob/master/src/main/java/array/LintCode1138.java">Answer</a>, 
        <a href="https://github.com/Tony-Hu/ShuaTi-Online.Judge.Problems.Solving/blob/master/src/test/java/array/LintCode1138Test.java">Test</a>
    </p>
    <p><b>Description: </b>Because <code>11</code> can't exist, there can only change <code>000</code> to <code>010</code> when iterating through the array. When the change happend, <code>count++</code>.</p>
</div>

## 3. Rotate array in O(1) space
<div>
    <p>
        1. 
        <a href="https://www.lintcode.com/problem/rotate-string/description">LintCode 8</a>:  
        <a href="https://github.com/Tony-Hu/ShuaTi-Online.Judge.Problems.Solving/blob/master/src/main/java/array/LintCode8.java">Answer</a>, 
        <a href="https://github.com/Tony-Hu/ShuaTi-Online.Judge.Problems.Solving/blob/master/src/test/java/array/LintCode8Test.java">Test</a>
    </p>
    <p><b>Description: </b>The opertion move the last element to the top can be done in O(1) space. Repeat this steps for <code>offset</code> times to finish this job. Notice that, <code>offset %= str.length</code> is a shortcut to avoid move the array in vain.</p>
</div>
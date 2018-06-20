# Union find (Disjoint-set)
wiki: https://en.wikipedia.org/wiki/Disjoint-set_data_structure

## 1. Basic union find
<div>
    <p>
        1. 
        <a href="https://www.lintcode.com/problem/connecting-graph/description">LintCode 589</a>:  
        <a href="https://github.com/Tony-Hu/ShuaTi-Online.Judge.Problems.Solving/blob/master/src/main/java/unionFind/LintCode589.java">Answer</a>, 
        <a href="https://github.com/Tony-Hu/ShuaTi-Online.Judge.Problems.Solving/blob/master/src/test/java/unionFind/LintCode589Test.java">Test</a>
    </p>
    <p><b>Description: </b>Basic union find with <i>Road compress</i> method used to reduce the 
    time complexity of <code>find()</code>. It's <code>O(1)</code> on average.</p>
</div>

## 2. 2-D union find
<div>
    <p>
        1. 
        <a href="https://www.lintcode.com/problem/set-union/description">LintCode 1396</a>:  
        <a href="https://github.com/Tony-Hu/ShuaTi-Online.Judge.Problems.Solving/blob/master/src/main/java/unionFind/LintCode1396.java">Answer</a>, 
        <a href="https://github.com/Tony-Hu/ShuaTi-Online.Judge.Problems.Solving/blob/master/src/test/java/unionFind/LintCode1396Test.java">Test</a>
    </p>
    <p><b>Description: </b>2-D union find. Treat each row as an element in union find. The final purpose is to count how many unique sets exist.
    Initialize a huge array to map values from set to a row. The default value is <code>-1</code> which represents map not exist yet.</p>
</div>
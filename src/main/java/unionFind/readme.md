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
<div>
    <p>
        2. 
        <a href="https://www.lintcode.com/problem/connecting-graph-ii/description">LintCode 590</a>:  
        <a href="https://github.com/Tony-Hu/ShuaTi-Online.Judge.Problems.Solving/blob/master/src/main/java/unionFind/LintCode590.java">Answer</a>, 
        <a href="https://github.com/Tony-Hu/ShuaTi-Online.Judge.Problems.Solving/blob/master/src/test/java/unionFind/LintCode590Test.java">Test</a>
    </p>
    <p><b>Description: </b>Follow up of <a href="https://www.lintcode.com/problem/connecting-graph/description">LintCode 589</a>. Besides get if 2 given nodes are connected. Return how many nodes the given node is connected with.
    Need an extra array with the same size of union find array to hold the count. Basically, always save and update the total count on the root node.</p>
</div>
<div>
    <p>
        3. 
        <a href="https://www.lintcode.com/problem/connecting-graph-iii/description">LintCode 591</a>:  
        <a href="https://github.com/Tony-Hu/ShuaTi-Online.Judge.Problems.Solving/blob/master/src/main/java/unionFind/LintCode591.java">Answer</a>, 
        <a href="https://github.com/Tony-Hu/ShuaTi-Online.Judge.Problems.Solving/blob/master/src/test/java/unionFind/LintCode591Test.java">Test</a>
    </p>
    <p><b>Description: </b>Follow up of <a href="https://www.lintcode.com/problem/connecting-graph/description">LintCode 589</a>. Calculate the total unique graph count. 
    Use a global count as initialized to the total number of nodes on start. When there is a connect & re-root operation, <code>count--</code>.</p>
</div>
<div>
    <p>
        4. 
        <a href="https://www.lintcode.com/problem/graph-valid-tree/description">LintCode 178</a>:  
        <a href="https://github.com/Tony-Hu/ShuaTi-Online.Judge.Problems.Solving/blob/master/src/main/java/unionFind/LintCode178.java">Answer</a>, 
        <a href="https://github.com/Tony-Hu/ShuaTi-Online.Judge.Problems.Solving/blob/master/src/test/java/unionFind/LintCode178Test.java">Test</a>
    </p>
    <p><b>Description: </b>Use union find to decide if the given 2-D array holds a valid tree. There should have and only have exactly one common father after 
    the uninon find "connect" operation for each edges. Otherwise, there can have more than one tree from the input.</p>
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

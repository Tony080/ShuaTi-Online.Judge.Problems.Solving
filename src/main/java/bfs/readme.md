# Breadth First Search(BFS)
Wiki: https://en.wikipedia.org/wiki/Breadth-first_search
## 1. Basic BFS
<div>
    <p>
        1. 
        <a href="https://www.lintcode.com/problem/check-full-binary-tree/description">LintCode 726</a>:  
        <a href="https://github.com/Tony-Hu/ShuaTi-Online.Judge.Problems.Solving/blob/master/src/main/java/bfs/LintCode726.java">Answer</a>, 
        <a href="https://github.com/Tony-Hu/ShuaTi-Online.Judge.Problems.Solving/blob/master/src/test/java/bfs/LintCode726Test.java">Test</a>
    </p>
    <p><b>Description: </b>Basic BFS + Tree childs not empty.</p>
</div>

## 2. BFS level traversal
//TODO

## 3. BFS with set
<div>
    <p>
        1. 
        <a href="https://www.lintcode.com/problem/connected-component-in-undirected-graph/description">LintCode 431</a>:  
        <a href="https://github.com/Tony-Hu/ShuaTi-Online.Judge.Problems.Solving/blob/master/src/main/java/bfs/LintCode431.java">Answer</a>, 
        <a href="https://github.com/Tony-Hu/ShuaTi-Online.Judge.Problems.Solving/blob/master/src/test/java/bfs/LintCode431Test.java">Test</a>
    </p>
    <p><b>Description: </b>Outer node list traversal + inner BFS + set.</p>
</div>
<div>
    <p>
        2. 
        <a href="https://www.lintcode.com/problem/route-between-two-nodes-in-graph/description">LintCode 176</a>:  
        <a href="https://github.com/Tony-Hu/ShuaTi-Online.Judge.Problems.Solving/blob/master/src/main/java/bfs/LintCode176.java">Answer</a>, 
        <a href="https://github.com/Tony-Hu/ShuaTi-Online.Judge.Problems.Solving/blob/master/src/test/java/bfs/LintCode176Test.java">Test</a>
    </p>
    <p><b>Description: </b>Start from starting node <code>s</code>, use BFS to search if there has a path from <code>s</code> to <code>t</code>. 
    <code>Set</code> is introduced to avoid traversing same node twice.</p>
</div>

## 4. BFS level traversal with set
<div>
    <p>
        1. 
        <a href="https://www.lintcode.com/problem/knight-shortest-path-ii/description">LintCode 630</a>:  
        <a href="https://github.com/Tony-Hu/ShuaTi-Online.Judge.Problems.Solving/blob/master/src/main/java/bfs/LintCode630.java">Answer</a>, 
        <a href="https://github.com/Tony-Hu/ShuaTi-Online.Judge.Problems.Solving/blob/master/src/test/java/bfs/LintCode630Test.java">Test</a>
    </p>
    <p><b>Description: </b>Use the input 2-D boolean array as the set.</p>
</div>
<div>
    <p>
        2. 
        <a href="https://www.lintcode.com/problem/01-matrix-walking-problem/description">LintCode 1446</a>:  
        <a href="https://github.com/Tony-Hu/ShuaTi-Online.Judge.Problems.Solving/blob/master/src/main/java/bfs/LintCode1446.java">Answer</a>, 
        <a href="https://github.com/Tony-Hu/ShuaTi-Online.Judge.Problems.Solving/blob/master/src/test/java/bfs/LintCode1446Test.java">Test</a>
    </p>
    <p><b>Description: </b>Create a separate 3-D set to record 2 info: 1) If the given point has been visited(Saved in <code>set[x][y][0]</code>). 2) If the previous visit has already change(turn) a wall before visit the given point
    (Saved in <code>set[x][y][1]</code>).<br>
    Basically, <code>set[x][y][0] && !set[x][y][1]</code> means that point has been visited and there is no better way to visit this point. Treat as "closed". <br>
    If the point has been visited(<code>set[x][y][0]</code> is <code>true</code>), but that visit has changed the wall before(<code>set[x][y][0]</code> also <code>true</code>), the point shall remain available for the next visit which didn't change(turn) a wall before.</p>
</div>
<div>
    <p>
        3. 
        <a href="https://www.lintcode.com/problem/portal/description">LintCode 750</a>:  
        <a href="https://github.com/Tony-Hu/ShuaTi-Online.Judge.Problems.Solving/blob/master/src/main/java/bfs/LintCode750.java">Answer</a>, 
        <a href="https://github.com/Tony-Hu/ShuaTi-Online.Judge.Problems.Solving/blob/master/src/test/java/bfs/LintCode750Test.java">Test</a>
    </p>
    <p><b>Description: </b>create a 2-D boolean array to use as the set to avoid go to the same step twice. Use level traversal to find the shortest steps to the exit.</p>
</div>

## 5. BFS level traversal with color(2-color, 3-color and etc.)
<div>
    <p>
        1. 
        <a href="https://www.lintcode.com/problem/is-graph-bipartite/description">LintCode 1031</a>:  
        <a href="https://github.com/Tony-Hu/ShuaTi-Online.Judge.Problems.Solving/blob/master/src/main/java/bfs/LintCode1031.java">Answer</a>, 
        <a href="https://github.com/Tony-Hu/ShuaTi-Online.Judge.Problems.Solving/blob/master/src/test/java/bfs/LintCode1031Test.java">Test</a>
    </p>
    <p><b>Description: </b>An <code>int</code> array is used to store color. Initially the nodes are all uncolored. Marked as <code>1</code>. Then, starting to mark the first node to traverse as <code>1</code>. Then mark the connected node's color as <code>2</code>. If there exists a way to perctly split the entire graph node into 
    <code>1</code> and <code>2</code>, accept. If there is a conflict when marking color, reject.<br>
    Notice that, there may have multiple graphs in the given dataset.</p>
</div>
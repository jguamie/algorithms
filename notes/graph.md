# Graph Notes
A majority of graph algorithms are derivatives of Depth First Search (DFS) or Breadth First Search (BFS).
## Depth First Search (DFS)
```
void main()
  for (vertex i : graph)
    if (!visited[i]) dfs(i)

void dfs(i)
  visited[i] = true;
  for (vertex j : adjacencyList[i])
    if (!visited[j]) dfs(j)
```
## Algorithms from DFS
### Directed Acyclic Graph (DAG) Check
``` diff
void main()
  for (vertex i : graph)
-   if (!visited[i]) dfs(i)
+   if (dfs(i)) return true
+ return false

// dfs returns true if cycle is present, otherwise returns false
boolean dfs(i)
+ if (cycle[i]) return true
+ if (visited[i]) return false
+ cycle[i] = true
  visited[i] = true;
  for (vertex j : adjacencyList[i])
-   if (!visited[j]) dfs(j)
+   if (dfs(j)) return true
+ cycle[i] = false
+ return false
```
### Topological Sort
``` diff
void main()
  for (vertex i : graph)
    if (!visited[i]) dfs(i)

void dfs(i)
  visited[i] = true;
  for (vertex j : adjacencyList[i])
    if (!visited[j]) dfs(j)
+ postorderStack.push(i)
```
## Breadth First Search (BFS)
```
void main()
  for (vertex i : graph)
    if (!visited[i]) bfs(i)

void bfs(i)
  visited[i] = true;
  queue.offer(i)
  while (!queue.isEmpty())
    j = queue.poll()
    for (vertex k : adjacencyList[j])
      if (!visited[k])
        visited[k] = true
        queue.add(k)
```

# Graph Notes
A majority of graph algorithms are derivatives of Depth First Search (DFS) or Breadth First Search (BFS).
## Depth First Search (DFS)
```
void main()
  for (vertex i : graph)
    if (!visited[i]) dfs(i)

void dfs(i)
  visited[i] = true
  for (vertex j : adjacencyList[i])
    if (!visited[j]) dfs(j)
```
## Algorithms from DFS
### Bipartite
``` diff
void main()
+ isBipartite = true
  for (vertex i : graph)
    if (!visited[i]) dfs(i)

void dfs(i)
  visited[i] = true
  for (vertex j : adjacencyList[i])
    if (!visited[j])
+     color[j] = !color[i]
      dfs(j)
+   else if (color[j] == color[i])
+      isBipartite = false
```
### Connected Components
Connected components will have the same `id`.
``` diff
void main()
  for (vertex i : graph)
    if (!visited[i]) dfs(i)
+   id++

void dfs(i)
  visited[i] = true
+ component[i] = id
  for (vertex j : adjacencyList[i])
    if (!visited[j]) dfs(j)
```
### Directed Acyclic Graph (DAG) Check
`dfs` returns true if cycle is present, otherwise returns false
``` diff
void main()
  for (vertex i : graph)
-   if (!visited[i]) dfs(i)
+   if (dfs(i)) return true
+ return false

boolean isCyclic(i)
+ if (cycle[i]) return true
+ if (visited[i]) return false
+ cycle[i] = true
  visited[i] = true
  for (vertex j : adjacencyList[i])
-   if (!visited[j]) dfs(j)
+   if (isCyclic(j)) return true
+ cycle[i] = false
+ return false
```
### Topological Sort
`postorderStack` will contain the topological sort order.
``` diff
void main()
  for (vertex i : graph)
    if (!visited[i]) dfs(i)

void dfs(i)
  visited[i] = true
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
  visited[i] = true
  queue.offer(i)
  while (!queue.isEmpty())
    j = queue.poll()
    for (vertex k : adjacencyList[j])
      if (!visited[k])
        visited[k] = true
        queue.add(k)
```

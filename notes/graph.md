# Graph Notes
A majority of graph algorithms are derivatives of Depth First Search (DFS) or Breadth First Search (BFS).
## Depth First Search (DFS)
```
main()
  for (vertex i : graph)
    if (!visited[i]) dfs(i)

dfs(i)
  visited[i] = true;
  for (vertex j : adjacencyList[i])
    if (!visited[j]) dfs(j)
```
## Algorithms from DFS
### Topological Sort
``` diff
main()
  for (vertex i : graph)
    if (!visited[i]) dfs(i)

dfs(i)
  visited[i] = true;
  for (vertex j : adjacencyList[i])
    if (!visited[j]) dfs(j)
+ postorderStack.push(i)
```
## Breadth First Search (BFS)
```
main()
  for (vertex i : graph)
    if (!visited[i]) bfs(i)

bfs(i)
  visited[i] = true;
  queue.offer(i)
  while (!queue.isEmpty())
    j = queue.poll()
    for (vertex k : adjacencyList[j])
      if (!visited[k])
        visited[k] = true
        queue.add(k)
```

# Backtrack

## All possible permutations (n!)
```
 void main(array)
    backtrack(array, 0, array.length - 1) 

 void backtrack(array l r)
    if l == r result.add(array)
    for (int i = r; i <= r; i++)
       swap(array, l, i)
       backtrack(array, l + 1, rhs)
       swap(array, l, i)
```

# Sorts
## Merge Sort
Time complexity: O(n log n) for worst, average and best case.<br/>
Space complexity: O(n)
```
void mergeSort(array, lo, hi)
   if (lo < hi)
      mid = (lo + hi) / 2
      // alternative: mid = lo + (hi - lo) / 2
      mergeSort(array, lo, mid)
      mergeSort(array, mid + 1, hi)
      merge(array, lo, mid, hi)

void merge(array, lo, mid, hi)
   int i = lo, j = hi
   for (int k = lo; k <= hi; k++)
      temp[k] = array[k]
   for (int k = lo; k <= hi; k++)
      if (i > mid)
         a[k] = temp[j++]
      else if (j > hi)
         a[k] = temp[i++]
      else if (temp[j] < temp[i])
         a[k] = temp[j++]
      else
         a[k] = temp[i++]
```
## Quick Sort
Time complexity: O(n log n) for average and best case. O(n<sup>2</sup>) for worst case.<br/>
Space complexity: O(log n) for in-place.<br/>
`pi` is the partitioning index.
```
void quickSort(array, lo, hi)
   if (lo < hi)
      int pi = partition(array, lo, hi)
      quickSort(array, lo, pi - 1)
      quickSort(array, pi + 1, hi)

int partition(array, lo, hi)
   int pivot = array[hi]
   int i = lo
   for (int j = lo; j < hi; j++)
      if (array[j] <= pivot)
         swap(array[i], array[j])
         i++
   swap(array[i], array[hi])
   return i
```

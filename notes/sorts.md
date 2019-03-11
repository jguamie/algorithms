# Sorts
## Merge Sort
Time complexity: O(n log n) for worst, average and best case.
Space complexity: O(n)
```
void mergeSort(array, left, right)
   if (left < right)
      middle = (left + right) / 2
      mergeSort(array, left, middle)
      mergeSort(array, middle + 1, right)
      merge(array, left, middle, right)
```
## Quick Sort
Time complexity: O(n log n) for average and best case. O(n<super>2</super>) for worst case.
Space complexity: O(log n) for in-place.
`pi` is the partitioning index.
```
void quickSort(array, low, high)
   if (low < high)
      pi = partition(array, low, high)
      quickSort(array, low, pi - 1) 
      quickSort(array, pi + 1, high)
```
